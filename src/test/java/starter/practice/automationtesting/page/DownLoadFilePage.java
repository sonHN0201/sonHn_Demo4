package starter.practice.automationtesting.page;

import net.serenitybdd.screenplay.targets.Target;

public class DownLoadFilePage {
    public static Target BTN_DOWNLOAD = Target.the("download button").locatedBy(".btn.btn-primary");
    public static Target BTN_DOWNLOAD_FIREFOX = Target.the("download button").locatedBy("//*[@id=\"download\"]");
}
