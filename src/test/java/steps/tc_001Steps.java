package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page reportPage;

    @Given("the user navigates to the report generation module in the BaNCS system")
    public void user_navigates_to_report_module() {
        reportPage = new tc_001Page(driver);
        reportPage.navigateToReportGenerationModule();
    }

    @When("the user selects the option to export the 'Claim Accounting Report'")
    public void user_selects_export_option() {
        reportPage.exportClaimAccountingReport();
    }

    @Then("the exported Excel contains columns in the specified new order")
    public void verify_exported_excel_columns_order() {
        reportPage.verifyExportedExcelColumnOrder();
    }
}