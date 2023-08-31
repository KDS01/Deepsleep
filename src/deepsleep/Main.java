package deepsleep;
import Stage1.*;
import java.util.Scanner;
public class Main extends Stage1Flow {
	public static void main(String[] args) {
		Stage1Flow s1Flow = new Stage1Flow();
		System.out.println("Deep Sleep....");
		System.out.println("계속하려면 아무 키나 입력하세요.");
		s1Flow.S1Start();
		s1Flow.S1provisoInput1();
		s1Flow.S1ORG();
		s1Flow.S1provisoInput2();
		s1Flow.S1End();
	}

}
