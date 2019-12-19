package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.UploadImagePage;

public class UploadImageTest extends TestBase {

    UploadImagePage uploadImagePage;

    @Test
    public void UploadPhoto (){

        uploadImagePage = new UploadImagePage(driver);
        uploadImagePage.UploadImage();
        uploadImagePage.SubmitAction();
        Assert.assertTrue(uploadImagePage.successMsg.getText().contains("test.png"));
    }

}
