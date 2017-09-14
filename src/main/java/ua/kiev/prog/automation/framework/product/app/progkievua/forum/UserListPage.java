package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import blocks.MainMenuBlock;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class UserListPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected By readyLocator() {
        return By.xpath("//li/a/span[text()='Список пользователей']");
    }
    private By _list = By.xpath("//div[@id='mlist']/table[@class='table_grid']/tbody/tr/td[2]/a");
    
    public void printUsers ()
    {
        List <WebElement> list = this.component().session().driver().findElements(_list);
        for (WebElement element: list) {
            System.out.println(element.getText());
        }
    }
    
private By _usersSearch = By.xpath("//*[@id='memberlist']/div[2]/div[1]/ul/li[2]/a/span");
    
    public UserSearchPage usersSearch ()
    {
        this.component().session().driver().findElement(_usersSearch).click();
        return new UserSearchPage();
    }
    
    final public MainMenuBlock mainMenu ()
    {
     return new MainMenuBlock();
    }
    
 }