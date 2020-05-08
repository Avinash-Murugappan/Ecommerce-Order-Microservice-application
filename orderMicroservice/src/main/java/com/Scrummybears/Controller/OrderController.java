package com.Scrummybears.Controller;

import com.Scrummybears.OrderModel.Item;
import com.Scrummybears.OrderModel.Order;
import com.Scrummybears.Repository.ItemRepository;
import com.Scrummybears.Service.ItemService;
import com.Scrummybears.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController

@RequestMapping(value = "/Order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/create", method = POST)
    public String create(@RequestParam String fullName, @RequestParam String email, @RequestParam String address, @RequestParam String city, @RequestParam String state, @RequestParam int zip, @RequestParam String nameOnCard, @RequestParam int CCNum, @RequestParam int expMon, @RequestParam int expYear, @RequestParam int CVV ){
        Order o = orderService.create(fullName, email, address, city, state, zip, nameOnCard, CCNum, expMon, expYear, CVV);
        // return o.toString();
        return "Order Created";
    }


    @RequestMapping("/get")
    public List<Order> getAll(){
        return orderService.getAll();
    }
    @RequestMapping(value = "/getItems", method = RequestMethod.GET)
    public List<Item> getItem(){
        return itemService.getAll();
    }

    @RequestMapping("/deleteAll")
    public String deleteAll(){
       orderService.deleteAll();
       return "Deleted All Records";

    }

    @RequestMapping("/hello")
    public String Avinash(){
        return "This is from rest controller. I am Avinash Arunachalam Arunachalachettier Murugappan";
    }
    
    @RequestMapping("/form")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/getBy/{fullName}")
    public List<Order> findByFullName(@PathVariable String fullName){
    return orderService.findByFullName(fullName);
    }



    @RequestMapping("/getEmail/{email}")
    public  List<Order> findByEmail(@PathVariable String email){
        return orderService.findByEmail(email);
    }

}


