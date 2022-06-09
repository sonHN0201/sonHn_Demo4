package starter.wikipedia.page;

import net.serenitybdd.screenplay.targets.Target;
public class HomePage {
    public static Target LINK_DEMO_SITE = Target.the("demo site link").locatedBy(".main-nav>li:nth-of-type(5)>a");

}
