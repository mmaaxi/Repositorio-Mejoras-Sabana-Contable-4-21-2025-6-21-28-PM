package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page formulaPage = new tc_006Page();

    @Given("el usuario ha exportado los datos y puede acceder a la columna 'IVA Acumulado'")
    public void export_and_access_IVA_acumulado() {
        assertTrue(formulaPage.verifyIVAColumnExists());
    }

    @When("el usuario confirma que la modificación excluye el IVA retenido")
    public void confirm_exclusion_of_retenido() {
        formulaPage.modifyFormulaExcludeIVA();
    }

    @Then("el cálculo refleja la exclusión de IVA retenido de forma precisa")
    public void calculation_reflects_exclusion() {
        assertTrue(formulaPage.verifyCalculationExcludesIVA());
    }

    @Then("los resultados son consistentes y validados contra datos esperados aprobados")
    public void results_are_consistent_and_validated() {
        assertTrue(formulaPage.validateResultsAgainstApprovedData());
    }
}