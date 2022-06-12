package starter.tiki.page;

import net.serenitybdd.screenplay.targets.Target;

public class ReadMorePage {
    public static Target IMAGE = Target.the("click image").locatedBy(".images>a>img");
    public static Target BTN_ZOOM = Target.the("image").locatedBy(".pp_expand");
    public static Target IMAGE_ZOOM= Target.the("zoom image").locatedBy("#pp_full_res>img");
}
