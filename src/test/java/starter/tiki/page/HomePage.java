package starter.tiki.page;

import net.serenitybdd.screenplay.targets.Target;
public class HomePage {
    public static Target LINK_DEMO_SITE = Target.the("demo site link").locatedBy(".main-nav>li:nth-of-type(5)>a");
    public static Target READ_MORE_JS = Target.the("").locatedBy("#text-22-sub_row_1-0-2-2-0 > div > ul > li > a.button.product_type_simple.ajax_add_to_cart");

}
