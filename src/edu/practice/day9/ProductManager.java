package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<String, String> productMap = new HashMap<>();
    Map<String, Integer> priceMap = new HashMap<>();

    public ProductManager() {
        productMap = new HashMap<>();
        priceMap = new HashMap<>();

        productMap.put("P001","프로");
        priceMap.put("P001",150000);
    }

    void addProduct(String productId, String productName, int price){
        if(productMap.containsKey(productId)){
            System.out.println("이미 존재하는 상품입니다.");
        } else {
            System.out.println(productName + " 상품이 추가되었습니다.");
            productMap.put(productId, productName);
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
        if(productMap.isEmpty()){
            System.out.println("등록된 상품이 없습니다.");
        }else{
            System.out.println(productMap);
        }

    }

    void removeProduct(String productId){
        if(productMap.containsKey(productId)){
            String productName = productMap.get(productId);
            productMap.remove(productId);
            System.out.println(productName + " 상품이 삭제되었습니다.");
        }else{
            System.out.println("삭제할 상품이 없습니다.");
        }
    }

}
