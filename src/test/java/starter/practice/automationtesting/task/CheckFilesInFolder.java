package starter.practice.automationtesting.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class CheckFilesInFolder implements Task {
    public static CheckFilesInFolder checkFile() {
        return Tasks.instrumented(CheckFilesInFolder.class);
    }

    @Override
    @Step("Check if the file is in the folder, if so, perform the function to delete the file, then continue")
    public <T extends Actor> void performAs(T actor) {
        String fileToDownload = "samplefile.pdf";
        String path;
        path = System.getProperty("user.dir") + "//src//test//resources//download//";
        File dir = new File(path);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileToDownload)) {
                dirContents[i].delete();
            }
        }
    }
}
