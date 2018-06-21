package com.yourcompany.Tests;

import com.yourcompany.Pages.GuineaPigPage;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class FollowLinkTest extends TestBase {

    /**
     * Runs a simple test verifying link can be followed.
     *
     * @throws InvalidElementStateException
     */
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest1(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();


        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest2(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest3(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest4(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest5(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest6(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest7(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest8(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest9(String platformName,
                                String deviceName,
                                String platformVersion,
                                String appiumVersion,
                                String deviceOrientation,
                                Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest10(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest11(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest12(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest13(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest14(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest15(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest16(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest17(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest18(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest19(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest20(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest21(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest22(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    } @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest23(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest24(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest25(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest26(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest27(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest28(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest29(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest30(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest31(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest32(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest33(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest34(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest35(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest36(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest37(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest38(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest39(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest40(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest41(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest42(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest43(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest44(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest45(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest46(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest47(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest48(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest49(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest50(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest51(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest52(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest53(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest54(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest55(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest56(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest57(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest58(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest59(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest60(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest61(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest62(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest63(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest64(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest65(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest66(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest67(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest68(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest69(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest70(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest71(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest72(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    } @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest73(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest74(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest75(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest76(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest77(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest78(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest79(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest80(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest81(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest82(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest83(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest84(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest85(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest86(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest87(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest88(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest89(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest90(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest91(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest92(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest93(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest94(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest95(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest96(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest97(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest98(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest99(String platformName,
                                 String deviceName,
                                 String platformVersion,
                                 String appiumVersion,
                                 String deviceOrientation,
                                 Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest100(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest101(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest102(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest103(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest104(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest105(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }


    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest106(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest107(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest108(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest109(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest110(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest111(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest112(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest113(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest114(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest115(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest116(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest117(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest118(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest119(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest120(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest121(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest122(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    } @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest123(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest124(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest125(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest126(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest127(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest128(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest129(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest130(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest131(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest132(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest133(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest134(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest135(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest136(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest137(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest138(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest139(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest140(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest141(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest142(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest143(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest144(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest145(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest146(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest147(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest148(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest149(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }
    @Test(dataProvider = "hardCodedBrowsers")
    public void verifyLinkTest150(String platformName,
                                  String deviceName,
                                  String platformVersion,
                                  String appiumVersion,
                                  String deviceOrientation,
                                  Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {

        //create webdriver session
        this.createDriver(platformName, deviceName, platformVersion, appiumVersion, deviceOrientation, method.getName());
        WebDriver driver = this.getAndroidDriver();

        GuineaPigPage page = new GuineaPigPage(driver);

        page.followLink();

        Assert.assertFalse(page.isOnPage());
    }

}