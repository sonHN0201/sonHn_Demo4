package starter.wikipedia.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.configuration.SessionLocalTempDirectory;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.wikipedia.helps.WaitABit;
import starter.wikipedia.page.HomePage;
import starter.wikipedia.page.NavigateToWebsite;
import starter.wikipedia.task.CheckFileExits;
import starter.wikipedia.task.GoToDemoSiteTab;
import starter.wikipedia.task.DownloadFile;
import starter.wikipedia.task.ReadMoreJS;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestDemo4 {
    @CastMember(name = "sonHN")
    Actor sonHN;
    @Test
    public void tc_01(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(GoToDemoSiteTab.NavigateLink());
        sonHN.attemptsTo(DownloadFile.gotoFileDownLoad());
        sonHN.attemptsTo(CheckFileExits.checkFileExits());
    }
    @Test
    public void tc_02(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(ReadMoreJS.readMoreJS());

    }
}