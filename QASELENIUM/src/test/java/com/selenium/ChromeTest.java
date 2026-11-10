
package com.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    @Test
    public void launchChromeBrowser() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

        try {
            driver.get("https://www.google.com");

            System.out.println("Page Title: " + driver.getTitle());

            System.out.println("Browser launched successfully");

System.out.println("Manohar.K.B first Maven Project");

System.out.println("Manohar.K.B first Jenkins CICD Project");

System.out.println("Manohar.K.B first Complete Automation That's Great");


        } finally {
               Thread.sleep(3000);
            driver.quit();
        }
    }
}
