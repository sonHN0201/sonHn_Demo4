package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import starter.tiki.page.FramesPage;

public class Frames implements Task {
    public static Frames switchToFrames() {
        return Tasks.instrumented(Frames.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_FRAMES),
                Browser.refreshPage(),
                Click.on(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_FRAMES),
                Switch.toFrame(FramesPage.ID_FRAMES),
                Enter.theValue(FramesPage.INPUT_TEXT).into(FramesPage.TXT_FRAMES)
        );
    }
}
