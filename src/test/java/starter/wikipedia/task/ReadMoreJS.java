package starter.wikipedia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.wikipedia.page.HomePage;

public class ReadMoreJS implements Task {
    public static ReadMoreJS readMoreJS(){
        return Tasks.instrumented(ReadMoreJS.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.READ_MORE_JS)
        );
    }
}
