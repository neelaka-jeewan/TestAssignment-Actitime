package com.actitime.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.actitime.base.BaseTest;
import com.actitime.pages.AddUser;
import com.actitime.pages.AddTask;
import com.actitime.pages.LoginPage;
import com.actitime.pages.Tasks;
import com.actitime.pages.Users;

public class AddUserPageTest extends BaseTest{

    LoginPage loginpage;
    HomePage homepage;
    Tasks opentaskspage;
    Users projectsandcustomerspage;
    AddTask addnewtaskspage;
    AddUser addnewcustomerpage;
    String sheetname="customers";

    public AddUserPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialize();
        loginpage=new LoginPage();
        homepage=loginpage.login();
        projectsandcustomerspage=homepage.clickOnProjectsAndCustomers();
        addnewcustomerpage=projectsandcustomerspage.clickOnAddNewCustomer();

    }


    @Test(priority=1,dataProvider="getActiTimeData")
    public void verifyAddNewCustomerTest(String customer,String description) {
        projectsandcustomerspage=	addnewcustomerpage.addNewCustomer(customer, description);
    }

    @DataProvider
    public Object[][] getActiTimeData() {
        //Object[][] obj=
        return new Utility().getTestData(sheetname);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }






}
