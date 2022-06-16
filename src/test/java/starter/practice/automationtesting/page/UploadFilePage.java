package starter.practice.automationtesting.page;


import net.serenitybdd.screenplay.targets.Target;

public class UploadFilePage {

    public static Target BTN_UPLOAD = Target.the("button upload file").locatedBy("//input[@type='file']");
    public static Target CHECK_FILE = Target.the("check file").locatedBy("//div[@title='TestDemo.txt']");
}
