package A_IntroIOStreams;
import java.util.*;
public class B_Properties {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		//System.out.println(prop);//properites are printed
		prop.list(System.out);//same as above but in an order
		System.out.println(prop.getProperty("user.name"));//Anwar Shaik
	}
}
