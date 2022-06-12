package starter.tiki.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.TheSize;
import starter.tiki.helps.WaitABit;
import starter.tiki.page.ReadMorePage;

public class CheckZoomIn implements Task {
    public static CheckZoomIn checkZoom(){
        return Tasks.instrumented(CheckZoomIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String a = String.valueOf(TheSize.of(ReadMorePage.IMAGE_ZOOM).asLong());
        System.out.println("the size:============" + a);
        Click.on(ReadMorePage.BTN_ZOOM);
        WaitABit.sleep(6000);
        String b = String.valueOf(TheSize.of(ReadMorePage.IMAGE_ZOOM).asLong());
        System.out.println("the size after:"+b);


    }
}
