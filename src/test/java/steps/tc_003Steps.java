package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("el usuario ha iniciado sesión en el sistema")
    public void el_usuario_ha_iniciado_sesión_en_el_sistema() {
        page.iniciarSesion();
    }

    @When("el usuario realiza la exportación del informe")
    public void el_usuario_realiza_la_exportación_del_informe() {
        page.exportarInforme();
    }

    @Then("el proceso de exportación se ejecuta sin errores")
    public void el_proceso_de_exportación_se_ejecuta_sin_errores() {
        page.verificarExportacionExitosa();
    }

    @When("el usuario abre el Excel exportado")
    public void el_usuario_abre_el_excel_exportado() {
        page.abrirExcelExportado();
    }

    @Then("la columna 'Monto acumulado Folio Reserva 5401' está presente en el archivo")
    public void la_columna_monto_acumulado_folio_reserva_5401_está_presente_en_el_archivo() {
        page.verificarColumnaPresente();
    }

    @When("el usuario verifica la fórmula aplicada en la columna")
    public void el_usuario_verifica_la_fórmula_aplicada_en_la_columna() {
        page.verificarFormula();
    }

    @Then("la fórmula refleja los cálculos previstos sin discrepancias")
    public void la_fórmula_refleja_los_cálculos_previstos_sin_discrepancias() {
        page.verificarCalculosPrevistos();
    }
}