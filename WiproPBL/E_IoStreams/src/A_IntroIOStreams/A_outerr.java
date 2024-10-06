package A_IntroIOStreams;

public class A_outerr {
	public static void main(String args[]) {
		try {
			System.out.println("out stream");
			int i =0;
			int k = 100/i;
		}catch(Exception e) {
			System.err.print("err stream");//Not applicable for arguments
			//err stream will be in red color
		}
	}
}
