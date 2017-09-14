package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class BoardPage  extends PageObject
{
	private By _goToTopicPage = By.xpath("//*[@id='msg_30305']/a");
	
    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class;
    }

    @Override
    protected By readyLocator()
    {
        return By.xpath("//*[@id='main_content_section']/div[2]/div/ul/li[3]/a/span");
    }

    final public TopicPage getTopicPage()
    {
        this.component().session().driver().findElement(_goToTopicPage).click();
        return new TopicPage();
    }
}
