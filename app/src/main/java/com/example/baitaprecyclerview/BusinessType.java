package com.example.baitaprecyclerview;

public enum BusinessType {
    SHOP_ONLINE("Shop online"),BISTRO("Bistro"),RESTAURANT("Restaurant");
    private final String name;
    BusinessType(String text) {
        name=text;
    }
    public String toString(){
        return name;
    }
}
