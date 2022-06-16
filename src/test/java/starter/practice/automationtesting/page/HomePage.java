package starter.practice.automationtesting.page;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target LINK_DEMO_SITE = Target.the("demo site link").locatedBy(".main-nav>li:nth-of-type(5)>a");
    public static Target READ_MORE_JS = Target.the("").locatedBy("//a[@data-product_id='165']");

}
