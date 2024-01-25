package BT_JavaOOP3.common;

public class BaseTest {
    public void createDriver(){
        System.out.println("browser:" + Constants.browser);
        System.out.println("Report:" + Constants.report);
        System.out.println("Headless:" + Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Closed browser"+Constants.browser);
    }
    public void CloserDriver(String browser){
        System.out.println("Closed browser"+ browser);

    }
}
