package amazon.step_definitions;

import amazon.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 0)
    public void setupScenerio(){
        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before (value = "@login",order = 1)  //only use login anotation
    public void setupScenerioForLogins(){
        System.out.println("===this will only apply to scenerios with @login tag");
    }
    @Before (value = "@db",order = -1)  //only use login anotation
    public void setupForDataBaseScenerio(){
        System.out.println("===this will only apply to scenerios with @login tag");
    }
    @After
    public void teardownScenario(Scenario scenario){

        if ( scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        }

        Driver.closeDriver();

        System.out.println(" ===Closing browser using cucumber @After");
        System.out.println("===Scenerio ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setup(){
        System.out.println("-----Applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("------Applying teardown  using @AfterStep");
    }
}


