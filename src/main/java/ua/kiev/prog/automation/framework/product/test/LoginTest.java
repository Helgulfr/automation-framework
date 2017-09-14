package ua.kiev.prog.automation.framework.product.test;


import ua.kiev.prog.automation.framework.core.Test;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.BoardPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.LoginPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.MainPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.MainPageLoggedIn;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.TopicPage;

/**
 * ////////////////////////////////////////////////////////// *
 * Automation Framework                                       *
 * Automation Course for https://prog.kiev.ua/                *
 * ---------------------------------------------------------- *
 * Created by Yurii Voronenko                                 *
 * Email: yurii.voronenko@gmail.com                           *
 * ////////////////////////////////////////////////////////// *
 */
public class LoginTest extends Test
{

    @Override
    public String name()
    {
        return "Login to forum test";
    }

    @Override
    public void beforeTest()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: BEFORE RUN");
    }

    @Override
    public void test()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: TEST");

        // Получаем главную страницу
        MainPage mainPage   = Component.getSingleton(Forum.class).mainPage();
        // Переходим на страницу логина
        LoginPage loginPage = mainPage.getLoginPage();
        // Заходим на форум
        MainPageLoggedIn dashboard = loginPage.login("Sergey.Vashchuk", "CthtufGhjuRbtd");
        // Подтверждаем что вход осуществлен
        this.assertSuccess(dashboard, "Login");
        // Выводим в консоль имя пользователя на форуме
        System.out.println("Name: " + dashboard.getUsername());
    
        // TODO домашнее задание
        /*BoardPage boardPage = dashboard.getBoardPage();
		TopicPage topicPage = boardPage.getTopicPage();
		topicPage.names();*/
		/*dashboard.getBoardPage().getTopicPage().names();
        dashboard.openUsers().printUsers();*/
        /*TopicPage topic = dashboard.getBoardPage().getTopicPage();
        topic.names();
        topic.openUsers().printUsers();*/
        /*dashboard.openUsers().usersSearch().search().printUsers();*/
        
        dashboard.mainMenu().openUsersPage().mainMenu().openProfilePage().mainMenu()
        .openSearchPage().mainMenu().openHelpPage();

        // Ждём 10 сек, с перехватом исключения на прерывание выполнения потока и игнорируем его
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { /* Игнорируем */ }

    }

    @Override
    public void afterTest()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: AFTER RUN");
    }
}
