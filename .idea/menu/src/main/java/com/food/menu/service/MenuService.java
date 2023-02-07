package com.food.menu.service;

import com.food.menu.Entity.MenuCard;
import com.food.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    public MenuRepository menuRepository;
    //ADD DISH
    public MenuCard addDish(MenuCard menuCard)
    {
      return menuRepository.save(menuCard);
    }
    //GET ALL
    public List<MenuCard>getDish()
    {
        return menuRepository.findAll();
    }

    //get by id
//    public MenuCard get(int menuId){
//        return menuRepository.findById(menuId);
//    }
    //UPDATE MENU
    public String updateMenu(String menuId,MenuCard menuCard) {
        MenuCard menuCard1;
        if (menuRepository.existsById(menuId)) {
            menuCard1 = menuRepository.findById(menuId).get();
            if (menuCard.getDish_Name() != null)
                menuCard1.setDish_Name(menuCard.getDish_Name());
            if (menuCard.getPrice() != null)
                menuCard1.setPrice(menuCard.getPrice());
            if (menuCard.getType() != null)
                menuCard1.setType(menuCard.getType());
            return "menu card get updated";
        }
        else {
            return "Menu Id Not Found";
        }
    }
        //DELETE MENU
        public String deleteMenu(String menuId){

            if(menuRepository.existsById(menuId)) {
                menuRepository.deleteById(menuId);
                return "menu details removed";
            }
            else
                {
                   System.out.println("Menu Not Found");
                   return "Menu Not Found!";
                }
            }

    public MenuCard save(MenuCard c) {
        return c;
    }
}

