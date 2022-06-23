package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import starter.practice.automationtesting.helps.WaitABit;
import starter.practice.automationtesting.page.DownLoadFilePage;
import starter.practice.automationtesting.page.MoreMenuBar;

public class DownloadFile implements Task {

    public static DownloadFile gotoFileDownLoad() {
        return Tasks.instrumented(DownloadFile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_DOWNLOAD),
                Browser.refreshPage(),
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_DOWNLOAD),
                Click.on(DownLoadFilePage.BTN_DOWNLOAD),
                WaitABit.sleep(7000)
        );
        //GET BROWSER NAME
        WebDriver driver = (((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver());
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        actor.attemptsTo(
                Check.whether(browserName.equals("firefox"))
                        .andIfSo(
                                Click.on(DownLoadFilePage.BTN_DOWNLOAD_FIREFOX)
                        )
        );
    }
}
