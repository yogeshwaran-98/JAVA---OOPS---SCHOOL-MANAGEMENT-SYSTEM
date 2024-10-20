package com.example.oops.principles.models;

public class Person {

    private String name ;
    private int id;
    private String address;
    private String phoneNumber;

    public Person(String name , int id , String address , String phoneNumber){
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Address: " + address + ", Phone: " + phoneNumber);
    }

}
