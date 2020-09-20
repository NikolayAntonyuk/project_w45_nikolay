package kolya.Task5.ui_tests.MK;

import kolya.Task5.data.UserMK;
import kolya.Task5.data.Projects;
import kolya.Task5.runners.Debug;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginMKtest extends Debug {

    @Test
    public void checkLogin() {
        open(Projects.MK_MAIN_PAGE.getUrl());
        MKLoginPage.fillTheFieldLogin(UserMK.LOGIN.getValue());
        MKLoginPage.pressButtonDali();
        MKPasswordPage.fillTheFieldPassword(UserMK.PASSWORD.getValue());
        MKPasswordPage.pressButtonUviyty();
        MKMinePage.checkProfileIcon();
        open(Projects.MK_OFFERS_PAGE.getUrl());

        MKOffersPage.pressButton("Детали");
        MKOffersPage.pressButton("Деталі");
        MKOffersPage.checkSearchResults("Три услуги со скидкой до 50%! Получите все вместе: мобильную связь (безлимитный  интернет, 180 мин на другие мобильные),  Домашний Интернет и 130+ телеканалов Киевстар ТВ за акционную плату 250 грн до 3-х месяцев. Далее 350 грн/мес. Закажите сейчас тариф *\"Все вместе Выгодный+ТВ*/"");




    }

}
