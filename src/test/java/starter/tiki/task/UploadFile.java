package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import starter.tiki.page.MoreMenuBar;
import starter.tiki.page.UploadFilePage;

public class UploadFile implements Task {
    private final String fileUpload;

    public UploadFile(String fileUpload) {
        this.fileUpload = fileUpload;
    }

    public static UploadFile gotoFileUpload(String fileUpload) {
        return Tasks.instrumented(UploadFile.class, fileUpload);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_UPLOAD),
                Browser.refreshPage(),
                MoveMouse.to(MoreMenuBar.MORE),
                Click.on(MoreMenuBar.FILE_UPLOAD),
                Enter.theValue(System.getProperty("user.dir") + "//src//test//resources//upload//" + fileUpload).into(UploadFilePage.BTN_UPLOAD)
        );
    }
}
