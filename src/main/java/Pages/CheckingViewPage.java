package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingViewPage {
    public CheckingViewPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
