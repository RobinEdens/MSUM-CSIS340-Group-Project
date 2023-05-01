package com.example.onlineshoppingapp340;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/inventory")
public class InventoryController {


    private ArrayList<Item> items;
    private Inventory inventory;
    private RequestMethod reqMethod;

    public InventoryController () {
        this.inventory = new Inventory();
        this.items = inventory.GetInventory();
    }

    @PostMapping("/inventory")
    public @ResponseBody String inventory(Model model)
    {
        ModelAndView mav = new ModelAndView("inventory");
        mav.addObject("items", items);
        for (Item i: items)
        {
            System.out.println(items);
        }
        model.addAttribute("items", items);
        return "inventory";
    }
}
