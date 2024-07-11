package com.codepractice.module1.assignment.com.codepractice.module1.assignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "frostingFlavour.env" , havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
