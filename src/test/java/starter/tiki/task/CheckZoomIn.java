package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TheSize;
import starter.tiki.helps.WaitABit;
import starter.tiki.page.ReadMorePage;

public class CheckZoomIn implements Task {
    public static CheckZoomIn checkZoom() {
        return Tasks.instrumented(CheckZoomIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReadMorePage.IMAGE),
                WaitABit.sleep(6000)
        );
        int BeForWidth = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getWidth();
        int BeForHeight = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getHeight();
        actor.attemptsTo(
                Click.on(ReadMorePage.BTN_ZOOM_BEFORE)
        );
        int AfterWidth = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getWidth();
        int AfterHeight = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getHeight();

        actor.attemptsTo(
                Ensure.that(BeForWidth).isLessThan(AfterWidth),
                Ensure.that(BeForHeight).isLessThan(AfterHeight),
                Click.on(ReadMorePage.BTN_ZOOM_AFTER)
        );
        int AfterWidth1 = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getWidth();
        int AfterHeight1 = TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(actor).getHeight();
        actor.attemptsTo(
                Ensure.that(AfterWidth).isGreaterThan(AfterWidth1),
                Ensure.that(AfterHeight).isGreaterThan(AfterHeight1)
        );
    }
}
