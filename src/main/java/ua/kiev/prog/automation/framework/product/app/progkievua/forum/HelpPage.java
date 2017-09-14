package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import blocks.MainMenuBlock;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class HelpPage extends PageObject {

	@Override
	protected Class componentClass() {
		return Forum.class;
	}

	@Override
	protected By readyLocator() {
		return By.xpath("//li[@class='last']/a/span[text()='Помощь']");
	}

	final public MainMenuBlock mainMenu ()
	{
	 return new MainMenuBlock();
	}
}
