package starter.tiki.page;


import net.serenitybdd.screenplay.targets.Target;

public class UploadFilePage {

    public static Target BTN_UPLOAD = Target.the("button upload file").locatedBy("//input[@type='file']");
    public static String CHECK_FILE = "//div[@title='TestDemo.txt']";
}
