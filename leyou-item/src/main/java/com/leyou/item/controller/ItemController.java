package com.leyou.item.controller;

import com.leyou.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/save")
    public Long saveItem(@RequestParam("id") Long id){
        return itemService.saveItem(id);
    }


    @GetMapping("/test")
    public String get(){
        System.out.println("dddddddd");
        return "success";
    }

}