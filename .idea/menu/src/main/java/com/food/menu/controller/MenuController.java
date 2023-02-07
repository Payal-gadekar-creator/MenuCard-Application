package com.food.menu.controller;

import java.util.List;

import com.food.menu.Entity.MenuCard;
import com.food.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost/9093")
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    //add menu
    @PostMapping
    public MenuCard addMenu(@RequestBody MenuCard menuCard){
	return menuService.addDish(menuCard);
    }
    //get menu
    @GetMapping
    public List<MenuCard>getDish(){
        return menuService.getDish();
    }

    //update menu
    @PutMapping("/{id}")
    public String updateMenu(@PathVariable("id")String menuId,@RequestBody MenuCard menuCard) {
        return menuService.updateMenu(menuId,menuCard);
    }
    //delete menu
     @DeleteMapping("/{id}")
             public String deleteMenu(@PathVariable("id")String menuId) {
        return menuService.deleteMenu(menuId);
     }
}
