package blocks;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.component.object.BlockObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.HelpPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.ProfilePage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.SearchPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.UserListPage;

public class MainMenuBlock extends BlockObject {

	@Override
	protected Class componentClass() {
		return Forum.class;
	}

	@Override
	protected By readyLocator() {
		return By.xpath("//div[@id='main_menu']");
	}
	
	public HelpPage openHelpPage () {
		this.component().session().driver().findElement
		(By.xpath("//*[@id='button_help']/a")).click();
		return new HelpPage();
		
	}
	public SearchPage openSearchPage () {
		this.component().session().driver().findElement
		(By.xpath("//*[@id='button_search']/a")).click();
		return new SearchPage();
		
	}
	public ProfilePage openProfilePage () {
		this.component().session().driver().findElement
		(By.xpath("//*[@id='button_profile']/a")).click();
		return new ProfilePage();
		
	}
	public UserListPage openUsersPage () {
		this.component().session().driver().findElement
		(By.xpath("//*[@id='button_mlist']/a")).click();
		return new UserListPage();
		
	}

}
