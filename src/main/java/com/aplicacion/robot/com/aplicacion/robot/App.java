package com.aplicacion.robot.com.aplicacion.robot;

import java.util.List;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	try { 
    		//PARAMETRIZACION DE WEBDRIVER
        	System.setProperty("webdriver.chrome.driver",
        	           "D:/Users/monvilla/Documents/1_DOCUMENTOS LABORALES/CERTIFICACION/Capacitacion Git/DevOpsAutomaticWorld/DevOpsAutomaticWorld/chromedriver.exe");
        		//INSTANCIACION DEL OBJETO BASE
            WebDriver driver = new ChromeDriver();

            //SET URL
            driver.get("https://www.grupobancolombia.com/wps/portal/personas");
            
            
            WebElement element = driver.findElement(By.xpath("//*[@id=\"footer-content\"]/div[1]/div/div/div[4]/div/a"));
            element.click();
            
            element = driver.findElement(By.id("srch-term"));
            element.sendKeys("Diagonal 75d # 4a-55");
            element = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/div[1]/div/button"));
            element.click();
            Thread.sleep(10000);

            element = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/div[6]/div[1]/div/div[1]/button"));
            element.click();
            
        
            
		} catch (Exception e) {
			System.out.print("EXCEPCION"+e.getMessage());
		}

    	
        
    }
}
