package A_IntroIOStreams;

import java.io.FileInputStream;

public class C_GetProperty {
    public static void main(String[] args) {

        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("User Home: " + System.getProperty("user.home"));
        System.out.println("User Dir: " + System.getProperty("user.dir"));
        
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        FileInputStream fis = null;// java input output classes in java.io package
        // User Name: Anwar Shaik
        // User Home: C:\Users\Anwar Shaik
        // User Dir: E:\Code\Org\Java
        // Java Version: 22.0.1
        // Java Home: C:\Program Files\Java\jdk-22
        // Java Vendor: Oracle Corporation
        // Java Vendor URL: https://java.oracle.com/
        // Java Class Path:
    }
}