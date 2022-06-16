package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
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
                Click.on(DownLoadFilePage.BTN_DOWNLOAD)
        );
    }
}
