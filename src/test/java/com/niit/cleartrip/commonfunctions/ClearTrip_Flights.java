package com.niit.cleartrip.commonfunctions;

public class ClearTrip_Flights {
/*	
	public static GenericMethods genericMethods;
	public static WebDriver driver;
		
	public static void main(String[] args) throws IOException, InterruptedException {
		
	//signUp();
	//signIn();
	//oneWay();
	//roundTrip();
	//signOut();
	}
	public static WebDriver openClearTrip(){
		
		driver = Methods.chrome();
		genericMethods=new GenericMethods(driver);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void signUp() throws IOException, InterruptedException{
		
		WebDriver driver=openClearTrip();
				
		genericMethods.click("com.cleartrip.flights.userAccount");
		
		//driver.findElement(PropTest.getByValue("com.cleartrip.flights.userAccount")).click();//THIS STEP IS TAKEN CARE BY GENERIC METHOD 'CLICK' AS ABOVE

		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.switchTo().alert().accept();HOW TO HANDLE THE ALERT HERE?? - That is not a normal alert but window alert which cannot be handled by WebDriver
		driver.switchTo().frame("modal_window");
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.email")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.emailValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.submit")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.password")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.register.passwordValue"));
		WebElement we = driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.title"));
		Select dd = new Select(we);
		dd.selectByValue(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.register.titleValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.firstname")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.register.firstnameValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.lastname")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.register.lastnameValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.mobilenumber")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.register.mobilenumberValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.register.signUp")).click();
		}
		
	public static WebDriver signIn() throws IOException{
		driver = openClearTrip();
		
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount")).click();
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.signIn")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().frame("modal_window");
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.signIn.email")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.signIn.emailValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.signIn.password")).sendKeys(LoadProperties.getDerivedProperty("com.cleartrip.flights.userAccount.signIn.passwordValue"));
		driver.findElement(ByClass.getByValue("com.cleartrip.flights.userAccount.signInButton")).click();
		return driver;
				
			}
	
	public static void oneWay() throws IOException{
		
		driver = signIn();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWayRadio")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.From")).sendKeys(PropTest.getKeyValue("com.cleartrip.flights.oneWay.FromValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.To")).sendKeys(PropTest.getKeyValue("com.cleartrip.flights.oneWay.ToValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.DepartOn")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.DepartOnValue")).click();
		WebElement wea= driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.Adults"));
		Select Adults = new Select(wea);
		Adults.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.oneWay.AdultsValue"));
		WebElement wec= driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.Children"));
		Select Child = new Select(wec);
		Child.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.oneWay.ChildrenValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.MoreOptions")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.oneWay.SearchFlights")).click();
		
	}
	
	public static void roundTrip() throws IOException{
		
		WebDriver driver = signIn();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTripRadio")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.From")).sendKeys(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.FromValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.To")).sendKeys(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.ToValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.DepartOn")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.DepartOnValue")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.ReturnOn")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.ReturnOnValue")).click();
		WebElement wea= driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.Adults"));
		Select Adults = new Select(wea);
		Adults.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.AdultsValue"));
		WebElement wec= driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.Children"));
		Select Child = new Select(wec);
		Child.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.ChildrenValue"));
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.MoreOptions")).click();
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.SearchFlights")).click();
	}
	
	public static void multiCity() throws IOException{
		
		driver = signIn();
		genericMethods.FINDELEMENT("com.cleartrip.flights.multiCityRadio").click();
		
		
	}
		
	public static void oneWayValidations(){
		
	}
		
	public static void roundTripValidations(){
		
	}
	
	public static void loginWithInvalidCred(){
		
	}
		
	public static void multiCityValidations(){
		
	}
	
	
	public static void signOut() throws IOException{
		
		
		driver.findElement(PropTest.getByValue("com.cleartrip.flights.userAccount")).click();
		genericMethods.FINDELEMENT("com.cleartrip.flights.signOut").click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	*/
	
	
		
	}


