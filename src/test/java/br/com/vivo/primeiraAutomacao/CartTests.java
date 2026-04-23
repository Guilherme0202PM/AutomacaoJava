package br.com.vivo.primeiraAutomacao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTests {

    @Test
    public void testCreateCart(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navega entre tela
        driver.get("https://store.vivo.com.br/");

        driver.findElement(By.xpath("//button[@id='consent']")).click();

        driver.findElement(By.xpath("//a[@title='Celulares']")).click();

        driver.findElement(By.xpath("//a[@title='Celulares']")).click();


        //Encerra o processo do chromeDriver no Windows
        driver.quit();
    }
}
