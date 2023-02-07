package com.food.menu.repository;


import com.food.menu.Entity.MenuCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuCard, String> {
}
