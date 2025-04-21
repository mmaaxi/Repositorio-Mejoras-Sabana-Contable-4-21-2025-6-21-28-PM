import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isColumnPresent(String columnName) {
        // Implementación para verificar si la columna está presente
        By columnLocator = By.xpath("//th[contains(text(),'" + columnName + "')]");
        return !driver.findElements(columnLocator).isEmpty();
    }

    public boolean isColumnEmpty(String columnName) {
        // Implementación para verificar si la columna está vacía
        By columnDataLocator = By.xpath("//td[preceding-sibling::th[contains(text(),'" + columnName + "')]]");
        return driver.findElements(columnDataLocator).stream().allMatch(element -> element.getText().isEmpty());
    }

    public boolean isColumnEditable(String columnName) {
        // Implementación para verificar si la columna es editable
        // Asumimos alguna lógica para identificar si es editable, por ejemplo, un setEditable flag o un input field presente
        By editableLocator = By.xpath("//input[@name='" + columnName + "']");
        return !driver.findElements(editableLocator).isEmpty();
    }
}