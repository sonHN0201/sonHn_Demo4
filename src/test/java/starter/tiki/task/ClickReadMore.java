package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.tiki.page.HomePage;

public class ClickReadMore implements Task {
    public static ClickReadMore readMoreJS() {
        return Tasks.instrumented(ClickReadMore.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.READ_MORE_JS)
        );
    }
}
