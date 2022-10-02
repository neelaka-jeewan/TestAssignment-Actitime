package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEEWAN\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/");
        driver.manage().window().maximize();

    }

}