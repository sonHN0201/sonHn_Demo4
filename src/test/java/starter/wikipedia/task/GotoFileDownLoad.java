package starter.wikipedia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import starter.wikipedia.page.FileDownLoadPage;
import starter.wikipedia.page.MoreMenuBar;

import java.lang.invoke.SwitchPoint;

public class GotoFileDownLoad implements Task {
    public static GotoFileDownLoad gotoFileDownLoad(){
        return Tasks.instrumented(GotoFileDownLoad.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_DOWNLOAD),

                Click.on(FileDownLoadPage.BTN_CLOSE),
                Click.on(FileDownLoadPage.BTN_DOWNLOAD)
        );
    }
}
