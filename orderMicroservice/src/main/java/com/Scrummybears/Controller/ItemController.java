package com.Scrummybears.Controller;

import com.Scrummybears.OrderModel.Item;
import com.Scrummybears.OrderModel.Order;
import com.Scrummybears.Service.ItemService;
import com.Scrummybears.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;


@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/cartSummary", method = { RequestMethod.GET, RequestMethod.POST })
    public ResponseEntity<Object> postItem( @RequestBody Item item ){
        Item i = itemService.postItem(item);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/getOrderPage")
    public String mainWithParam(Model model) throws ExecutionException, InterruptedException {
        List<Item> list = itemService.getAll();
        model.addAttribute("items", list);
        return "index";
    }

    @RequestMapping(value = "/deleteItem/{itemId}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable Long itemId){
        itemService.deleteByItemId(itemId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/orderReview")
    public String index2 (Model model) {
        List<Item> list = itemService.getAll();
        model.addAttribute("items", list);
        return "index2";
    }



}




