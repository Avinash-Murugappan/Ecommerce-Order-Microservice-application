package com.Scrummybears.OrderModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Order {
    @Id
    String Id;
    String fullName;
    String email;
    String address;
    String city;
    String state;
    int zip;
    String nameOnCard;
    int CCNum;
    int expMon;
    int expYear;
    int CVV;


  

    public Order(String fullName, String email, String address, String city, String state, int zip, String nameOnCard, int CCNum, int expMon, int expYear, int CVV) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.nameOnCard = nameOnCard;
        this.CCNum = CCNum;
        this.expMon = expMon;
        this.expYear = expYear;
        this.CVV = CVV;


    }






    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public int getCCNum() {
        return CCNum;
    }

    public void setCCNum(int CCNum) {
        this.CCNum = CCNum;
    }

    public int getExpMon() {
        return expMon;
    }

    public void setExpMon(int expMon) {
        this.expMon = expMon;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }





    @Override
    public String toString() {
        return "Order{" +
                "FullName='" + fullName + '\'' +
                ", Email='" + email + '\'' +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Zip=" + zip +
                ", NameOnCard='" + nameOnCard + '\'' +
                ", CCNum=" + CCNum +
                ", ExpMon=" + expMon +
                ", ExpYear=" + expYear +
                ", CVV=" + CVV +
                '}';
    }
}
