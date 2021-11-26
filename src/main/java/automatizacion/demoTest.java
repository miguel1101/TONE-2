package automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class demoTest {
    private WebDriver driver;

    public static String KEY = "webdriver.chrome.driver";
    public static String DRIVER = "src/main/resources/driver/chromedriver.exe";
    public static String WEB = "http://automationpractice.com/index.php";


//localizadores
    public static By BTN_SIGNIN = By.className("login");
    //public static By BTN_SIGNIN = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    //public static By BTN_SIGNIN = By.linkText("Sign in");
    //public static By BTN_SIGNIN = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
    public static By TXT_EMAIL = By.id("email_create");
    public static By BTN_CREAR = By.id("SubmitCreate");
    public static By RBTN_SEXO = By.id("id_gender1");
    public static By TXT_NOMBRE1 = By.id("customer_firstname");
    public static By TXT_NOMBRE2 = By.id("customer_lastname");
    public static By TXT_PASS = By.id("passwd");
    public static By CHK_DIA = By.id("uniforms_days");
    //public static By CHK_DIAD = By.name("days");
    //public static By CHK_MES = By.id("uniforms_months");
    //public static By CHK_ANIO = By.id("uniform-years");
    public static By CHK_NEWS = By.id("uniform-newsletter");

    //YOUR ADDRESS
    public static By TXT_NOMBRE = By.id("firstname");
    public static By TXT_APELLIDO = By.id("lastname");
    public static By TXT_CIA = By.id("company");
    public static By TXT_DIR1 = By.id("address1");
    public static By TXT_DIR2 = By.id("address2");
    public static By TXT_CITY = By.id("city");
    public static By TXT_CP = By.id("postcode");
    public static By TXT_OTR = By.id("other");
    public static By TXT_TEF = By.id("phone");
    public static By TXT_CEL = By.id("phone_mobile");
    public static By TXT_ALIAS = By.id("alias");
    //listadesplegable ld;
    public static By BTN_REGISTRO = By.id("submitAccount");

    @Before
    public void setup () throws InterruptedException {
       //System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        System.setProperty(KEY, DRIVER);
       driver = new ChromeDriver();
       driver.manage().window().maximize();  // maximixar ventana
       //driver.get("http://automationpractice.com/index.php");
        //driver.get(WEB1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(WEB);
       //Thread.sleep(2000);


    }

    @Test
    public void test () throws InterruptedException {
        driver.findElement(BTN_SIGNIN).click();
        driver.findElement(TXT_EMAIL).sendKeys("miguel.carranza@tsoftlatam.com");
        driver.findElement(BTN_CREAR).click();
        driver.findElement(RBTN_SEXO).click();
        driver.findElement(TXT_NOMBRE1).sendKeys("Miguel");
        driver.findElement(TXT_NOMBRE2).sendKeys("Carranza");
        driver.findElement(TXT_PASS).sendKeys("12345");
        //driver.findElements(CHK_DIA).clic();
//       Select unif_days = new Select (driver.findElement(By.id("uniforms_days")));
  //      unif_days.selectByVisibleText("20");
       // unif_days.selectByIndex(20);

        /*public static void main (String[] args) {
            Select fruits = new Select (driver.findElement(By.id("fruits")));
            fruits.selectByVisibleText("Banana");
            fruits.selectByIndex(1);
*/
        //new ud = uniforms_days;


        //driver.findElement(CHK_DIA).findElements(CHK_DIAD);
        //driver.findElement(CHK_MES).isSelected("July");
        //driver.findElement(CHK_ANIO).isSelected("1980");
        driver.findElement(CHK_NEWS).click();
        driver.findElement(TXT_NOMBRE).clear();
        driver.findElement(TXT_NOMBRE).sendKeys("MigueL A");
        driver.findElement(TXT_APELLIDO).clear();
        driver.findElement(TXT_APELLIDO).sendKeys("Carranza Ch");
        driver.findElement(TXT_CIA).sendKeys("TSOFT PERU SAC");
        driver.findElement(TXT_DIR1).sendKeys("Dionisio Derteano 184");
        driver.findElement(TXT_DIR2).sendKeys("Canaval Moreyra");
        driver.findElement(TXT_CITY).sendKeys("Lima");
        driver.findElement(TXT_CP).sendKeys("15046");
        driver.findElement(TXT_OTR).sendKeys("A 2 cdras del Tambo");
        driver.findElement(TXT_TEF).sendKeys("012898765");
        driver.findElement(TXT_CEL).sendKeys("990888765");
        driver.findElement(TXT_ALIAS).clear();
        driver.findElement(TXT_ALIAS).sendKeys("Empresa");


        //Select dian = new Select(driver.findElement(By.name("days")));
        //dian.selectByVisibleText("-");

        //Selecting Items in a Multiple SELECT elements
        //driver.get(baseURL);
        //Select dian1 = new Select(driver.findElement(By.id("uniforms_days")));
       Select dia1 = null;
        new Select((WebElement) CHK_DIA).selectByVisibleText("-");
        //dian1.selectByVisibleText("20");
        //dian1.selectByIndex(21);
        assert dia1 != null;
        dia1.selectByValue("10");


//        driver.findElement(BTN_REGISTRO).click();
        Thread.sleep(10000);
    }


    @After
    public void tearDown ()  {
      //  driver.close();

    }

}
/*
public class accessDropDown {
    public static void main(String[] args) {
//      System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        System.setProperty(KEY, DRIVER);
        String baseURL = "http://automationpractice.com/index.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        //public static By CHK_DIA = By.id("uniforms_days");
        Select dian = new Select(driver.findElement(By.name("days")));
        dian.selectByVisibleText("-");
        //Selecting Items in a Multiple SELECT elements
        driver.get(baseURL);
        Select dian = new Select(driver.findElement(By.id("uniforms_days")));
        dian.selectByVisibleText("20");
        dian.selectByIndex(21);
    }
}
*/