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
                new FoodModel("Somali Cat - B??nh Ng???t & Tr?? S???a Online","10 Nga??ch 149 Ngo?? 192 L?? Tro??ng T????n, Ho??ng Mai, H?? N???i",R.drawable.hinh_somalicat,BusinessType.BISTRO,Time.ALLDAY,15f,10f),
                new FoodModel("Ti???m B??nh Emoji - B??ng Lan Tr???ng Mu???i & ????? U???ng Online","78 C???u Gi???y, P. Quan Hoa, C???u Gi???y, H?? N???i",R.drawable.hinh_tiembanhemoji,BusinessType.SHOP_ONLINE,Time.ALLDAY,5f,5f),
                new FoodModel("Sweetc Hut - Ti???m B??nh Online","14A Ng?? 301 Tr?????ng Chinh, Thanh Xu??n, H?? N???i",R.drawable.hinh_sweetc,BusinessType.SHOP_ONLINE,Time.ALLDAY,4f,12f),
                new FoodModel("Minh Ho??ng Bakery - B??ng Lan Tr???ng Mu???i & ????? U???ng Online","58 Nguy???n ?????ng Chi, Nam T??? Li??m, H?? N???i",R.drawable.hinh_minhhoangbakery,BusinessType.SHOP_ONLINE,Time.MORNING,7f,8f),
                new FoodModel("B??nh Sinh Nh???t Th???o My - Shop Online","Ng?? 52 S??? Nh?? 8 M??? ????nh, Nam T??? Li??m, H?? N???i",R.drawable.hinh_banhsinhnhat,BusinessType.BISTRO,Time.NIGHT,10f,10f),
                new FoodModel("Ph????ng Min - B??ng Lan Tr???ng Mu???i Online","5 H??ng M???m, Ho??n Ki???m, H?? N???i",R.drawable.hinh_phuongmin,BusinessType.BISTRO,Time.NOON,12f,10f),
                new FoodModel("Luna Bakery - Shop Online","145 ???????ng 19/5, P. V??n Qu??n, H?? ????ng, H?? N???i",R.drawable.hinh_lunabakery,BusinessType.SHOP_ONLINE,Time.ALLDAY,40f,4f),
                new FoodModel("B???p M??? Pun - B??nh Sinh Nh???t, B??nh Gato, B??nh Kem & Bakery","S??? 20 Ng?? 195, ???????ng H???ng H??, P. Ph??c T??n, Ho??n Ki???m, H?? N???i",R.drawable.hinh_bepmepun,BusinessType.BISTRO,Time.ALLDAY,20f,10f),
                new FoodModel("Phong Huy - Ti???m B??nh Kem","124 ?????nh C??ng Th?????ng, Ho??ng Mai, H?? N???i",R.drawable.hinh_phonghuy,BusinessType.BISTRO,Time.MORNING,30f,12f),
                new FoodModel("B??nh Ng???t H???ng K??ng - Gi???ng V??","149 Gi???ng V??, Ba ????nh, H?? N???i",R.drawable.hinh_banhngothongkong,BusinessType.RESTAURANT,Time.NOON,30f,10f),
                new FoodModel("C?? P??o N?? Bakery - B??nh Sinh Nh???t - H???ng H??","10 Ng?? 195 H???ng H??, P. Ph??c T??n, Ho??n Ki???m, H?? N???i",R.drawable.hinh_capeonebakery,BusinessType.SHOP_ONLINE,Time.ALLDAY,20f,2f),
                new FoodModel("Kem LaMilana Premium Gelato","150B B??i Th??? Xu??n, Hai B?? Tr??ng, H?? N???i",R.drawable.hinh_kemlamilana,BusinessType.SHOP_ONLINE,Time.ALLDAY,25f,10f),
                new FoodModel("Ti???m Nh?? Nga - Keto, Das, Healthy Food - Shop Online","32 Ng??ch 11 Ng?? 290 Kim M??, P. Kim M??, Ba ????nh, H?? N???i",R.drawable.hinh_tiemnhanga,BusinessType.RESTAURANT,Time.NOON,30f,10f),
                new FoodModel("B??nh Tiramisu - Shop Online","180 X?? ????n, ?????ng ??a, H?? N???i",R.drawable.hinh_banhtiramisu,BusinessType.BISTRO,Time.ALLDAY,15f,10f),
                new FoodModel("Paris G??teaux - B??nh Ng???t & Tr?? S???a - Tr???n ?????i Ngh??a","2A Tr???n ?????i Ngh??a, Hai B?? Tr??ng, H?? N???i",R.drawable.hinh_parisgateaux,BusinessType.BISTRO,Time.MORNING,50f,8f)
        );
    }
}


