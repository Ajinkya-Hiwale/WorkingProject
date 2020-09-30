package Stepdef;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = "C:\\Users\\Ajinkya\\Downloads\\AjDemonstrate-master\\AjDemonstrate-master\\Amdocx_test\\src\\test\\java\\featurefile\\AmdocxTest.feature",
				glue = "Stepdef",
		
		plugin = {"pretty" ,"json:target//cucumber.json"}
		
		
		)
public class RunTesterClass extends AbstractTestNGCucumberTests {

}