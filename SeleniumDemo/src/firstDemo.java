import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver(); // WB is inheritance, this line will launch the chrome
    driver.get("https://google.com");
    driver.get("https://youtube.com");
    driver.manage().window().maximize();
    WebElement element = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[1]/yt-formatted-string"));
    element.click();   //webaction
    WebElement Element = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-grid-row[1]/div/ytd-rich-item-renderer[1]/div/ytd-rich-grid-media/div[1]/div[1]/ytd-playlist-thumbnail/a/div[1]/ytd-playlist-video-thumbnail-renderer/yt-image/img"));
	Element.click();
	}
	
	

}
