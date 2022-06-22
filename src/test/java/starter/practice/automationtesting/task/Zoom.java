package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import starter.practice.automationtesting.page.ReadMorePage;

public class Zoom implements Task {
    private final String status;

    public Zoom(String status) {
        this.status = status;
    }

    public static Zoom in() {
        return Tasks.instrumented(Zoom.class, "in");
    }

    public static Zoom out() {
        return Tasks.instrumented(Zoom.class, "out");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(status.equals("in"))
                        .andIfSo(
                                Click.on(ReadMorePage.BTN_ZOOM_BEFORE)
                        )
                        .otherwise(
                                Click.on(ReadMorePage.BTN_ZOOM_AFTER)
                        )
        );
    }
}