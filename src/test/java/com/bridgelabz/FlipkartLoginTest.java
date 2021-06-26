package com.bridgelabz;

import org.testng.annotations.Test;
public class FlipkartLoginTest extends BaseClass {

    FlipkartLogin login = new FlipkartLogin();


    @Test
    public void get_UserName() throws InterruptedException {
        login.getUserName();
    }
}


