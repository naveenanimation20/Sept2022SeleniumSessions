package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(2000);

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// 1. single selection:
		// selectChoice(choices, "choice 1");

		// 2. multiple selection:
		// selectChoice(choices, "choice 2", "choice 2 3", "choice 7");

		//selectChoice(choices, "choice 2", "choice 9", "choice 2 3");

		// 3. all selection:
		// selectChoice(choices, "ALL");

		// 4. no choice
		// selectChoice(choices, "choice 9");
		
		//selectCh(choices, "choice 1", "choice 2 3", "choice 7");
		//selectCh(choices, "choice 1");
		//selectCh(choices, "choice 1", "choice 2 3", "choice 7");
		selectCh(choices, "choice 1", "choice 9");


	}

	public static void selectCh(By locator, String... values) {
		List<WebElement> choicesList = driver.findElements(locator);// 44
		String selectionType = null;
		
		if(values[0].equalsIgnoreCase("all")) selectionType = "all";
		else if(values.length == 1) selectionType = "single";
		else if(values.length > 1) selectionType = "multiple";
		
		boolean flag = false;
		switch (selectionType) {
		case "single":
			for (WebElement e : choicesList) {
				String text = e.getText();
				if (text.equals(values[0])) {
					flag = true;
					e.click();
					break;
				}
			}
			break;
		case "multiple":
			for (WebElement e : choicesList) {
				String text = e.getText();
				for (int i = 0; i < values.length; i++) {
					if (text.equals(values[i])) {
						flag = true;
						e.click();
						break;
					}
				}

			}
			break;
		case "all":
			for (WebElement e : choicesList) {
				try {
					e.click();
					flag = true;
				} catch (Exception ex) {
				}
			}
			break;

		default:
			System.out.println("selection type is missing");
			break;
		}
		
		if(!flag) {
			System.out.println("choice is not available...");

		}

	}

	/**
	 * 
	 * switch(selection)
	 * 
	 * case: single
	 * 
	 * case: multiple
	 * 
	 * case : all
	 * 
	 * default:
	 * 
	 */

	/**
	 * this method is handling single, multiple and all choices selection this
	 * method is also handling if choice is not available please pass the choices
	 * which are present in case of multiple choice selection please pass "all" in
	 * case of all selection
	 * 
	 * @param locator
	 * @param choice
	 */
	public static void selectChoice(By locator, String... choice) {
		List<WebElement> choicesList = driver.findElements(locator);// 44
		boolean flag = false;

		if (!choice[0].equalsIgnoreCase("all")) {
			for (WebElement e : choicesList) {
				String text = e.getText();
				// System.out.println(text);
				for (int i = 0; i < choice.length; i++) {
					if (text.equals(choice[i])) {
						flag = true;
						e.click();
						break;
					}
				}
			}
		} else {
			// all selection logic:
			try {
				for (WebElement e : choicesList) {// 0 - 44--> 14
					e.click();
					flag = true;
				}
			} catch (Exception e) {

			}
		}

		if (flag == false) {
			System.out.println("choice is not available...");
		}

	}

}
