package testCaseBestBuy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseBestBuy.BaseClassBB;
import pagesBestBuy.LocationPageBB;

public class TC_01_navgatingToBestBestApp extends BaseClassBB {
	
	@BeforeTest
	public void setup() {
		testName = "tc_01_navgatingToBestBestApp";
		testDescription = "Navigating to the Best Buy e-commerce website";
		testCategory = "Regression";
		testAuthor = "Vinothkumar";
	}
	
	@Test
	public void tc_01_navgatingToBestBestApp() throws Exception {
		LocationPageBB lp=new LocationPageBB();
		String actTitle = lp.bestBuyPageTitle();
		String expTitle="Best Buy International: Select your Country - Best Buy";
		softAssert(actTitle, expTitle);
		if (actTitle.equals(expTitle)) {
			reportStep("Validating Best Buy Page Title - Pass", "Pass", testName);
		} else {
			reportStep("Validating Best Buy Page Title - Fail", "Fail", testName);
		}
	}
}
