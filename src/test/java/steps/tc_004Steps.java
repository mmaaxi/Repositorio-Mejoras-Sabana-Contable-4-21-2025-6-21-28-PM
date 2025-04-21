import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page excelPage = PageFactory.initElements(driver, tc_004Page.class);

    @Given("Que la exportación se ha ejecutado exitosamente")
    public void exportacionEjecutadaExitosamente() {
        // Código para ejecutar exportación - puede ser un menú, botón o acción en la interfaz.
    }

    @When("Se abre el archivo Excel generado")
    public void abrirExcelGenerado() {
        excelPage.abrirArchivoExcelGenerado();
    }

    @Then("El Excel se muestra con todas las columnas")
    public void columnasDelExcelMostradasCorrectamente() {
        Assert.assertTrue(excelPage.verificarColumnasPresentes());
    }

    @Then("Las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido' están presentes")
    public void columnasIVAPresentes() {
        Assert.assertTrue(excelPage.verificarColumnasIVA());
    }

    @Then("Cada columna debe mostrar los datos y montos correctos según cálculos de IVA")
    public void verificarDatosYMontosPrecisos() {
        Assert.assertTrue(excelPage.verificarDatosYMontos());
    }
}