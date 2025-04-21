package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;
import static org.junit.Assert.*;

public class tc_008Steps {
    
    tc_008Page page = new tc_008Page();

    @Given("el usuario exporta el informe")
    public void elUsuarioExportaElInforme() {
        page.exportReport();
    }

    @When("el usuario revisa la creación de la columna 'Status Pago Código'")
    public void elUsuarioRevisaLaCreacionDeLaColumnaStatusPagoCodigo() {
        page.checkStatusPagoCodigoColumn();
    }

    @Then("la columna 'Status Pago Código' debería generarse sin valores iniciales")
    public void laColumnaStatusPagoCodigoDeberiaGenerarseSinValoresIniciales() {
        assertTrue(page.isStatusPagoCodigoColumnEmpty());
    }
    
    @Given("el usuario revisa el campo 'Status Pago Código'")
    public void elUsuarioRevisaElCampoStatusPagoCodigo() {
        page.checkStatusPagoCodigoField();
    }

    @Then("el campo debería estar preparado para futuras modificaciones")
    public void elCampoDeberiaEstarPreparadoParaFuturasModificaciones() {
        assertTrue(page.isFieldReadyForFutureUpdates());
    }

    @Given("el usuario consulta la documentación y registros de diseño")
    public void elUsuarioConsultaLaDocumentacionYRegistrosDeDisenio() {
        page.consultDocumentationAndDesignRecords();
    }

    @Then("el comportamiento del 'Status Pago Código' debería coincidir con lo estipulado")
    public void elComportamientoDelStatusPagoCodigoDeberiaCoincidirConLoEstipulado() {
        assertTrue(page.behaviorMatchesDocumentation());
    }
}