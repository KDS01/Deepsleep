package deepsleep;
import Stage1.*;
import Stage2.*;
import Stage3.*;
import Stage4.*;
import java.util.Scanner;
public class Main extends Stage1Flow {
	public static void main(String[] args) {
		Stage1Flow s1Flow = new Stage1Flow();
		Stage2Flow s2Flow = new Stage2Flow();
		Stage3Flow s3Flow = new Stage3Flow();
		Stage4Flow s4Flow = new Stage4Flow();
		System.out.println("Deep Sleep....");
		System.out.println("계속하려면 아무 키나 입력하세요.");
		s1Flow.S1Start();
		s1Flow.S1provisoInput1();
		s1Flow.S1ORG();
		s1Flow.S1provisoInput2();
		s1Flow.S1End();
		s2Flow.S1Start();
		s2Flow.S2provisoInput1();
		s2Flow.S2provisoInput2();
		s2Flow.S2provisoInput3();
		s2Flow.S2ORG();
		s2Flow.S2ProvisoCombination();
		s2Flow.S2IdentityLines();
		s2Flow.S2MainRoomDoor();
		s3Flow.S3Start();
		s3Flow.S3FirstChoice(s2Flow);
		s3Flow.S3provisoInput2(s2Flow);
		s3Flow.S3provisoInput3(s2Flow);
		s3Flow.S3ORG();
		s3Flow.S3provisoInput4(s2Flow);
		s4Flow.S4start(s2Flow);
		
	}

}
