package A_IntroIOStreams;

import java.util.Properties;

public class D_SetProperties {
    public static void main(String[] args) {
        System.setProperty("myKey", "myValue");
        System.out.println(System.getProperty("myKey"));//myValue
        
        Properties prop = System.getProperties();

        System.out.println("Previous value: " + prop.getProperty("os.name"));//Windows 11
        prop.setProperty("os.name", "Windows 10");
        System.out.println("New value: " + prop.getProperty("os.name"));//Windows 10
}
}
