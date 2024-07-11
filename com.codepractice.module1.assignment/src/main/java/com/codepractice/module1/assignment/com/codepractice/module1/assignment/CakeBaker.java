package com.codepractice.module1.assignment.com.codepractice.module1.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
     Syrup syrup;

    @Autowired
    Frosting frosting;

    public void cakeBake(){
        System.out.println("Cake has started baking with frosting :: " + frosting.getFrostingType() + "  and Syrup :: " +syrup.getSyrupType());
    }
}
