package com.example.baitaprecyclerview;

public enum Time {
    MORNING("Ăn sáng"),NOON("Ăn trưa"),NIGHT("Ăn tối"),ALLDAY("Cả ngày");
    private final String name;
    Time(String text) {
        name=text;
    }
    public String toString(){
        return name;
    }
}
