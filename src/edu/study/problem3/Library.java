package edu.study.problem3;

import java.util.*;

public class Library {

    List<Borrowable> items = new ArrayList<>();

    public void addItem(Borrowable item){
        items.add(item);
        if (item instanceof Book){
            System.out.println(((Book) item).getTitle() + " [도서] 자료가 추가되었습니다.");
        }
        if(item instanceof DVD){
            System.out.println(((DVD) item).getTitle() + " [DVD] 자료가 추가되었습니다.");
        }
        if(item instanceof DVD){
            System.out.println(((DVD) item).getTitle() + " [잡지] 자료가 추가되었습니다.");
        }
    }

    public void listAllItems(){
        System.out.println("=== 전체 대출 가능 자료 ===");
        for(int i = 0;i<items.size();i++){
            System.out.print((i + 1) + ".");
            System.out.println(items.get(i));
        }
    }

    public void listBorrowedItemsByType(Class<DVD> item){
        System.out.println("=== 현재 대출 중인 DVD 목록 ===");
        if(!items.contains(item)){
            System.out.println(items.get(item.getModifiers()));
        }
    }


    /*
     * 특정 자료만 필터링하여 보여주는 메서드 어떻게...??
     *
     * getModifiers() 이거는 어떨때 사용하는 거지...?
     * */

}
