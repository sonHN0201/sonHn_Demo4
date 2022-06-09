package starter.wikipedia.page;

import net.serenitybdd.screenplay.targets.Target;

public class MoreMenuBar {
    public static Target MORE = Target.the("more").locatedBy("ul[class*='nav navbar-nav']>li:nth-of-type(9)>a");
    public static Target FILE_DOWNLOAD =Target.the("file download tab").locatedBy("ul[class*='nav navbar-nav']>li:nth-of-type(9)>ul>li:nth-of-type(3)>a");
}
