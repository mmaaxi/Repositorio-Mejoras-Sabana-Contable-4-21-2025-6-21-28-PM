package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("El informe ha sido exportado")
    public void el_informe_ha_sido_exportado() {
        page.exportReport();
    }

    @When("Reviso la columna 'Monto Acumulado Folio OPC 2121' en el Excel")
    public void reviso_columna_en_excel() {
        assertTrue(page.isColumnPresent());
    }

    @Then("El campo aparece en el Excel")
    public void el_campo_aparece_en_el_excel() {
        assertTrue(page.isColumnPresent());
    }

    @When("Verifico que la fórmula incluya todos los montos relevantes")
    public void verifico_formula_montos_relevantes() {
        assertTrue(page.isFormulaCorrect());
    }

    @Then("Los valores calculados son consistentes y correctos")
    public void valores_consistentes_y_correctos() {
        assertTrue(page.isCalculationConsistent());
    }

    @When("Comparo con la documentación técnica")
    public void comparo_con_documentacion_tecnica() {
        assertTrue(page.doesFormulaMeetRequirements());
    }

    @Then("La fórmula cumple con los requerimientos técnicos esperados")
    public void formula_cumple_requerimientos_tecnicos() {
        assertTrue(page.doesFormulaMeetRequirements());
    }
}