package starter.wikipedia.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.waits.Wait;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.wikipedia.page.NavigateToWebsite;
import starter.wikipedia.task.GoToDemoSiteTab;
import starter.wikipedia.task.GotoFileDownLoad;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestDemo4 {
    @CastMember(name = "sonHN")
    Actor sonHN;

    @Test
    public void tc_01(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(GoToDemoSiteTab.NavigateLink());
        sonHN.attemptsTo(GotoFileDownLoad.gotoFileDownLoad());
        try {
            Thread.sleep(9000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}