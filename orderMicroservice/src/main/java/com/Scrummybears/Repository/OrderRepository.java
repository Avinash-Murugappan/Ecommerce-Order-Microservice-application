package com.Scrummybears.Repository;

import com.Scrummybears.OrderModel.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository <Order, String>{
    public List<Order> findAllByFullName(String fullName);
    public List<Order> findByCity(String city);
    public List<Order> findByEmail(String email);



}
