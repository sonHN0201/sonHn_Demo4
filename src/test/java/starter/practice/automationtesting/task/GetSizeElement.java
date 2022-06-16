
package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.TheSize;
import net.serenitybdd.screenplay.targets.Target;

public class GetSizeElement implements Performable {
    private final Target element;
    private static int beforeWidth;
    private static int beforeHeight;

    public GetSizeElement(Target element) {
        this.element = element;
    }

    public static GetSizeElement of(Target target) {
        return Tasks.instrumented(GetSizeElement.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        beforeWidth = TheSize.of(element).answeredBy(actor).getWidth();
        beforeHeight = TheSize.of(element).answeredBy(actor).getHeight();
    }

    public static int getBeforeWidth() {
        return beforeWidth;
    }

    public static int getBeforeHeight() {
        return beforeHeight;
    }
}