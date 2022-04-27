package day5_inheritance;

public class CustomChromeDriver implements CustomWebDriver, PDFGenerate{

	public static void main(String[] args) {
		
		// Child reference and child class object
		CustomChromeDriver c1=new CustomChromeDriver();
		System.out.println(CustomWebDriver.logLevelInfo);
		c1.get();
		c1.findElement();
		c1.findElements();
		c1.takeFullPageScreenshot();
		c1.close();
		c1.pdfGenerate();
		
		// Base class reference and child class Object
		CustomWebDriver c2=new CustomChromeDriver();
		c2.get();
		c2.findElement();
		c2.findElements();
		c2.close();
		
		PDFGenerate c3=new CustomChromeDriver();
		c3.pdfGenerate();
		
		//CustomWebDriver c3=new CustomWebDriver();
		//CustomChromeDriver c4=new CustomWebDriver();
		
		
	}

	public void takeFullPageScreenshot()
	{
		System.out.println("Chrome can capture full page screenshots");
	}
	
	
	public void get()
	{
		System.out.println("Application started in chrome");
	}
	
	public void close()
	{
		System.out.println("Application stopped by chrome");
	}
	
	public void findElement()
	{
		System.out.println("Chrome is finding element using locator");
	}

	
	public void findElements() 
	{
		System.out.println("Chrome can find multiple elements and return list of elements");
		
	}

	public void pdfGenerate() {
		System.out.println("Chrome can generate pdf of your web apps");
		
	}

}
