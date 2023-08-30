/**
 * 
 */
package Stage1;
import java.util.Scanner;
import deepsleep.Narrator;

/**
 * 
 */
//public class Stage1Flow extends ChoiceObject {
	
	
public class Stage1Flow extends Narrator {
	
		public void S1provisoInput(String[] a) {
			Scanner scr =new Scanner(System.in);
			ChoiceObject COB = new ChoiceObject();
			while(true)
			{
				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				
				switch(input) {
				case "계단" : Narration(StairProviso.choiceObjectLines);
				//case "형광등": System.out.println()
				case "도어락": 
//				case "바닥에 떨어진 종이": System.out.println(PaperProviso.class);
//				case "빌라 바깥": System.out.println(WindowProviso.class);
//				case "계단 위쪽": System.out.println(UpstairProviso.class);
//				case "현관문": System.out.println(FrontDoorProviso.class);
				if(input=="도어락") {
					break;
				}
			}
			}
		}
	

}
//}
