package ChromRunner;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Chrom{
    @BeforeTest
    public void Tests(){
        open("https://ee.ge/");
    }
}
