package org.example.stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Given("Pengguna berada di halaman login")
    @Given("Pengguna membuka halaman login")
    public void pengguna_di_halaman_login() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("Pengguna memasukkan username {string}")
    public void masukkan_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("Pengguna memasukkan password {string}")
    public void masukkan_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("Pengguna memasukkan username {string} dan password {string}")
    public void pengguna_memasukkan_username_dan_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("Pengguna menekan tombol login")
    @And("Pengguna mengklik tombol login")
    public void klik_login() {
        loginPage.clickLoginButton();
    }

    @Then("Pengguna diarahkan ke dashboard utama")
    public void verifikasi_dashboard() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Login berhasil", expectedUrl, actualUrl);
    }

    @Then("Pengguna tetap di halaman login")
    public void pengguna_tetap_di_halaman_login() {
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Login gagal, tetap di halaman login", expectedUrl, actualUrl);
    }

    @Then("Pengguna melihat pesan error {string}")
    public void pengguna_melihat_pesan_error(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Pesan error tidak sesuai", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
