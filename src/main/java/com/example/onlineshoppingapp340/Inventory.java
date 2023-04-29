package com.example.onlineshoppingapp340;

import java.sql.*;
import java.util.ArrayList;

public class Inventory {

    private ArrayList <Item> items;

    public Inventory ()
    {
        this.items = GetInventory();
    }

    private Connection connect() {
        String db = "jdbc:sqlite:dependencies/sqlite-tools/OnlineShopping.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(db);
        } catch (SQLException e) {
            System.out.println((e.getMessage()));
        }
        return conn;
    }

    public void AddToInventory(int vendorID, String name, int wholesaleCost, int retailCost, int stock)
    {
        String sql = "INSERT INTO item (vendor_id, name, wholesale_cost, retail_cost, count) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect())
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, vendorID);
            stmt.setString(2, name);
            stmt.setInt(3, wholesaleCost);
            stmt.setInt(4, retailCost);
            stmt.setInt(5, stock);

            stmt.executeUpdate();
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void RemoveFromInventory(int id)
    {
        String sql = "DELETE FROM item WHERE id = ?";

        try (Connection conn = this.connect())
        {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private ResultSet QueryAll()
    {
        String sql = "SELECT * FROM item";

        try (Connection conn = this.connect())
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList <Item> GetInventory ()
    {
        try {
            ResultSet inventoryQuery = this.QueryAll();
            ArrayList <Item> inventory = new ArrayList<Item>();
            while (inventoryQuery.next())
            {
                int ID = inventoryQuery.getInt("id");
                int vendorID = inventoryQuery.getInt("vendor_id");
                String name= inventoryQuery.getString("name");
                int wholesaleCost = inventoryQuery.getInt("wholesale_cost");
                int retailCost = inventoryQuery.getInt("retail_cost");
                int stock = inventoryQuery.getInt("count");

                Item tempItem = new Item(ID, vendorID, name, wholesaleCost, retailCost, stock);
                inventory.add(tempItem);
            }
            return inventory;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
