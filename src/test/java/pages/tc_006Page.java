package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;

    By ivaColumn = By.xpath("//th[contains(text(),'IVA Acumulado')]");
    By modifyFormulaButton = By.id("modifyFormula");
    By validatedResultsMessage = By.id("validationSuccess");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyIVAColumnExists() {
        return driver.findElement(ivaColumn).isDisplayed();
    }

    public void modifyFormulaExcludeIVA() {
        driver.findElement(modifyFormulaButton).click();
    }

    public boolean verifyCalculationExcludesIVA() {
        // Logic to verify that the calculation reflects the exclusion of IVA retained
        // Placeholder for validation logic
        return true;
    }

    public boolean validateResultsAgainstApprovedData() {
        // Logic to validate the results against approved data
        // Placeholder for validation logic
        return driver.findElement(validatedResultsMessage).isDisplayed();
    }
}