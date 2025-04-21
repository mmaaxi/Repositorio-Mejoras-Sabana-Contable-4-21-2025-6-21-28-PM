package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    private WebDriver driver;
    private String excelFilePath = "path_to_exported_excel";

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        // Lógica para iniciar sesión en el sistema
    }

    public void exportarInforme() {
        // Lógica para exportar el informe y verificar acción
    }

    public void verificarExportacionExitosa() {
        // Comprobar que la exportación se realizó correctamente
    }

    public void abrirExcelExportado() {
        // Abrir el archivo Excel exportado
    }

    public void verificarColumnaPresente() {
        // Verificar que la columna 'Monto acumulado Folio Reserva 5401' está presente
    }

    public void verificarFormula() {
        // Verificar la fórmula en la celda correspondiente
    }

    public void verificarCalculosPrevistos() {
        // Comparar la fórmula y calcular los resultados previstos para confirmar sin discrepancias
    }
}