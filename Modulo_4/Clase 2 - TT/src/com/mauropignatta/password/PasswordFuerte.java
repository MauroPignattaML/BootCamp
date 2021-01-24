package com.mauropignatta.password;

public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("([a-zA-Z0-9_!@#$%^&*]){12,}");
    }

}
