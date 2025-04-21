package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^que el usuario ha iniciado sesión correctamente en el sistema$")
    public void iniciarSesion() {
        page.login();
    }

    @When("^el usuario exporta el informe en diferentes escenarios de uso$")
    public void exportarInformes() {
        boolean exportSuccess = page.exportReports();
        Assert.assertTrue("Exportación falló", exportSuccess);
    }

    @Then("^el sistema permite múltiples exportaciones sin errores$")
    public void verificarExportaciones() {
        boolean multipleExportSuccess = page.verifyMultipleExports();
        Assert.assertTrue("No se permiten múltiples exportaciones", multipleExportSuccess);
    }

    @When("^el usuario realiza validaciones cruzadas de datos entre el sistema y el Excel$")
    public void validarDatos() {
        boolean dataConsistency = page.crossValidateData();
        Assert.assertTrue("Inconsistencia en los datos", dataConsistency);
    }

    @Then("^las verificaciones muestran alta consistencia de datos$")
    public void verificarConsistencia() {
        boolean consistencyHigh = page.verifyHighDataConsistency();
        Assert.assertTrue("Consistencia de datos baja", consistencyHigh);
    }

    @When("^el usuario documenta cualquier discrepancia y valida contra casos de uso definidos$")
    public void documentarDiscrepancias() {
        page.documentDiscrepancies();
    }

    @Then("^la integridad global se mantiene conforme a las expectativas$")
    public void verificarIntegridadGlobal() {
        boolean globalIntegrity = page.verifyGlobalIntegrity();
        Assert.assertTrue("La integridad global no se mantiene", globalIntegrity);
    }
}