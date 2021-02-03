package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentPage {
    public WebDriver driver;
    public JavascriptExecutor js;

    public ContentPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    //1. web elements

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[6]/li/a")
    WebElement linksPage;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")
    WebElement myLinksTab;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]/h5/a")
    WebElement globalLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")
    WebElement sharedTab;

    //a[href='https://globallink.com']")
    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[2]/div/app-mycontent-item/div/div/div[2]/div[2]/div/div[1]/div[1]/div/span[2]/a")
    @FindBy(xpath = "//i[contains(@class,'fa fa-external-link')]")
    WebElement sharedGlobalLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[7]/li/a")
    WebElement notesLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")
    WebElement myNotesTab;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")
    WebElement sharedNoteTab;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[1]/div/a")
    WebElement firstNoteTag;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]/h5/a")
    WebElement firstNoteTitle;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[2]/div/app-mycontent-item[1]/div/div/div[1]/div[1]")
    WebElement likeBtnInSharedNote;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[2]/div/app-mycontent-item[1]/div/div/div[1]/div[2]")
    WebElement likeCounter;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/div/button[1]")
    WebElement addIcon;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/div/button[2]")
    WebElement addLinkIcon;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/div/button[3]")
    WebElement addNoteIcon;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/div/button")
    WebElement closeAddLinkIcon;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/form/div[1]/div/div[1]/mat-form-field/div/div[1]/div/input")
    WebElement addLinkNameInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/form/div[1]/div/div[2]/mat-form-field/div/div[1]/div/input")
    WebElement addLinkUrlInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/form/div[1]/div/div[3]/mat-form-field/div/div[1]/div/textarea")
    WebElement addLinkDescriptionInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/form/div[1]/div/div[4]/tag-input/div/div/tag-input-form/form/input")
    WebElement addLinkTagInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[2]/div/div/form/div[2]/button[2]")
    WebElement addLinkSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/mat-form-field/div/div[1]/div/input")
    WebElement addNoteTitleInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[1]/div[1]/div[1]/input")
    WebElement noteWithLinkYesOption;
    //following one element only for note with link once yes is chosen
    //1. url
    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[2]/div/mat-form-field/div/div[1]/div/input")
    WebElement notewithLinkUrlInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[1]/div[1]/div[2]/input")
    WebElement noteWithLinkNoOption;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[1]/div[2]/div[2]/input")
    WebElement publicStatusOption;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[1]/div[2]/div[1]/input")
    WebElement privateStatusOption;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[2]/div/quill-editor/div[2]/div[1]")
    WebElement addNoteDescriptionInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag-input-form/form/input")
    WebElement addNoteTagInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[1]")
    WebElement addNoteSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[2]")
    WebElement addNoteBackBtn;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]/h5/a")
    WebElement newAddedLinkTitle;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div")
    WebElement newAddedLinkDescription;

    @FindBy(css="a[href='https://www.amazon.com']")
    WebElement newAddedLinkUrl;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[2]/div/app-mycontent-item[1]/div/div/div[2]/div[2]/div/div[1]/div[1]/div")
    WebElement sharedFirstNoteTitleAndTag;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/i")
    WebElement editLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[5]/div[1]/i")
    WebElement deleteLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/i")
    WebElement editNote;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[1]/i")
    WebElement deleteNote;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[1]/div/a")
    WebElement noteWithLinkTag;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-content/div[1]/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/h5/a")
    WebElement noteWithLinkTitle;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag-input-form/form/input")
    WebElement noteWithlinkTagInput;


    //2. test methods
    public String getContentPageTitle(){
       String contentPageTitle = driver.getTitle();
        System.out.println("page tile of content page is : "+contentPageTitle);
       return contentPageTitle;

    }

    public void clickLinksPage()throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",linksPage);
        Thread.sleep(2000);
        //myLinksTab.click();
        js.executeScript("arguments[0].click()",linksPage);

        //linksPage.click();
        Thread.sleep(3000);
    }

    public void clickMyLinksTab() throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",myLinksTab);
        //myLinksTab.click();
        js.executeScript("arguments[0].click()",myLinksTab);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

    public String clickOnFirstMyLink() throws Exception{
        String parentPageHandle= driver.getWindowHandle();
        System.out.println("title before clicking shared link: "+driver.getTitle());
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",globalLink);
        Thread.sleep(3000);
        for(String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String newLinkPageTitle = driver.getTitle();
        System.out.println("opened link title is: "+newLinkPageTitle);
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentPageHandle);
        Thread.sleep(3000);
        return newLinkPageTitle;
    }

    public void clickSharedTab()throws Exception{
        js=(JavascriptExecutor)driver;
        //js.executeScript("arguments[0].rollIntoView",sharedTab);
        js.executeScript("arguments[0].click()",sharedTab);
        Thread.sleep(3000);
    }

    public String clickSharedLinkAndReturn()throws Exception{
        String parentPageHandle= driver.getWindowHandle();
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",sharedGlobalLink);
        Thread.sleep(3000);
        for(String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String sharedLinkTitle = driver.getTitle();
        System.out.println("opened link title is: "+sharedLinkTitle);
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentPageHandle);
        Thread.sleep(3000);
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",sharedGlobalLink);
        Thread.sleep(2000);
        return sharedLinkTitle;
    }

    public void clickNotesLink()throws Exception{
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",notesLink);
        Thread.sleep(2000);
    }

    public void clickMyNotesTab() throws Exception{
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",myNotesTab);
        Thread.sleep(3000);
    }

    public String firstNoteVerification()throws Exception{
        String tagAndContent =firstNoteTag.getText()+" and "+firstNoteTitle.getText();
        return tagAndContent;
    }

    public void clickSharedNotesTab() throws Exception{
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",sharedNoteTab);
        Thread.sleep(3000);
    }

    public boolean verifyLikeCounter() throws Exception{
        likeBtnInSharedNote.click();
        Thread.sleep(2000);
        String firstLikeClick = likeCounter.getText();;
        Thread.sleep(2000);
        likeBtnInSharedNote.click();
        String secondLikeClick = likeCounter.getText();
        Thread.sleep(2000);
        Assert.assertEquals(secondLikeClick,firstLikeClick);
        return true;
    }

    public void clickAddIcon() throws Exception {
        addIcon.click();
        Thread.sleep(3000);
    }

    public void clickAddLinkIcon() throws Exception {
        addLinkIcon.click();
        Thread.sleep(3000);
    }
    public void closeAddLinkAndOpenAgain()  throws Exception{
        closeAddLinkIcon.click();
        Thread.sleep(2000);
        addLinkIcon.click();
        Thread.sleep(2000);

    }

    public void addALink(String linkName, String url, String description, String tag) throws Exception{
        addLinkNameInput.sendKeys(linkName);
        Thread.sleep(1000);
        addLinkUrlInput.sendKeys(url);
        Thread.sleep(1000);
        addLinkDescriptionInput.sendKeys(description);
        Thread.sleep(1000);
        addLinkTagInput.sendKeys(tag);
        Thread.sleep(2000);
        addLinkSaveBtn.click();
        Thread.sleep(1000);
        addLinkSaveBtn.click();
        Thread.sleep(3000);

    }

    public String verifyAddedLinkTitleAndTag() throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",linksPage);

        String parentPageHandle= driver.getWindowHandle();
        System.out.println("title before clicking shared link: "+driver.getTitle());
        js.executeScript("arguments[0].click()",newAddedLinkUrl);
        Thread.sleep(3000);
        for(String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String newLinkPageTitle = driver.getTitle();
        System.out.println("opened link title is: "+newLinkPageTitle);
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentPageHandle);
        Thread.sleep(3000);
        String linkName = newAddedLinkTitle.getText();
        String description = newAddedLinkDescription.getText();
        Thread.sleep(2000);
        String linkNameAndDescription = linkName + " and "+description;
        System.out.println("actual title and description for new added link is: "+linkNameAndDescription);
        return linkNameAndDescription;
    }


    public void clickAddNoteIcon() throws Exception {
        addNoteIcon.click();
        Thread.sleep(3000);
    }

    public void backToNotesPage() throws Exception {
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",addNoteBackBtn);
        //addNoteBackBtn.click();
        Thread.sleep(2000);
    }

    public void addNote(String title, String description, String tag) throws Exception{
        js=(JavascriptExecutor)driver;
        addNoteTitleInput.sendKeys(title);
        publicStatusOption.click();
        Thread.sleep(2000);
        addNoteDescriptionInput.sendKeys(description);
        js.executeScript("arguments[0].scrollIntoView();",addNoteTagInput);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",addNoteTagInput);
        addNoteTagInput.sendKeys(tag);
        Thread.sleep(2000);
        addNoteSaveBtn.click();
        Thread.sleep(2000);
        addNoteSaveBtn.click();
        Thread.sleep(3000);
    }

    public String verifyAddedNoteTitleAndTag() throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",notesLink);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",sharedNoteTab);
        Thread.sleep(2000);
        String titleAndTag = sharedFirstNoteTitleAndTag.getText();
        Thread.sleep(2000);
        System.out.println("actual title and tag for new added note is: "+titleAndTag);
        return titleAndTag;
    }

    public void addNoteWithLink(String title, String url, String tag) throws Exception{
        js=(JavascriptExecutor)driver;
        addNoteTitleInput.sendKeys(title);
        noteWithLinkYesOption.click();
        Thread.sleep(1000);
        publicStatusOption.click();
        Thread.sleep(1000);
        privateStatusOption.click();
        notewithLinkUrlInput.sendKeys(url);
        js.executeScript("arguments[0].scrollIntoView();",noteWithlinkTagInput);
        //js.executeScript("arguments[0].click()",noteWithlinkTagInput);
        noteWithlinkTagInput.sendKeys(tag);
        addNoteSaveBtn.click();
        Thread.sleep(2000);
        addNoteSaveBtn.click();
        Thread.sleep(3000);
    }

    public String verifyNewAddedNoteWithLink() throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",notesLink);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click()",firstNoteTitle);
        Thread.sleep(3000);
        System.out.println("page title for this shared link is: "+driver.getTitle());
        driver.navigate().back();
        Thread.sleep(5000);
        js.executeScript("arguments[0].click()",notesLink);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",myNotesTab);
        Thread.sleep(2000);
        String firstNoteTagAndTitle = firstNoteTag.getText() +" and "+firstNoteTitle.getText();
        System.out.println("tag and content of this link is: "+firstNoteTagAndTitle);
        return firstNoteTagAndTitle;
    }
    public void deleteSharedLink()throws Exception{
        js=(JavascriptExecutor)driver;
        editLink.click();
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();",deleteLink);
        js.executeScript("arguments[0].click();",deleteLink);
        //deleteLink.click();
        Thread.sleep(3000);
    }
    public void deleteSharedNote()throws Exception{
        js=(JavascriptExecutor)driver;
        editNote.click();
        js.executeScript("arguments[0].scrollIntoView();",deleteNote);
        js.executeScript("arguments[0].click();",deleteNote);
        Thread.sleep(3000);
        deleteNote.click();
        Thread.sleep(3000);

    }

}
