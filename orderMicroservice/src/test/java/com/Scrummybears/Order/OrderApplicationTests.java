package com.Scrummybears.Order;


import com.Scrummybears.OrderModel.Item;
import com.Scrummybears.OrderModel.Order;
import com.Scrummybears.Repository.ItemRepository;
import com.Scrummybears.Repository.OrderRepository;
import com.Scrummybears.Service.ItemService;
import com.Scrummybears.Service.OrderService;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderApplicationTests {
	@Test
	void contextLoads() {
	}

	@Autowired
	private OrderService orderService;
	private ItemService itemService;

	@MockBean
	private OrderRepository orderRepository;
	private ItemRepository itemRepository;

	@Test
	public void getUserbyEmailTest() {
		String email = "avinash90006@gmail.com";
		when(orderRepository.findByEmail(email))
				.thenReturn(Stream.of(new Order("Avinash", "avinash90006@gmail.com", "Kitty Pozer", "Fairfax", "VA", 22030, "Avinash M", 123456, 2, 2021, 800)).collect(Collectors.toList()));
		assertEquals(1, orderService.findByEmail(email).size());
	}


}






