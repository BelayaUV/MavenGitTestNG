package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Second {
    public class SecondTest {

        private WebDriver driver;

        @BeforeClass
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        @AfterClass
        public void finish(){
            driver.quit();

        }

        @Test
        public void openGoogle(){
            driver.get("https://www.google.by");
        }


    }
}
