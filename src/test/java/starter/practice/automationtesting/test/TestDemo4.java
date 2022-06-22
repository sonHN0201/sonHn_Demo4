package starter.practice.automationtesting.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TheSize;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.practice.automationtesting.helps.GetSizeElement;
import starter.practice.automationtesting.helps.WaitABit;
import starter.practice.automationtesting.page.*;
import starter.practice.automationtesting.task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestDemo4 {
    @CastMember(name = "sonHN")
    Actor sonHN;

//    @Test
//    @Title("Verify that the user can download the file successfully")
//    public void tc_01() {
//
//        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
////        sonHN.attemptsTo(WaitABit.sleep(9999999));
//        andThat(sonHN).attemptsTo(NavigateToMainMenuBar.navigateLink());
//
//        andThat(sonHN).attemptsTo(CheckFilesInFolder.checkFile());
//
//        when(sonHN).attemptsTo(DownloadFile.gotoFileDownLoad());
//
//        then(sonHN).attemptsTo(CheckFileDownLoadExits.checkFileExits());
//    }

    @Test
    @Title("Verify that the user can zoom in/out on the image")
    public void tc_02() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        when(sonHN).attemptsTo(Click.on(HomePage.READ_MORE_JS));

        and(sonHN).attemptsTo(
                Click.on(ReadMorePage.IMAGE),
                WaitUntil.the(ReadMorePage.IMAGE_ZOOM, isVisible()).forNoMoreThan(10).seconds()
        );
        and(sonHN).attemptsTo(GetSizeElement.of(ReadMorePage.IMAGE_ZOOM));

        // Zoom in
        when(sonHN).attemptsTo(Zoom.in());
        then(sonHN).attemptsTo(
                Ensure.that(GetSizeElement.getBeforeWidth()).isLessThan(TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(sonHN).getWidth()),
                Ensure.that(GetSizeElement.getBeforeHeight()).isLessThan(TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(sonHN).getHeight())
        );

        // Zoom out
        givenThat(sonHN).attemptsTo(GetSizeElement.of(ReadMorePage.IMAGE_ZOOM));
        when(sonHN).attemptsTo(Zoom.out());
        then(sonHN).attemptsTo(
                Ensure.that(GetSizeElement.getBeforeWidth()).isGreaterThan(TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(sonHN).getWidth()),
                Ensure.that(GetSizeElement.getBeforeHeight()).isGreaterThan(TheSize.of(ReadMorePage.IMAGE_ZOOM).answeredBy(sonHN).getHeight())
        );
    }

    @Test
    @Title("Verify that the user can successfully upload the file")
    public void tc_03() {
        String filename = "TestDemo.txt";

        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateToWebsite()));
        andThat(sonHN).attemptsTo(NavigateToMainMenuBar.navigateLink());

        when(sonHN).attemptsTo(UploadFile.gotoFileUpload(filename));

        then(sonHN).should(
                seeThat("check file upload is successful", WebElementQuestion.the(UploadFilePage.CHECK_FILE), isVisible())
        );
    }

    @Test
    @Title("Verify that the user can successfully enter \"AUTOMATION TEST\" in the TextBox")
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