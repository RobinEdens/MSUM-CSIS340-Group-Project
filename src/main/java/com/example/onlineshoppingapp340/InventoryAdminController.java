package com.example.onlineshoppingapp340;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InventoryAdminController {

    private Inventory inv;
    private RequestMethod reqMethod;

    public InventoryAdminController()
    {
        this.inv = new Inventory();

    }

    @GetMapping("/inventory_admin")
    public String inventory() { return "inventory_admin.html";}



    @PostMapping("/inventory_add")
    public @ResponseBody void inventory_add (@ModelAttribute("item") Item item, BindingResult bindingResult,Model model)
    {
        inv.AddToInventory(item.getVendorID(), item.getName(), item.getWholesaleCost(), item.getRetailCost(), item.getStock());
    }

    @PostMapping("/inventory_remove")
    public @ResponseBody void inventory_remove (@ModelAttribute("item") Item item, BindingResult bindingResult, Model model) {
        inv.RemoveFromInventory(item.getID());
    }
}
