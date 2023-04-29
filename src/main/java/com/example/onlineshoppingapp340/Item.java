package com.example.onlineshoppingapp340;

public class Item {
    private int ID;
    private int vendorID;
    private String name;

    private int wholesaleCost;

    private int retailCost;

    private int stock;
    public Item ()
    {
    }

    public Item(int ID, int vendorID, String name, int wholesaleCost, int retailCost, int stock) {
        this.ID = ID;
        this.vendorID = vendorID;
        this.name = name;
        this.wholesaleCost = wholesaleCost;
        this.retailCost = retailCost;
        this.stock = stock;
    }

    public int getID() {
        return ID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public String getName() {
        return name;
    }

    public int getWholesaleCost() {
        return wholesaleCost;
    }

    public int getRetailCost() {
        return retailCost;
    }

    public int getStock() {
        return stock;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWholesaleCost(int wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    public void setRetailCost(int retailCost) {
        this.retailCost = retailCost;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", vendorID=" + vendorID +
                ", name='" + name + '\'' +
                ", wholesaleCost=" + wholesaleCost +
                ", retailCost=" + retailCost +
                ", stock=" + stock +
                '}';
    }
}
