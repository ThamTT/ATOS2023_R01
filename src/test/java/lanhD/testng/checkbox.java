package lanhD.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class checkbox {
    @Test
    public void check(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options) ;
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
        driver.manage().window().maximize();
      //  WebElement checkboxCheckMe= driver.findElement(By.xpath("(//input[@type='checkbox'])/.."));
       // checkboxCheckMe.click();
//        WebElement checkboxAgree = driver.findElement(By.xpath("(//input[@name='checkbox-mini-0'])/.."));
//        checkboxAgree.click();
//
//
//        WebElement inputCheck= driver.findElement(By.xpath("(//input[@name='checkbox-mini-0'])/.."));
//        if(inputCheck.isSelected()){
//            checkboxAgree.click();
//        }
//
//       WebElement inphutCheckBox= driver.findElement(By.xpath("//a[normalize-space(text())='Radio buttons'][1]"));
//        inphutCheckBox.click();
//
//        WebElement rdOne= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//        rdOne.click();
//
//        WebElement rdTwo= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//
//        WebElement rdOOne= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//        if(rdOOne.isSelected()){
//            rdTwo.click();
//        }


        WebElement cbCheckboxRadio = driver.findElement(By.xpath("//a[normalize-space(text()) = 'Checkboxradio widget']"));
        cbCheckboxRadio.click();
        WebElement radioButton = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Radio buttons'])[1]"));
        radioButton.click();

        WebElement rdOne = driver.findElement(By.xpath("(//input[@type = 'radio'])[1]/.."));
        rdOne.click();

        WebElement rdTwo = driver.findElement(By.xpath("(//input[@type = 'radio'])[2]/.."));

        WebElement rdoOne = driver.findElement(By.xpath("(//input[@type = 'radio'])[1]"));
        if(rdoOne.isSelected()){
            rdTwo.click();
        }
    }








    }

