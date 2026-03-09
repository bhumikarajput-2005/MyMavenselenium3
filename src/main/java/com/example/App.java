package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);

        driver.findElement(By.id("login_field")).sendKeys("bhumikarajput-2005");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("bhumikar@2005");
        Thread.sleep(5000);
        driver.findElement(By.id("commit")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
