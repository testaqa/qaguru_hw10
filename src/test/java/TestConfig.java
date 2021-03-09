public class TestConfig {

    public String Browser(){
        return System.getProperty("browser", "chrome");
    }
}
