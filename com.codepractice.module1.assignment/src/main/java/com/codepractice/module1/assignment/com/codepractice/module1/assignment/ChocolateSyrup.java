package com.codepractice.module1.assignment.com.codepractice.module1.assignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrupFlavour.env", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate";
    }
}
