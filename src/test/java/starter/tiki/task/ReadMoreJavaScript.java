package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.tiki.helps.WaitABit;
import starter.tiki.page.HomePage;
import starter.tiki.page.ReadMorePage;

public class ReadMoreJavaScript implements Task {
    public static ReadMoreJavaScript readMoreJS() {
        return Tasks.instrumented(ReadMoreJavaScript.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.READ_MORE_JS)
        );
    }
}
