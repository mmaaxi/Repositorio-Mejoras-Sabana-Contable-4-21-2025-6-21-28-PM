package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By reportModuleLink = By.id("reportModuleLink");
    By exportButton = By.id("exportButton");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportGenerationModule() {
        driver.findElement(reportModuleLink).click();
    }

    public void exportClaimAccountingReport() {
        driver.findElement(exportButton).click();
    }

    public void verifyExportedExcelColumnOrder() {
        // Code to check the column order in the exported Excel file
        // Implementation depends on how the Excel file is accessed (e.g., Apache POI)
    }
}