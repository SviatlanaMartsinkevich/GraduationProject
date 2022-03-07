package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends BasePage {
    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//span[@aria-label='Appswitcher Icon']");
    protected By create_button_selector = By.xpath("//span[text()='Create']");
    protected By projects_button_selector = By.xpath("//div[@class='css-d6vpf6']/preceding::div[@class='css-d6vpf6']");
    protected By createProject_button_selector = By.xpath("//button[@class='css-s37vvz']");


    public Header(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void openPage() {

    }

    @Override
    protected boolean isPageOpened() {
        return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
    }

    public WebElement getProjectsButton() {
        return driver.findElement(projects_button_selector);
    }

    public WebElement getCreateProjectButton() {
        return driver.findElement(createProject_button_selector);
    }

    public WebElement getCreateButton() {
        waits.waitForVisibility(create_button_selector);
        return driver.findElement(create_button_selector);
    }


}
