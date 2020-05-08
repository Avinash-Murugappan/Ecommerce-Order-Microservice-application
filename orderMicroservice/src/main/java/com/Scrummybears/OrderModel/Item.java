package com.Scrummybears.OrderModel;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Document
@Data

public class Item {
    @Id
    Long itemId;
    String title;
    String description;
    Double price;

    public Item(Long itemId, String title, String description, Double price) {
        this.itemId = itemId;
        this.title = title;
        this.description = description;
        this.price = price;
    }



    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return "Item{" +
                " ItemId='" + itemId + '\'' +
                ", Title='" + title + '\'' +
                ", Description='" + description + '\'' +
                ", Price='" + price +
                '}';
    }

}
