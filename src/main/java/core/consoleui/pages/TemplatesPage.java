package core.consoleui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

// Add more elements as needed for your Templates UI

public class TemplatesPage {
    // Template (side menu) button
    @FindBy(xpath = "li[class='side-menu-list template-selected template'] div[class='side-menu-title']")
    public WebElement templateSideMenuBtn;

    // Minimize this button
    @FindBy(css = "div.unbxd-minize-button.open")
    public WebElement minimizeThisBtn;

    // Search input (search by template name)
    @FindBy(css = ".search-input-container input[type='text'][placeholder='Search by template name']")
    public WebElement searchInput;

    // Create Template button
    @FindBy(css = "button.unbxd-template-create")
    public WebElement createTemplateBtn;

    // Filters button
    @FindBy(css = ".app-common-button.secondary-button.unbxd-filter-button.btn.btn-primary")
    public WebElement filtersBtn;

    // Create New link
    @FindBy(css = "#create_template")
    public WebElement createNewLink;

    // Upload Template button
    @FindBy(css = "#upload_template")
    public WebElement uploadTemplateBtn;

    // Desktop (radio button)
    @FindBy(css = "label.unbxd-card-select[for='desktop']")
    public WebElement desktopRadioBtn;

    // Mobile (radio button)
    @FindBy(css = "label.unbxd-card-select[for='mobile']")
    public WebElement mobileRadioBtn;

    // Horizontal (radio button)
    @FindBy(css = "img.mr-2[src='/recs-v2/assets/images/horizontal.svg']")
    public WebElement horizontalRadioBtn;

    // Vertical (radio button)
    @FindBy(xpath = "//label[contains(@for,'vertical')]")
    public WebElement verticalRadioBtn;

    // Create Button (in the drawer footer)
    @FindBy(css = ".unbxd-side-drawer-footer button[type='button']")
    public WebElement createButton;

    // Template Name Input (top bar)
    @FindBy(css = ".name-modifier-container .modifier input[type='text']")
    public WebElement templateNameInput;

    // Back Button (top bar)
    @FindBy(css = ".unbxd-back-btn img[alt='']")
    public WebElement backBtn;

    // Advanced Code Editor Button
    @FindBy(css = "button.app-common-button.revert-vanilla.btn.btn-primary")
    public WebElement advancedCodeEditorBtn;

    // Save Button
    @FindBy(css = "button.unbxd-save-button")
    public WebElement saveButton;

    // Apply Template Button
    @FindBy(css = "button.app-common-button.btn.btn-primary.ml-2.mr-3")
    public WebElement applyTemplateBtn;

    // Template Type Dropdown
    @FindBy(css = ".template-dropdown-select.unbxd-new-dropdown button#dropdown-basic")
    public WebElement templateTypeDropdown;

    // Widget Size Input
    @FindBy(css = ".widget-size-value .input-value.input-group input[type='number']")
    public WebElement widgetSizeInput;

    // Products in Display Dropdown
    @FindBy(xpath = "//div[@class='unbxd-min-prods']//button[@id='dropdown-basic']")
    public WebElement productsInDisplayDropdown;

    // Global Add-ons Checkbox
    @FindBy(css = "input#global")
    public WebElement globalAddonsCheckbox;

    // Like Button Checkbox
    @FindBy(css = "input#like")
    public WebElement likeButtonCheckbox;

    // Dislike Button Checkbox
    @FindBy(css = "input#dislike")
    public WebElement dislikeButtonCheckbox;

    // Add to Wishlist Button Checkbox
    @FindBy(css = "input#wishlist")
    public WebElement addToWishlistButtonCheckbox;

    // Share Button Checkbox
    @FindBy(css = "input#shareable")
    public WebElement shareButtonCheckbox;

    // Edit Global Add-ons Icon
    @FindBy(css = ".template-actions-global-addon img.unbxd-template-action-icons")
    public WebElement editGlobalAddonsIcon;

    // Unit Dropdown
    @FindBy(xpath = "//div[@class='in-row mb-4']//button[@id='dropdown-basic']")
    public WebElement unitDropdown;

  

    @FindBy(css="button[class='btn btn-primary']")
    public WebElement proceedTemplateBtn;

    @FindBy(css="div[class='template-horizontal-view template-list'] div:nth-child(1) div:nth-child(2) span:nth-child(3) img:nth-child(1)")
    public WebElement editTemplateBtn;

    @FindBy(css="body > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)")
    public WebElement deleteTemplateBtn;
    
    @FindBy(css="button[class='btn btn-primary']")
    public WebElement confirmDeleteBtn;

    @FindBy(xpath = "//button[normalize-space()='Yes']")
    public WebElement yesBtn;

    @FindBy(css="#widget-horizontal")
    public WebElement horizontalWidget;

    @FindBy(css="#widget-vertical")
    public WebElement verticalWidget;

    @FindBy(xpath="//div[@class='col-12 p-0 mb-4']//button[@id='dropdown-basic']")
    public WebElement buttonPositionDropdown;

    @FindBy(css = "button.app-common-button.revert-vanilla.btn.btn-primary.demo-button")
    public WebElement demoPreviewButton;

    @FindBy(css = "#widget-horizontal1")
    public WebElement horizontalBoutiqueWidgetFrame;

    @FindBy(css = ".text")
    public WebElement backToTemplateCustomization;

    @FindBy(css = ".marvel-device.iphone8.silver")
    public WebElement mobileFrame;

    @FindBy(xpath = "//div[@class='col-12 p-0 m-0 mt-4']//button[@id='dropdown-basic']")
    public WebElement behaviourBasedOnDropdown;

    @FindBy(xpath = "//div[@class='d-flex algin-items-center']//button[@id='dropdown-basic']")
    public WebElement maximumProductsDropdown;

    @FindBy(css = "ul.unbxd_recs-boutique-tinder-container li._unbxd_recs-boutique-tinder__item")
    public List<WebElement> tinderProductCards;

    @FindBy(css = "._unbxd_recs-boutique-insta-container > ._unbxd_recs-boutique__item")
    public java.util.List<org.openqa.selenium.WebElement> instagramBehavior;

    @FindBy(css = "div.unbxd-side-drawer-footer span")
    public WebElement nextBtn;

    @FindBy(css = "input.input-text[placeholder='Enter template name']")
    public WebElement enterNameField;

    @FindBy(css = "input#bulk-upload")
    public WebElement uploadFromDevice;

    @FindBy(css = "button.app-common-button.btn.btn-primary span")
    public WebElement proceedBtn;
} 
 