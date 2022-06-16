package starter.practice.automationtesting.page;

import net.serenitybdd.screenplay.targets.Target;

public class FramesPage {
    public static Target LINK_SWITCH_TO = Target.the("switch to link").locatedBy("ul[class*='nav navbar-nav']>li:nth-of-type(4)>a");
    public static Target LINK_FRAMES = Target.the("frames link").locatedBy("ul[class*='nav navbar-nav']>li:nth-of-type(4)>ul>li:nth-of-type(3)>a");
    public static Target TXT_FRAMES = Target.the("text box frames").locatedBy("//input[@type='text']");
}
