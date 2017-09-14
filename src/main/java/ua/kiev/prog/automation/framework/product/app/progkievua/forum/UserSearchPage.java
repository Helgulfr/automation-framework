package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class UserSearchPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected By readyLocator() {
        return By.xpath("//*[@id='memberlist']/div[1]/h3/span");
    }
    private By _name = By.xpath("//*[@id='fields-name']");
    private By _email = By.xpath("//*[@id='fields-email']");
    private By _group = By.xpath("//*[@id='fields-group']");
    private By _field = By.xpath("//*[@id='search_term_input']/input[1]");
    private By _btn = By.xpath("//*[@id='search_term_input']/input[2]");
    
    public UserSearchListPage search() {
        this.component().session().driver().findElement(_name).click();
        this.component().session().driver().findElement(_email).click();
        this.component().session().driver().findElement(_group).click();
        this.component().session().driver().findElement(_field).sendKeys("Преподаватели");
        this.component().session().driver().findElement(_btn).click();
        
        return new UserSearchListPage();
    }
    
 }