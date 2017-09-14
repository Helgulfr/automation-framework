package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class UserSearchListPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected By readyLocator() {
        return By.xpath("//*[@id='memberlist']/div[1]/h4/span");
    }
    private By _searchlist = By.xpath("//*[@id='mlist']/table/tbody/tr/td[2]/a");
    
    public void printUsers ()
    {
        List <WebElement> list = this.component().session().driver().findElements(_searchlist);
        for (WebElement element: list) {
            System.out.println(element.getText());
        }
    }
    
 }