import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;


    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_3_XL_API_30)");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("appPackage", "com.kerem.yedekparca");
        caps.setCapability("appActivity",".MainActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 15);
    }

    @Test
    public void ArabaModeliTest () throws InterruptedException {

        ArabaModeli();
    }
    @Test
    public void eskiYilTest () throws InterruptedException {
        eskiYil();
    }
    @Test
    public void gelecekYilTest () throws InterruptedException {
        gelecekYil();
    }
    @Test
    public void parcaAdiTest () throws InterruptedException {
        parcaAdi();
    }
    @Test
    public void parcaMarkasiTest () throws InterruptedException {
        parcaMarkasi();
    }
    @Test
    public void parcaKategorisiTest () throws InterruptedException {
        parcaKategorisi();
    }
    @Test
    public void uyumluAracTest () throws InterruptedException {
        uyumluArac();
    }
    @Test
    public void uyumluAracKayitliseTest () throws InterruptedException{
        uyumluAracKayitlise();
    }
    @Test
    public void eskiModelYiliTest () throws InterruptedException {
        eskiModelYili();
    }
    @Test
    public void gelecekModelYiliTest () throws InterruptedException {
        gelecekModelYili();
    }
    @Test
    public void stokAdediTest () throws InterruptedException {
        stokAdedi();
    }
    @Test
    public void aracEklemeTest () throws InterruptedException {
        aracEkleme();
    }
    @Test
    public void aracModelTest () throws InterruptedException {
        aracModel();
    }
    @Test
    public void kasaTipiTest () throws InterruptedException {
        kasaTipi();
    }
    @Test
    public void eskiUretimYiliTest () throws InterruptedException {
        eskiUretimYili();
    }
    @Test
    public void gelecekUretimYilitest () throws InterruptedException {
        gelecekUretimYili();
    }
    @Test
    public void StokParcaAdiTest () throws InterruptedException {
        StokParcaAdi();
    }
    @Test
    public void StokParcaMarkasTest () throws InterruptedException {
        StokParcaMarkasi();
    }
    @Test
    public void StokYoksaTest () throws InterruptedException {
        StokYoksa();
    }
    @Test
    public void parcaSilmeAdiTest () throws InterruptedException{
        ParcaAdi();
    }
    @Test
    public void ParcaSilmeAdiTest () throws InterruptedException{
        PracaYoksa();
    }
    @Test
    public void parcaSilmeMarkasiTest () throws InterruptedException{
        ParcaMarkasi();
    }
    @Test
    public void ParcaSilmeMarkasiTest () throws InterruptedException{
        MarkaYoksa();
    }
    @Test
    public void GrisiYapilmazsaTest () throws InterruptedException{
        GirisYailmazsa();
    }



    public void ArabaModeli() throws InterruptedException {

        MobileElement ModelTanimla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/araba_modeli_tanimla")));
        ModelTanimla.click();
        MobileElement Marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arabaMarkasiGirme")));
        Marka.sendKeys("");
        MobileElement Model =(MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/modelGirme")));
        Model.sendKeys("A3");
        MobileElement Yil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yilGirme")));
        Yil.sendKeys("1999");
        MobileElement Filtre = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/filtre")));
        Filtre.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Marka kısmı boş geçilemez");



    }
    public void eskiYil() throws InterruptedException{
        MobileElement ModelTanimla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/araba_modeli_tanimla")));
        ModelTanimla.click();
        MobileElement Marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arabaMarkasiGirme")));
        Marka.sendKeys("Audi");
        MobileElement Model =(MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/modelGirme")));
        Model.sendKeys("A3");
        MobileElement Yil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yilGirme")));
        Yil.sendKeys("1911");
        MobileElement Filtre = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/filtre")));
        Filtre.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");
    }
    public void gelecekYil() throws InterruptedException{
        MobileElement ModelTanimla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/araba_modeli_tanimla")));
        ModelTanimla.click();
        MobileElement Marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arabaMarkasiGirme")));
        Marka.sendKeys("Audi");
        MobileElement Model =(MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/modelGirme")));
        Model.sendKeys("A3");
        MobileElement Yil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yilGirme")));
        Yil.sendKeys("2500");
        MobileElement Filtre = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/filtre")));
        Filtre.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");
    }
    public void parcaAdi() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement parcaMarka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        parcaMarka.sendKeys("Audi");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça Adı kısmı boş geçilemez");
    }
    public void parcaMarkasi() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("Audi");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça markası kısmı boş geçilemez");
    }
    public void parcaKategorisi() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("Audi");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça kategorisi kısmı boş geçilemez");

    }
    public void uyumluArac() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Araç markası kısmı boş geçilemez");

    }

    public void uyumluAracKayitlise() throws InterruptedException{
        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("LM1570");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Bosch");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("Buji");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("BMW");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Belirtilen Türde Bir Araç Bulunamamıştır Lütfen Sistem Yöneticisi İle Görüşün");

    }
    public void eskiModelYili() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("Audi");
        MobileElement aracYili = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_yil")));
        aracYili.sendKeys("1320");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");

    }
    public void gelecekModelYili() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement uyumluArac = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        uyumluArac.sendKeys("Audi");
        MobileElement aracYili = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_yil")));
        aracYili.sendKeys("2500");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("20");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");
    }
    public void stokAdedi() throws InterruptedException{

        MobileElement YedekParcaEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/yedek_parca_ekle")));
        YedekParcaEkleme.click();
        MobileElement  parcaAdi= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_markasi")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement parcaKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_kategorisi")));
        parcaKtg.sendKeys("fren sistemi");
        MobileElement parcaMarka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_marka")));
        parcaMarka.sendKeys("");
        MobileElement aracYili = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_yil")));
        aracYili.sendKeys("1320");
        MobileElement stok = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_adedi")));
        stok.sendKeys("");
        MobileElement kaydet = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kaydet")));
        kaydet.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Stok adedi kısmı boş geçilemez");
    }
    public void aracEkleme() throws InterruptedException{

        MobileElement AracEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_ekle")));
        AracEkleme.click();
        MobileElement marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/marka")));
        marka.sendKeys("");
        MobileElement aracModeli = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/model")));
        aracModeli.sendKeys("A3");
        MobileElement KasaTipi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kasaTipi")));
        KasaTipi.sendKeys("Sedan");
        MobileElement uretim = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/uretimYili")));
        uretim.sendKeys("2000");
        MobileElement SistemEkle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button2")) );
        SistemEkle.click();
        MobileElement errorMassage = (MobileElement)driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Marka kısmı boş geçilemez");
    }
    public void aracModel() throws InterruptedException{
        MobileElement AracEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_ekle")));
        AracEkleme.click();
        MobileElement marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/marka")));
        marka.sendKeys("Audi");
        MobileElement aracModeli = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/model")));
        aracModeli.sendKeys("");
        MobileElement KasaTipi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kasaTipi")));
        KasaTipi.sendKeys("Sedan");
        MobileElement uretim = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/uretimYili")));
        uretim.sendKeys("2000");
        MobileElement SistemEkle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button2")) );
        SistemEkle.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Model kısmı boş geçilemez");

    }
    public void kasaTipi() throws InterruptedException{
        MobileElement AracEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_ekle")));
        AracEkleme.click();
        MobileElement marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/marka")));
        marka.sendKeys("Audi");
        MobileElement aracModeli = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/model")));
        aracModeli.sendKeys("A3");
        MobileElement KasaTipi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kasaTipi")));
        KasaTipi.sendKeys("");
        MobileElement uretim = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/uretimYili")));
        uretim.sendKeys("2000");
        MobileElement SistemEkle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button2")) );
        SistemEkle.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Kasa tipi kısmı boş geçilemez");
    }
    public void eskiUretimYili() throws InterruptedException{
        MobileElement AracEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_ekle")));
        AracEkleme.click();
        MobileElement marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/marka")));
        marka.sendKeys("Audi");
        MobileElement aracModeli = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/model")));
        aracModeli.sendKeys("A3");
        MobileElement KasaTipi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kasaTipi")));
        KasaTipi.sendKeys("Sedan");
        MobileElement uretim = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/uretimYili")));
        uretim.sendKeys("1500");
        MobileElement SistemEkle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button2")) );
        SistemEkle.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");
    }
    public void gelecekUretimYili() throws InterruptedException{
        MobileElement AracEkleme = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/arac_ekle")));
        AracEkleme.click();
        MobileElement marka = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/marka")));
        marka.sendKeys("Audi");
        MobileElement aracModeli = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/model")));
        aracModeli.sendKeys("A3");
        MobileElement KasaTipi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/kasaTipi")));
        KasaTipi.sendKeys("Sedan");
        MobileElement uretim = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/uretimYili")));
        uretim.sendKeys("2230");
        MobileElement SistemEkle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button2")) );
        SistemEkle.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girilen yıllar istenilen aralıkta değildir(1950-2023)");
    }
    public void StokParcaAdi() throws InterruptedException{
        MobileElement StokSorgulama = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_sorgulama")));
        StokSorgulama.click();
        MobileElement parcaAdii = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaAdi")));
        parcaAdii.sendKeys("");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaMarka")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement pKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaKategori")));
        pKtg.sendKeys("Fren sistemi");
        MobileElement StokSorgula = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button3")));
        StokSorgula.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça Adı kısmı boş geçilemez");
    }
    public void StokParcaMarkasi() throws InterruptedException{
        MobileElement StokSorgulama = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_sorgulama")));
        StokSorgulama.click();
        MobileElement parcaAdii = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaAdi")));
        parcaAdii.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaMarka")));
        parcaMarkasi.sendKeys("");
        MobileElement pKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaKategori")));
        pKtg.sendKeys("Fren sistemi");
        MobileElement StokSorgula = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button3")));
        StokSorgula.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça Markası kısmı boş geçilemez");
    }
    public void StokYoksa() throws InterruptedException{
        MobileElement StokSorgulama = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/stok_sorgulama")));
        StokSorgulama.click();
        MobileElement parcaAdii = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaAdi")));
        parcaAdii.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaMarka")));
        parcaMarkasi.sendKeys("audi");
        MobileElement pKtg = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parcaKategori")));
        pKtg.sendKeys("");
        MobileElement StokSorgula = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button3")));
        StokSorgula.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Aranan Özellikte Parça Bulunamamıştır");
    }
    public void ParcaAdi() throws InterruptedException{
        MobileElement parcaSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_sil")));
        parcaSil.click();
        MobileElement parcaAdi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi_yedek")));
        parcaAdi.sendKeys("");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_marka")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement ParcayiSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button4")));
        ParcayiSil.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça Adı kısmı boş geçilemez");

    }
    public void PracaYoksa() throws InterruptedException{
        MobileElement parcaSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_sil")));
        parcaSil.click();
        MobileElement parcaAdi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi_yedek")));
        parcaAdi.sendKeys("elma");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_marka")));
        parcaMarkasi.sendKeys("Audi");
        MobileElement ParcayiSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button4")));
        ParcayiSil.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girdiğiniz parça adı sistemde bulunmamaktadır.");

    }
    public void ParcaMarkasi() throws InterruptedException{
        MobileElement parcaSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_sil")));
        parcaSil.click();
        MobileElement parcaAdi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi_yedek")));
        parcaAdi.sendKeys("fren");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_marka")));
        parcaMarkasi.sendKeys("");
        MobileElement ParcayiSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button4")));
        ParcayiSil.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Parça markası kısmı boş geçilemez");
    }
    public void MarkaYoksa() throws InterruptedException{
        MobileElement parcaSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_sil")));
        parcaSil.click();
        MobileElement parcaAdi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi_yedek")));
        parcaAdi.sendKeys("GYR_84");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_marka")));
        parcaMarkasi.sendKeys("elma");
        MobileElement ParcayiSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button4")));
        ParcayiSil.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Girdiğiniz marka da parça bulunmamaktadır.");
    }
    public void GirisYailmazsa() throws InterruptedException{
        MobileElement parcaSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_sil")));
        parcaSil.click();
        MobileElement parcaAdi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_adi_yedek")));
        parcaAdi.sendKeys("");
        MobileElement parcaMarkasi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/parca_marka")));
        parcaMarkasi.sendKeys("");
        MobileElement ParcayiSil = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.kerem.yedekparca:id/button4")));
        ParcayiSil.click();
        MobileElement errorMassage = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
        assertEquals(errorMassage.getText(), "Lütfen Parçaadı ve markası giriniz.");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

