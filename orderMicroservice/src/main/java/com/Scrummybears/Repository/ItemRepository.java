package com.Scrummybears.Repository;

import com.Scrummybears.OrderModel.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository <Item, String>{

    public List<Item> findByItemId(Long itemId);
    public List<Item> deleteByItemId(Long itemId);


}