package com.food.menu;

import com.food.menu.Entity.MenuCard;
import com.food.menu.repository.MenuRepository;
import com.food.menu.service.MenuService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class MenuCardApplicationTests {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
 						}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}
	@BeforeEach
	static void setUp() throws Exception{
	}
	@AfterEach
	static void tearDown() throws Exception{
	}
	@Mock
	MenuRepository menuRepository;
	@InjectMocks
	MenuService menuService;

	public List<MenuCard> c;

	@Test
	@Order(1)
	public void test_createMenu()
	{
		MenuCard c = new MenuCard(1, "pav bhaji",120, "veg");
		 Mockito.when(menuRepository.save(c)).thenReturn(c);
		 MenuCard actual=menuService.save(c);
		 assertEquals(c,actual);
	}
	public void test_getMenu()
	{
		List<MenuCard> c=menuRepository.findAll();
		Mockito.when(menuRepository.findAll()).thenReturn(c);
		List<MenuCard> actual=menuService.getDish();
		assertEquals(c,actual);
		assertEquals(c.size(),actual.size());

	}

}
