package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.configuration.SessionLocalTempDirectory;
import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckFileDownLoadExits implements Task {
    public static CheckFileDownLoadExits checkFileExits() {
        return Tasks.instrumented(CheckFileDownLoadExits.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fileToDownload = "samplefile.pdf";
        String path;
        path = System.getProperty("user.dir") + "//src//test//resources//download//" + fileToDownload;
        File downloadedFile = SessionLocalTempDirectory.forTheCurrentSession().resolve(path).toFile();
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(downloadedFile::exists);
        assertThat(downloadedFile).exists();

    }
}
