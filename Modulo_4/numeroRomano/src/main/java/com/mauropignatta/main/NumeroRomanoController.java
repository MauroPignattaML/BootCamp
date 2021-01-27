package com.mauropignatta.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.regex.Pattern;


@RestController
public class NumeroRomanoController {
    
    @GetMapping(path="/{number}")
    public String  RomanoADecimal(@PathVariable String number){

        if(!Pattern.matches("^([0-9]+)?", number)){
            return "" + number + " is not a valid number";
        }

        return getRomanNumber(Integer.parseInt(number));
    }

    private String getRomanNumber(int number) {
        Map<String, Integer> romanos = new LinkedHashMap<>();
        romanos.put("M", 1000);
        romanos.put("CM", 900);
        romanos.put("D", 500);
        romanos.put("CD", 400);
        romanos.put("C", 100);
        romanos.put("XC", 90);
        romanos.put("L", 50);
        romanos.put("XL", 40);
        romanos.put("X", 10);
        romanos.put("IX", 9);
        romanos.put("V", 5);
        romanos.put("IV", 4);
        romanos.put("I", 1);

        StringBuilder result = new StringBuilder();
        while(number > 0){
            for(Map.Entry<String, Integer> romano : romanos.entrySet()){
                if(number >= romano.getValue()){
                    number -= romano.getValue();
                    result.append(romano.getKey());
                    break;
                }
            }
        }
        return result.toString();
    }

    
}
