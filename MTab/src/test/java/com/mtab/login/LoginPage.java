package com.mtab.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.mtab.baseTest.BaseTest;

public class LoginPage extends BaseTest{

	@Test
	public void validLogin() throws InterruptedException {
		launchApplication("C:\\Users\\AGL\\eclipse-workspace\\MTab\\App\\base.apk");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.id("in.mtab.android.marutisuzuki:id/edlogin")).sendKeys("bbsr.susanta");
		driver.findElement(By.id("in.mtab.android.marutisuzuki:id/edpwd")).sendKeys("susanta123");
		Thread.sleep(10000);

		driver.findElement(By.id("in.mtab.android.marutisuzuki:id/btlogin")).click();	
		Thread.sleep(10000);
		driver.findElement(By.id("in.mtab.android.marutisuzuki:id/btn_close")).click();
		WebElement ele = driver.findElement(By.id("in.mtab.android.marutisuzuki:id/edt_search"));
		ele.sendKeys("MA3NYFB1SGH148200");
		ele.click();
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		driver.findElement(By.id("android:id/button1")).click();
	   System.out.println("hiii");

		



	}






}
