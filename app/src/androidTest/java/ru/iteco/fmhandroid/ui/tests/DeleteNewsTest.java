package ru.iteco.fmhandroid.ui.tests;

import static ru.iteco.fmhandroid.ui.utils.DataHelper.MENU_ITEM_NEWS;

import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Feature;
import io.qameta.allure.kotlin.Story;

@Epic("Новости")
@Feature("Функционал новостей в приложении")
public class DeleteNewsTest extends BaseTest {

    @Before
    public void setUp() {
        verifyMainScreen(authSteps, mainSteps);
    }


    @Test
    @Story("Проверка удаление новости")
    public void deleteNewsTest() {
        mainSteps.openMainMenu();
        mainSteps.selectMenuItem(MENU_ITEM_NEWS);
        newsSteps.deleteNews();
    }
}