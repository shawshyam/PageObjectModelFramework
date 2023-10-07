package com.pom.tests;

import org.testng.annotations.Test;

import com.pom.pages.EditCustomerPage;
import com.pom.utils.Hooks;

public class EditCustomarTest extends Hooks {
	
	@Test
	public void editCustomarTest() {
		EditCustomerPage editpage = new EditCustomerPage(driver);
		editpage.searchCustomerForEditing("https://demo.guru99.com/v2", "mngr266311","Admin123$","73578");
	}
}
