package com.food.menu.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MenuCard")
public class MenuCard {

   // @GeneratedValue(strategy =GenerationType.AUTO)
    @Id
    private String menuId;

    private String dish_Name;

    private String price;

    private String type;

    public MenuCard(int i, String pav_bhaji, int i1, String veg) {
    }

    public MenuCard(String menuId, String dish_Name, String price, String type) {
        this.menuId = menuId;
        this.dish_Name = dish_Name;
        this.price = price;
        this.type = type;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getDish_Name() {
        return dish_Name;
    }

    public void setDish_Name(String dish_Name) {
        this.dish_Name = dish_Name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "MenuCard{" +
                "menuId='" + menuId + '\'' +
                ", dish_Name='" + dish_Name + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
