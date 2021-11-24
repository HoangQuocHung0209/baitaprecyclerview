package com.example.baitaprecyclerview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FoodModel {
    private String name, address;
    private int image;
    private BusinessType businessType;
    private Time time;
    private float discount;
    private float distance;

    public FoodModel() {
    }

    public FoodModel(String name, String address, int image, BusinessType businessType, Time time, float discount, float distance) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.businessType = businessType;
        this.time = time;
        this.discount = discount;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", image=" + image +
                ", businessType=" + businessType +
                ", time=" + time +
                ", discount=" + discount +
                ", distance=" + distance +
                '}';
    }

    public static List<FoodModel> getMock(){
        return Arrays.asList(
                new FoodModel("Somali Cat - Bánh Ngọt & Trà Sữa Online","10 Ngách 149 Ngõ 192 Lê Trọng Tấn, Hoàng Mai, Hà Nội",R.drawable.hinh_somalicat,BusinessType.BISTRO,Time.ALLDAY,15f,10f),
                new FoodModel("Tiệm Bánh Emoji - Bông Lan Trứng Muối & Đồ Uống Online","78 Cầu Giấy, P. Quan Hoa, Cầu Giấy, Hà Nội",R.drawable.hinh_tiembanhemoji,BusinessType.SHOP_ONLINE,Time.ALLDAY,5f,5f),
                new FoodModel("Sweetc Hut - Tiệm Bánh Online","14A Ngõ 301 Trường Chinh, Thanh Xuân, Hà Nội",R.drawable.hinh_sweetc,BusinessType.SHOP_ONLINE,Time.ALLDAY,4f,12f),
                new FoodModel("Minh Hoàng Bakery - Bông Lan Trứng Muối & Đồ Uống Online","58 Nguyễn Đổng Chi, Nam Từ Liêm, Hà Nội",R.drawable.hinh_minhhoangbakery,BusinessType.SHOP_ONLINE,Time.MORNING,7f,8f),
                new FoodModel("Bánh Sinh Nhật Thảo My - Shop Online","Ngõ 52 Số Nhà 8 Mỹ Đình, Nam Từ Liêm, Hà Nội",R.drawable.hinh_banhsinhnhat,BusinessType.BISTRO,Time.NIGHT,10f,10f),
                new FoodModel("Phương Min - Bông Lan Trứng Muối Online","5 Hàng Mắm, Hoàn Kiếm, Hà Nội",R.drawable.hinh_phuongmin,BusinessType.BISTRO,Time.NOON,12f,10f),
                new FoodModel("Luna Bakery - Shop Online","145 Đường 19/5, P. Văn Quán, Hà Đông, Hà Nội",R.drawable.hinh_lunabakery,BusinessType.SHOP_ONLINE,Time.ALLDAY,40f,4f),
                new FoodModel("Bếp Mẹ Pun - Bánh Sinh Nhật, Bánh Gato, Bánh Kem & Bakery","Số 20 Ngõ 195, Đường Hồng Hà, P. Phúc Tân, Hoàn Kiếm, Hà Nội",R.drawable.hinh_bepmepun,BusinessType.BISTRO,Time.ALLDAY,20f,10f),
                new FoodModel("Phong Huy - Tiệm Bánh Kem","124 Định Công Thượng, Hoàng Mai, Hà Nội",R.drawable.hinh_phonghuy,BusinessType.BISTRO,Time.MORNING,30f,12f),
                new FoodModel("Bánh Ngọt Hồng Kông - Giảng Võ","149 Giảng Võ, Ba Đình, Hà Nội",R.drawable.hinh_banhngothongkong,BusinessType.RESTAURANT,Time.NOON,30f,10f),
                new FoodModel("Cá Péo Nè Bakery - Bánh Sinh Nhật - Hồng Hà","10 Ngõ 195 Hồng Hà, P. Phúc Tân, Hoàn Kiếm, Hà Nội",R.drawable.hinh_capeonebakery,BusinessType.SHOP_ONLINE,Time.ALLDAY,20f,2f),
                new FoodModel("Kem LaMilana Premium Gelato","150B Bùi Thị Xuân, Hai Bà Trưng, Hà Nội",R.drawable.hinh_kemlamilana,BusinessType.SHOP_ONLINE,Time.ALLDAY,25f,10f),
                new FoodModel("Tiệm Nhà Nga - Keto, Das, Healthy Food - Shop Online","32 Ngách 11 Ngõ 290 Kim Mã, P. Kim Mã, Ba Đình, Hà Nội",R.drawable.hinh_tiemnhanga,BusinessType.RESTAURANT,Time.NOON,30f,10f),
                new FoodModel("Bánh Tiramisu - Shop Online","180 Xã Đàn, Đống Đa, Hà Nội",R.drawable.hinh_banhtiramisu,BusinessType.BISTRO,Time.ALLDAY,15f,10f),
                new FoodModel("Paris Gâteaux - Bánh Ngọt & Trà Sữa - Trần Đại Nghĩa","2A Trần Đại Nghĩa, Hai Bà Trưng, Hà Nội",R.drawable.hinh_parisgateaux,BusinessType.BISTRO,Time.MORNING,50f,8f)
        );
    }
}


