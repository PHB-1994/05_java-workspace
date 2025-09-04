package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<String, String> productMap = new HashMap<>();
    Map<String, Integer> priceMap = new HashMap<>();

    void addProduct(String productId, String productName, int price){
        if(productMap.containsKey(productId)){
            System.out.println("이미 존재하는 상품입니다.");
        } else {
            System.out.println(productName + " 상품이 추가되었습니다.");
            productMap.get(productName);
            priceMap.put(productId, price);
        }
    }

    void searchProduct(String productId){
        if(productMap.containsKey(productId)){
            System.out.println("상품 ID : " + productId +
                    ", 상품명 : " + productMap.get(productId) +
                    ", 가격 : " + priceMap.get(productId));
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    void displayAllProducts(){
        System.out.println("=== 전체 상품 목록 ===");
    }

    void removeProduct(String productId){}

}
