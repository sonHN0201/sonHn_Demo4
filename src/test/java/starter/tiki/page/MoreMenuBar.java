package starter.tiki.page;

import net.serenitybdd.screenplay.targets.Target;

public class MoreMenuBar {
    public static Target MORE = Target.the("more").locatedBy("ul[class*='nav']>li:nth-of-type(9)>a");
    public static Target FILE_DOWNLOAD = Target.the("file download tab").locatedBy("ul[class*='nav']>li:nth-of-type(9)>ul>li:nth-of-type(3)>a");
    public static Target FILE_UPLOAD = Target.the("file upload tab").locatedBy("ul[class*='nav']>li:nth-of-type(9)>ul>li:nth-of-type(4)>a");
}
