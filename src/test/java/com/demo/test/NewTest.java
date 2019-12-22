package com.demo.test;

import org.testng.annotations.Test;

import com.demo.action.BaseClassPageFactory;
import com.demo.action.loginAction;

public class NewTest extends BaseClassPageFactory{
	
  @Test
  public void f() {
	  driver.get("https://stgclient.vetty.co/client/login");

		loginAction logintest = new loginAction();
		
		logintest.loginaction();
  }
}
