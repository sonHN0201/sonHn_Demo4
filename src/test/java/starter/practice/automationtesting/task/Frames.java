package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import starter.practice.automationtesting.page.FramesPage;

public class Frames implements Task {
    private final String text;

    public Frames(String text) {
        this.text = text;
    }

    public static Frames switchToFrames(String text) {
        return Tasks.instrumented(Frames.class, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String IdFrames = "singleframe";
        actor.attemptsTo(
                MoveMouse.to(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_FRAMES),
                Browser.refreshPage(),
                Click.on(FramesPage.LINK_SWITCH_TO),
                Click.on(FramesPage.LINK_FRAMES),
                Switch.toFrame(IdFrames),
                Enter.theValue(text).into(FramesPage.TXT_FRAMES)
        );
    }
}
