package starter.wikipedia.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FileDownLoadPage {
    public static Target BTN_DOWNLOAD = Target.the("download button").locatedBy(".btn.btn-primary");
}
