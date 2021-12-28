package com.nopcommerce.pages.pages;

import com.nopcommerce.pages.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By register = By.className("ico-register");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By DOBDate = By.name("DateOfBirthDay");
    By DOBMonth = By.name("DateOfBirthMonth");
    By DOBYear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By companyName = By.id("Company");
    By newsLetter = By.name("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    //By Continue = By.className("register-continue-button");
    //By Categories = By.className("menu-toggle");
    By Computers = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    By Notebooks = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a");
    By HpEnvy6 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[5]/div/div[2]/h2/a");
    By AddtoCart = By.id("add-to-cart-button-8");
    By Shoppingcart = By.className("cart-label");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    utils = new Utils(driver); }

    public String getPageTitle()throws InterruptedException{
        String rpTitle = driver.getTitle();
        Thread.sleep(2000);
        System.out.println("Register Page Title Is" + rpTitle);
        return rpTitle;
    }

    public void doRegister(String Firstname,String Lastname,String Day,String Month,String Year,String email,
                           String Password,String Confirmpassword,String CompanyName)throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(register).click();
        Thread.sleep(1000);
        utils.doClick(genderMale);
        Thread.sleep(1000);
        utils.doSendKeys(firstName,Firstname);
        utils.doSendKeys(lastName,Lastname);
        Thread.sleep(1000);
        utils.selectValueFromDropDown(DOBDate,Day);
        utils.selectValueFromDropDown(DOBMonth,Month);
        utils.selectValueFromDropDown(DOBYear,Year);

        Thread.sleep(1000);
        utils.doSendKeys(Email,email);
        utils.doSendKeys(companyName,CompanyName);
        utils.doClick(newsLetter);
        Thread.sleep(1000);
        utils.doSendKeys(password,Password);
        utils.doSendKeys(confirmPassword,Confirmpassword);
        Thread.sleep(2000);
        utils.doClick(registerButton);
        //utils.doClick(Continue);
       // utils.doClick(Categories);
        utils.doClick(Computers);
        utils.doClick(Notebooks);
        utils.doClick(HpEnvy6);
        utils.doClick(AddtoCart);
        utils.doClick(Shoppingcart);

    }




}

