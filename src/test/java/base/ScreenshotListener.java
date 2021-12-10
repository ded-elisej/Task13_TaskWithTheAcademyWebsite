package base;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.OutputType;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        saveScreenshot();
    }

    public byte[] saveScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}
