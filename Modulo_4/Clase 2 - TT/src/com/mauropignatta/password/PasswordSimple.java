package com.mauropignatta.password;

public class PasswordSimple extends Password{

    public PasswordSimple() {
        super("([a-zA-Z0-9_!@#$%^&*]){5,}");
    }

}
