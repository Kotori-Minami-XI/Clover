package com.Kotori;

import org.springframework.stereotype.Component;

public class GoodsDao {
    public void save(){
        System.out.println("GoodsDao-save");
    }

    public String update(){
        System.out.println("GoodsDao-update");
        int i=1/0;// Error
        return "GoodsDao-update-done";
    }

    public void delete(){
        System.out.println("GoodsDao-delete");
    }

    public void find(){
        System.out.println("GoodsDao-find");
        int i = 1/ 0;
    }
}
