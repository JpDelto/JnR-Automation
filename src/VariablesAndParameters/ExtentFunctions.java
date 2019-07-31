package VariablesAndParameters;


import java.io.File;


import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFunctions {
	
	//Delete first the existing extent-report.html before creating new one
	public void DeleteExtentReport() {
		File file = new File("C:\\xampp\\htdocs\\Web-automation-framework\\test-output\\extent-report.html");
        if(file.delete()){
        System.out.println("Existing extent-report.html is deleted!");
        }else System.out.println("File extent-report.html doesn't exist");
	}
	
		
	//Assigned to xampp/htdocs/extent-report path
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "C:\\xampp\\htdocs\\Web-automation-framework\\test-output\\extent-report.html"; 
		extent = new ExtentReports(Path, false);
		extent
		.addSystemInfo("Selenium Version", "3.14")
		.addSystemInfo("Platfom", "Windows 10");
		System.out.println("New extent-report.html will be created after executions of the test cases");
		return extent;
	}
}	 	
