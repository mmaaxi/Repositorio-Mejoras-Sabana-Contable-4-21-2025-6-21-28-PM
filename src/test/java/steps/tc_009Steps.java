package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page tcPage = new tc_009Page();

    @Given("el informe ha sido exportado")
    public void el_informe_ha_sido_exportado() {
        tcPage.exportarInforme();
    }

    @When("localizo la columna renombrada")
    public void localizo_la_columna_renombrada() {
        Assert.assertTrue(tcPage.localizarColumnaRenombrada());
    }

    @Then("la columna 'Status de Pago' debe mostrarse como 'Descripción Status Pago'")
    public void la_columna_debe_mostrarse_correctamente() {
        Assert.assertEquals("Descripción Status Pago", tcPage.obtenerNombreColumna());
    }

    @Then("no deben existir duplicaciones o errores de nomenclatura")
    public void no_deben_existir_duplicaciones_o_errores() {
        Assert.assertTrue(tcPage.verificarDuplicacionesErrorNomenclatura());
    }

    @Then("la nomenclatura debe ser validada contra el documento de requerimientos")
    public void la_nomenclatura_debe_ser_validada() {
        Assert.assertTrue(tcPage.validarConRequerimientos());
    }
}