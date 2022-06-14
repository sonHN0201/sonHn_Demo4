package starter.tiki.page;

import net.serenitybdd.screenplay.targets.Target;

public class ReadMorePage {
    public static Target IMAGE = Target.the("click image").locatedBy(".images>a>img");
    public static Target BTN_ZOOM_BEFORE = Target.the("zoom button before").locatedBy(".pp_expand");
    public static Target BTN_ZOOM_AFTER = Target.the("zoom button after").locatedBy(".pp_contract");
    public static Target IMAGE_ZOOM= Target.the("zoom image").locatedBy("#pp_full_res>img");
}
