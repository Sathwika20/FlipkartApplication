package com.bridgelabz;

import org.openqa.selenium.By;


public class FlipkartLogin extends BaseClass {


    public void getUserName() {
        driver.findElement(By.xpath("//span[text() = 'Enter Email/Mobile number']")).sendKeys("7989216041");


    }

    public void getPassword() {
        driver.findElement(By.xpath("//span[text() = 'Enter Password']")).sendKeys("ABCdef123");

    }

    public void getLoginButton() {
        driver.findElement(By.xpath("//button[text() = 'Login']")).click();


    }

}
