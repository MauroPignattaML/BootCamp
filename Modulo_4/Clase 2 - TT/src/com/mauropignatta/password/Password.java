package com.mauropignatta.password;

import java.util.regex.Pattern;

public class Password {

    private String regex;
    public String value;

    public Password(String regex) {
        setRegex(regex);
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) throws Exception{
        if(!Pattern.matches(regex, value)){
            throw new Exception("El valor no concuerda con la expresion regular.");
        }
        this.value = value;
    }
}
