import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class RunSelenide {


    @Test
    public void openUrl() throws InterruptedException {
        open("https://www.google.com/");
        $(By.xpath(".//a[text() = 'Почта']")).click();


    }


    @Test
    public void openUrl2() throws InterruptedException {
        open("https://www.google.com/");
        $(By.xpath(".//a[text() = 'Почта']")).click();


    }


    @Test
    public void openUrl3() throws InterruptedException {
        open("https://www.google.com/");
        $(By.xpath(".//a[text() = 'Почта']")).click();


    }


}
