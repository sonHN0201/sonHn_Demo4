package starter.wikipedia.page;

import net.serenitybdd.screenplay.targets.Target;

public class FileDownLoadPage {
    public static Target BTN_DOWNLOAD = Target.the("download button").locatedBy(".btn.btn-primary");
    public static Target BTN_CLOSE = Target.the("close btn").locatedBy("#dismiss-button>div>span");
}
