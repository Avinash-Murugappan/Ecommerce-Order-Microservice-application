package com.Scrummybears.Service;

import com.Scrummybears.OrderModel.Item;
import com.Scrummybears.OrderModel.Order;
import com.Scrummybears.Repository.ItemRepository;
import com.Scrummybears.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

@Autowired
private OrderRepository orderRepository;


    //Create Order
    public Order create(String fullName, String email, String address, String city, String state, int zip, String nameOnCard, int CCNum, int expMon, int expYear, int CVV){
        return orderRepository.save(new Order(fullName, email, address, city, state, zip, nameOnCard, CCNum, expMon, expYear, CVV));
    }


    //Retrieve Operations
    public List<Order> getAll(){
        return orderRepository.findAll();

    }

    //Delete All
    public void deleteAll(){

        orderRepository.deleteAll();
    }

    //get order information by full name
    public List<Order> findByFullName(String fullName)
    {
        return orderRepository.findAllByFullName(fullName);
    }

    public List<Order> findByCity(String city){
        return orderRepository.findByCity(city);
    }

    public  List<Order> findByEmail(String email){
        return orderRepository.findByEmail(email);
    }


}
