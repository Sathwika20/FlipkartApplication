package com.bridgelabz;

import org.testng.annotations.Test;
public class FlipkartLoginTest extends BaseClass {

    FlipkartLogin login = new FlipkartLogin();

    @Test
    public void get_UserName() {
        login.getUserName();
    }

    @Test
    public void get_Password() {
        login.getPassword();
    }

    @Test
    public void get_LoginButton() {
        login.getLoginButton();
    }


}


