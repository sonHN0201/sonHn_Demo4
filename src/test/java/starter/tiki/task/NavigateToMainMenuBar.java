package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.tiki.page.HomePage;

public class NavigateToMainMenuBar implements Task {

    public static NavigateToMainMenuBar navigateLink() {
        return Tasks.instrumented(NavigateToMainMenuBar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LINK_DEMO_SITE)
        );
    }
}
