package com.Kotori;

import org.springframework.stereotype.Component;

@Component("GoodsDao")
public class GoodsDao {
    public void save(){
        System.out.println("GoodsDao-save");
    }

}
