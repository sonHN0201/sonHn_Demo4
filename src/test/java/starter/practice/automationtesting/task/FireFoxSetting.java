package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxSetting implements Task {
    public static FireFoxSetting firefox(){
        return Tasks.instrumented(FireFoxSetting.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.dir",System.getProperty("user.dir") + "//src//test//resources//upload");
        options.addPreference("browser.download.folderList",2);
    }
}
