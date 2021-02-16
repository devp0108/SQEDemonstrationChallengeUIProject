package com.sample.test.demo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PizzaOrderForm {
	
	WebDriver driver;
	
	public PizzaOrderForm(WebDriver driver){
		this.driver=driver;
	}

	private final By dropdown_Pizz1=By.id("pizza1Pizza");
	private final By dropdown_pizza1Toppings1=By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
	private final By dropdown_pizza1Toppings2=By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
	private final By txt_PizzaQuantity=By.id("pizza1Qty");
	private final By txt_PizzaCost=By.id("pizza1Cost");
	private final By radioCreditCard=By.id("ccpayment");
	private final By radioCash=By.id("cashpayment");
	private final By txt_email=By.id("email");
	private final By txt_name=By.id("name");
	private final By txt_phone=By.id("phone");
	private final By placeOrderButton=By.id("placeOrder");
	private final By resetButton=By.id("reset");
	private final By dialog=By.id("dialog");
	private final By dialogText=By.xpath("//div[@id='dialog']/p");
	private final By dialogClose =By.cssSelector(".ui-button-icon.ui-icon.ui-icon-closethick");
	
	
	public void selectPizza1(String pizzaType){
		WebElement element= driver.findElement(dropdown_Pizz1);
		Select select=new Select(element);
		select.selectByValue(pizzaType);
	}
	
	public void selectPizzaTopping1(String pizzaTopping1){
		WebElement element= driver.findElement(dropdown_pizza1Toppings1);
		Select select=new Select(element);
		select.selectByValue(pizzaTopping1);
	}
	

	public void selectPizzaTopping2(String pizzaTopping2){
		WebElement element= driver.findElement(dropdown_pizza1Toppings2);
		Select select=new Select(element);
		select.selectByValue(pizzaTopping2);
	}
	
	
	public void selectQuantity(String quantity){
		driver.findElement(txt_PizzaQuantity).click();
		driver.findElement(txt_PizzaQuantity).sendKeys(Keys.BACK_SPACE);
		driver.findElement(txt_PizzaQuantity).sendKeys(quantity);
		driver.findElement(txt_PizzaQuantity).sendKeys(Keys.TAB);
	}
	
	
	public String getPizzaCost(){
		return driver.findElement(txt_PizzaCost).getAttribute("value");
	}
	
	public void typeName(String name){
	  driver.findElement(txt_name).sendKeys(name);
	}
	
	public void typeEmail(String email){
		  driver.findElement(txt_email).sendKeys(email);
		}
	
	
	   public void typePhoneNumber(String phoneNumber){
		  driver.findElement(txt_phone).sendKeys(phoneNumber);
		}
	
	   public void selectPaymentInfo(String paymenttype){
			 if(paymenttype.equalsIgnoreCase("CASH")){
				 driver.findElement(radioCash).click();
			 }else{
				 driver.findElement(radioCreditCard).click();
			 }
			}
	   
	   public void clickPlacOrder(){
		   driver.findElement(placeOrderButton).click();
	   }
	   
	   public void clickResetButton(){
		   driver.findElement(resetButton).click();
	   }
	   
	   public boolean verifyDialogBoxExists(){
		 return driver.findElement(dialog).isDisplayed();  
	   }

	   
	   public String getDialogText(){
		   return driver.findElement(dialogText).getText();
	   }
	   
	   public void closeDialog(){
		   driver.findElement(dialogClose).click();
	   }
}
