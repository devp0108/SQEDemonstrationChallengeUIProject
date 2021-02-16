package com.sample.test.demo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.pom.PizzaOrderForm;

import junit.framework.Assert;

public class DemoTest extends TestBase {

    @Test
    public void demoTest() throws InterruptedException {
        System.out.println("HELLO WORLD");       
    }
    
    @Test
    public void positiveTest() throws InterruptedException, IOException {
        PizzaOrderForm pof=new PizzaOrderForm(driver);
        pof.clickResetButton();
        pof.selectPizza1(PizzaTypes.SMALL_ONETOPPINGS.getDisplayName());
        pof.selectPizzaTopping1(PizzaToppings.ITALIANHAM.getDisplayName());
        pof.selectPizzaTopping2(PizzaToppings.PARMASAN.getDisplayName());
        pof.selectQuantity("2");
        String pizzaCost=pof.getPizzaCost();
        Assert.assertEquals(PizzaTypes.SMALL_ONETOPPINGS.getCost()*2,Double.parseDouble(pizzaCost));
        capture("positive_1");
        pof.typeName("Devang");
        pof.typeEmail("devang.patel@gmail.com");
        pof.typePhoneNumber("908907867");
        pof.selectPaymentInfo("Cash");
        pof.clickPlacOrder();
        Assert.assertTrue(pof.verifyDialogBoxExists());
        String digalogText= pof.getDialogText();
        Assert.assertTrue(digalogText.contains("Thank you for your order"));
        capture("positive_2");
        pof.closeDialog();
    }
    
    @Test
    public void negativeTest() throws InterruptedException, IOException {
    	PizzaOrderForm pof=new PizzaOrderForm(driver);
    	pof.clickResetButton();
        pof.selectPizza1(PizzaTypes.SMALL_ONETOPPINGS.getDisplayName());
        pof.selectPizzaTopping1(PizzaToppings.ITALIANHAM.getDisplayName());
        pof.selectPizzaTopping2(PizzaToppings.PARMASAN.getDisplayName());
        pof.selectQuantity("2");
        String pizzaCost=pof.getPizzaCost();
        capture("Negative_1");
        Assert.assertEquals(PizzaTypes.SMALL_ONETOPPINGS.getCost()*2,Double.parseDouble(pizzaCost));
        pof.typeName("Devang");
        pof.typeEmail("devang.patel@gmail.com");
        pof.selectPaymentInfo("Cash");
        pof.clickPlacOrder();
        Assert.assertTrue(pof.verifyDialogBoxExists());
        String digalogText= pof.getDialogText();
        Assert.assertTrue(digalogText.contains("Missing phone number"));
        capture("Negative_2");
        pof.closeDialog();
    }

}
