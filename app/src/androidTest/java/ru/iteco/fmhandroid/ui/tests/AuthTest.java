package ru.iteco.fmhandroid.ui.tests;

import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Feature;
import io.qameta.allure.kotlin.Story;
import ru.iteco.fmhandroid.ui.utils.DataHelper;

@Epic("Авторизация")
@Feature("Функционал входа")
public class AuthTest extends BaseTest {

    @Before
    public void setUp() {
        verifyAuthScreen(authSteps);
    }

    @Test
    @Story("Успешная авторизация")
    @Description("Проверка входа с валидными учетными данными")
    public void authValidTestAndLogOut() {
        authSteps.checkAuthScreenVisible();
        authSteps.enterLogin(DataHelper.VALID_LOGIN);
        authSteps.enterPassword(DataHelper.VALID_PASSWORD);
        authSteps.clickSignInButton();
        mainSteps.verifySuccessfulAuth();
        authSteps.logout();
    }

    @Test
    @Story("Успешная авторизация")
    @Description("Проверка выхода из профиля")
    public void logOutTest() {
        authSteps.checkAuthScreenVisible();
        authSteps.enterLogin(DataHelper.VALID_LOGIN);
        authSteps.enterPassword(DataHelper.VALID_PASSWORD);
        authSteps.clickSignInButton();
        mainSteps.verifySuccessfulAuth();
        authSteps.logout();
        authSteps.checkAuthScreenVisible();
    }
}