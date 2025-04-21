package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tc_002Page;

public class tc_002Steps {

    Tc_002Page page = new Tc_002Page();

    @Given("the user has exported the report")
    public void theUserHasExportedTheReport() {
        page.exportReport();
    }

    @When("the user opens the generated Excel file")
    public void theUserOpensTheGeneratedExcelFile() {
        page.openExcelFile();
    }

    @Then("the file opens without errors")
    public void theFileOpensWithoutErrors() {
        page.verifyFileOpensWithoutErrors();
    }

    @Then("the 'Estado Código' column should appear next to column 'i'")
    public void theEstadoCodigoColumnShouldAppearNextToColumnI() {
        page.verifyEstadoCodigoColumnPosition();
    }

    @Then("the order of columns matches the requirements document")
    public void theOrderOfColumnsMatchesTheRequirementsDocument() {
        page.compareWithRequirementsDocument();
    }
}