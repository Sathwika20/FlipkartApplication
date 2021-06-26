package com.bridgelabz;

import org.openqa.selenium.By;


public class FlipkartLogin extends BaseClass {


    public void getUserName() throws InterruptedException {
        driver.switchTo().activeElement();
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7756994045");
        driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("30Login@123");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        Thread.sleep(2000);

    }

}
