package starter.tiki.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.tiki.page.FramesPage;
import starter.tiki.page.NavigateToWebsite;
import starter.tiki.page.UploadFilePage;
import starter.tiki.task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestDemo4 {
    @CastMember(name = "sonHN")
    Actor sonHN;

    @Test
    public void tc_01() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        andThat(sonHN).attemptsTo(NavigateToMainMenuBar.navigateLink());
        when(sonHN).attemptsTo(DownloadFile.gotoFileDownLoad());
        then(sonHN).attemptsTo(CheckFileDownLoadExits.checkFileExits());
    }

    @Test
    public void tc_02() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        when(sonHN).attemptsTo(ClickReadMore.readMoreJS());
        then(sonHN).attemptsTo(CheckZoomIn.checkZoom());
    }

    @Test
    public void tc_03() {
        String filename = "TestDemo.txt";
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        andThat(sonHN).attemptsTo(NavigateToMainMenuBar.navigateLink());
        when(sonHN).attemptsTo(UploadFile.gotoFileUpload(filename));
        then(sonHN).attemptsTo(
                Ensure.that(ElementLocated.by(UploadFilePage.CHECK_FILE)).isDisplayed()
        );
    }

    @Test
    public void tc_04() {
        String textInput = "AUTOMATION TEST";
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        andThat(sonHN).attemptsTo(NavigateToMainMenuBar.navigateLink());
        when(sonHN).attemptsTo(Frames.switchToFrames(textInput));
        then(sonHN).attemptsTo(
                Ensure.that(FramesPage.TXT_FRAMES).hasValue(textInput)
        );
    }
}