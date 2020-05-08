package com.Scrummybears.Service;

import com.Scrummybears.OrderModel.Item;
import com.Scrummybears.OrderModel.Order;
import com.Scrummybears.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    //add cart items to db
    public Item postItem(Item item) {

        return itemRepository.save(item);
    }
    //get items by itemId from db
    public List<Item> findByItemId(Long itemId)
    {
        return itemRepository.findByItemId(itemId);
    }
    //get all items from db
    public List<Item> getAll(){
        return itemRepository.findAll();

    }

    public List<Item> deleteByItemId(Long itemId)
    {
       return itemRepository.deleteByItemId(itemId);


    }
}

