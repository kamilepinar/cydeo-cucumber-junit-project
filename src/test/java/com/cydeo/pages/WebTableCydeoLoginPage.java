package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableCydeoLoginPage {

    public WebTableCydeoLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type='text']")
    public WebElement userNameBox;

    @FindBy(css ="input[name='password']" )
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    public void login(){
        this.userNameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }
    public void login(String user, String pass){
        this.userNameBox.sendKeys(user);
        this.passwordBox.sendKeys(pass);
        this.loginButton.click();
    }

}
