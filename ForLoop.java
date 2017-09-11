package pack1;

import org.testng.annotations.Test;

public class ForLoop {
	@Test
	public void loop() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+". Bangladesh");
			
			for(int j=1; j<=5; j++) {
				System.out.println("  "+j+".Dhaka");
			}
		}
	}
}
