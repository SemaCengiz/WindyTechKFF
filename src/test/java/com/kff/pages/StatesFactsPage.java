package TestCases;



import java.util.List;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {
WebDriver driver = Driver.getDriver();
	public StatesFactsPage() {
		PageFactory.initElements(driver, this);
	}


	
	//1213
	@FindBy(xpath="//ul[@class='top-left-list']/li")
	public WebElement ChooseCategLink;
	
	 @FindBy(xpath="//div[@class='box light-blue']/h1")
	    public WebElement ChooseCategoryText;
	
	//1204
	@FindBy(xpath ="//select[@name='geo-picker']")
	public WebElement stateSelectBtn;
	
   @FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
   public WebElement acceptBtnCookie;

   
   @FindBy(xpath="//div[@class='box']//h2")
   public WebElement statePageTitle;

//   @FindBy(xpath ="//select[@class='geo-picker']//option[2]")
//	public WebElement stateSelectBtn2;
   




}


	@FindBy(xpath="//div[@class='inner']/ul/li/a")
	public WebElement aboutStateHealthFactsLink;
	
	@FindBy(xpath="//div[@id='hs-eu-cookie-confirmation-inner']/div/a")
	public WebElement cookieAcceptButton;
	
	@FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	public WebElement cookieAcceptButtonStateFacts;
	


	@FindBy(xpath = "//*[@id='search-field']")
	public WebElement searchBox1;
	// //*[@id="search-field"]

	@FindBy(xpath = "//*[@id=\"search-submit\"]")
	public WebElement searchBoxButton;

	@FindBy(xpath = "//*[@id=\"refine-results-header-top\"]/div/h4")
	public WebElement resultFilterTitle;
			
		  
		@FindBy(xpath="//*[@class=\"datamaps-subunit TX\"]")
		public WebElement Texas;
		
		@FindBy(xpath="//*[@class=\"datamaps-subunit CO\"]")
		public WebElement Colorado;
		
		@FindBy(xpath="//*[@class=\"datamaps-subunit MN\"]")
		public WebElement Minnesota;
		

		
		//Test case 1210 WebElemnts by Guldana
		@FindBy(id = "search-field")
		public WebElement mainSearchBtnOnKFF;
		
		
		@FindBy(id="search-submit")
		public WebElement searchSubmitBtn;
		
		
		@FindBy(xpath="//div[@class='box']//section[@class='search-results-wrapper']//a")
		public List<String> hivSearchResults;	
		
		
		
		@FindBy(id= "search-field")
		public WebElement searchBox;

		@FindBy(id = "search-submit")
		public WebElement sumbitButton;

		@FindBy(xpath = "//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']")
		public WebElement CheckIfMapIsVisible;

		@FindBy(id="hs-eu-confirmation-button")
		public WebElement cookie;


		@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit OH']")
		public WebElement Ohio;

		@FindBy(xpath = "//*[@id=\"state-path-wrapper\"]/div[1]/h2")
		public WebElement CathandIndisdesplayed;

		@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']")
		public WebElement Alabama;

		@FindBy(xpath = "//*[@id=\"state-path-wrapper\"]/div[1]/h2")
		public WebElement CathandIndAl;

		@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit NC']")
		public WebElement NorthCaralina;


		@FindBy(xpath="//*[@id=\"state-path-wrapper\"]/div[1]/h2")
		public WebElement CatandIndiNorth;

		//1213
		@FindBy(xpath="//ul[@class='top-left-list']/li")
		public WebElement ChooseCategLink;
		
		 @FindBy(xpath="//div[@class='box light-blue']/h1")
		    public WebElement ChooseCategoryText;
		
		//1204
		@FindBy(xpath ="//select[@name='geo-picker']")
		public WebElement stateSelectBtn;
		
	   @FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	   public WebElement acceptBtnCookie;

	   
	   @FindBy(xpath="//div[@class='box']//h2")
	   public WebElement statePageTitle;

//      @FindBy(xpath ="//select[@class='geo-picker']//option[2]")
//		public WebElement stateSelectBtn2;
	
		
}

