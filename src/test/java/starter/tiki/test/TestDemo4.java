package starter.tiki.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.tiki.page.NavigateToWebsite;
import starter.tiki.task.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestDemo4 {
    @CastMember(name = "sonHN")
    Actor sonHN;
    @Test
    public void tc_01(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(GoToDemoSiteTab.navigateLink());
        sonHN.attemptsTo(DownloadFile.gotoFileDownLoad());
        sonHN.attemptsTo(CheckFileExits.checkFileExits());
    }
    @Test
    public void tc_02(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(ReadMoreJavaScript.readMoreJS());
        sonHN.attemptsTo(CheckZoomIn.checkZoom());
    }
    @Test
    public void tc_03(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(GoToDemoSiteTab.navigateLink());
        sonHN.attemptsTo(UploadFile.gotoFileUpload());
    }
    @Test
    public void tc_04(){
        sonHN.attemptsTo(Open.browserOn(new NavigateToWebsite()));
        sonHN.attemptsTo(GoToDemoSiteTab.navigateLink());
        sonHN.attemptsTo(SwitchTo.switchToFrames());
    }
}