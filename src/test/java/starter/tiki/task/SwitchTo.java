package starter.tiki.task;

import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import starter.tiki.page.SwitchToPage;

public class SwitchTo implements Task {
    public static SwitchTo switchToFrames(){
        return Tasks.instrumented(SwitchTo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(SwitchToPage.LINK_SWITCH_TO),
                Click.on(SwitchToPage.LINK_SWITCH_TO),
                Click.on(SwitchToPage.LINK_FRAMES)
        );
    }
}
