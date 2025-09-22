package edu.study.problem4;

import java.time.LocalDate;
import java.util.*;

public class Cafe {

    List<MenuItem> menuItems = new ArrayList<>();
    List<Order> orders = new ArrayList<>();



    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    public void printMenu(){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.print((i + 1) + ". ");
            System.out.println(menuItems.get(i));
        }
    }

    public void placeOrder(Order item){
        orders.add(item);
    }

    public int getSalesByDate(LocalDate time){
        return 0;
    }

    public void getTopSellingItems(){

    }

}
