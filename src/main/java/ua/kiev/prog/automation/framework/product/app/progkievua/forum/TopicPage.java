package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class TopicPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class;
    }
         
    @Override
    protected By readyLocator()
    {
        return By.xpath("//*[@id='main_content_section']/div[2]//div/ul/li[4]/a/span");
    }
    
    final public void names()
    {
    	List<WebElement> authors = this.component().session().driver().findElements
    			(By.xpath("//*[@id='quickModForm']/./div/div/div[1]/h4/a"));
        for (WebElement author: authors ) {
    		System.out.println("Author: " +author.getText());
        }
    }
    
    private By _users = By.xpath("//li[@id='button_mlist']/a");
    
    public UserListPage openUsers ()
    {
        this.component().session().driver().findElement(_users).click();
        return new UserListPage();
    }
   
}
