## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.  Select No Topping pizza from Pizza1 drop down and verify that No toppings should be allowed to be selected
 2. Select 1 Topping Pizza from Pizza1 dropdown and verify that only one topping should be allowed to be selected
 3. Select 2 Topping Pizza from Pizza1 dropdown and verify that both the toppings should be allowed to be selected.
4. Verfiy that order can not be placed without providing the Name and Mobile Number.
5. Verify that Order should be placed when there is at least 1 quantity in the quantity text box
6. Verify that Cost is calculated correctly based on the Pizza price and number of quantity.
7. Verify that user can do the payment from credit card while selecting the payment option as "Credit Card"
8. Verify that phone number should not allow non numeric characters
9. Verify that Valid email id format only should be allowed to place the order\
10. Verify that quantity text box should only accepts numbers.
11. Verify that Reset button clear all the data from the page and display the default page.
12. Verify that the Place Order should not be allowed if there is nothing selected in Pizza1 dropdown and quantity.
13. Verify that user is successfully able to place the order when he selects the Pizza type from Pizza1 dropdown, quantity, Name, mobile number and payment information.
14. Verify that User should not be able to place the if anything is blank from Pizza type from Pizza1 dropdown, quantity, Name, mobile number and payment information.
Pizza1 : quantity : Name : Mobile Number : Payment
Blank  : 1        : abc  : 8088244233    : Cash
Small  : Blank    : abc  : 8088244233    : Cash
Small  : 2        : Blank: 8088244233    : Cash
Small  : 2    	  : abc  : Blank	     : Cash
Small  : 2    	  : abc  : 6578596970	 : Blank

 #### Defects :
 1. When No topping pizza is selected, Still toppings dropdowns are allowed to be selected
 2. When one topping pizza is selected, Still 2nd toppings dropdown is allowed to be selected
 3. Quantity is allowed as non numeric
 4. Order is getting place without selecting pizza and quantity
 5. phone number is allowed as non numeric
 6. No validation for email format
 7. When payment type is selected as credit card, UI is not displaying the fields related to credit card detail
 

