package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadImagePage extends PageBase {

    public UploadImagePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "file-upload")
    public WebElement choseFileBt;

    @FindBy(id = "file-submit")
    public WebElement submitBt;

    @FindBy(id = "uploaded-files")
    public
    WebElement successMsg;

    public void UploadImage() {
        choseFileBt.sendKeys("C:\\Users\\ahmed.adel\\IdeaProjects\\Web_Example\\uploads\\test.png");
    }
    public void SubmitAction (){
        submitBt.click();
    }
}
