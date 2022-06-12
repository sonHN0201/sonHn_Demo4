package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import starter.tiki.helps.WaitABit;
import starter.tiki.page.MoreMenuBar;
import starter.tiki.page.UploadFilePage;

public class UploadFile implements Task {
    public static UploadFile gotoFileUpload(){
        return Tasks.instrumented(UploadFile.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_UPLOAD),
                WaitABit.sleep(6000),
                Browser.refreshPage(),
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_UPLOAD),
                WaitABit.sleep(3000),
                Click.on(UploadFilePage.BTN_UPLOAD)
        );
    }
}
