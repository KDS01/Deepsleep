
package Stage2;

import java.util.Scanner;
import deepsleep.Narrator;

public class Stage2Flow extends Narrator {
		public void S1Start() {
			Stage1Lines S1Lines = new Stage1Lines();
			PlayerNarration(S1Lines.stage1Start);	
		}
		public void S1provisoInput1() {
			Scanner scr =new Scanner(System.in);
			ChoiceObject COB = new ChoiceObject();
			Stage1Lines S1Lines = new Stage1Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S1Lines.stage1Proviso1+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "계단" :
//						StairProviso temp = new StairProviso();
						PlayerNarration((new StairProviso()).choiceObjectLines);
						break;
					case "형광등":
						LightProviso Lt = new LightProviso();
						PlayerNarration(Lt.choiceObjectLines);
						break;
					case "바닥에 떨어진 종이":
						PaperProviso PP = new PaperProviso();
						PlayerNarration(PP.choiceObjectLines);
						break;
					case "도어락":
						DoorLockProviso DL = new DoorLockProviso();
						PlayerNarration(DL.choiceObjectLines);
						provisocount++;
						break;
					case "빌라 바깥":
						WindowProviso WP = new WindowProviso();
						PlayerNarration(WP.choiceObjectLines);
						break;
					case "계단 위쪽":
						UpstairProviso UP = new UpstairProviso();
						PlayerNarration(UP.choiceObjectLines);
						break;
					case "현관문":
						FrontDoorProviso FD = new FrontDoorProviso();
						PlayerNarration(FD.choiceObjectLines);
						break;
					default :
						System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(provisocount>=1) {
					break;
				}
			}
		}
		public void S1ORG() {
			Stage1Lines S1Lines = new Stage1Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S1Lines.orgbase[i]);
			}
			PlayerNarration(S1Lines.stage1Organize);	
		}
		public void S1provisoInput2() {
			Scanner scr =new Scanner(System.in);
			ChoiceObject COB = new ChoiceObject();
			Stage1Lines S1Lines = new Stage1Lines();
			int Pcount =0;
			while(true)
			{
				System.out.print(S1Lines.stage1Proviso2+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "계단" :
					WindowProviso temp = new WindowProviso();
					PlayerNarration(temp.choiceObjectLines);
					break;
				case "형광등":
					LightProviso Lt = new LightProviso();
					PlayerNarration(Lt.choiceObjectLines);
					break;
				case "도어락":
					DoorLockProviso DL = new DoorLockProviso();
					PlayerNarration(DL.choiceObjectLines);
					break;
				case "바닥에 떨어진 종이":
					PaperProviso PP = new PaperProviso();
					PlayerNarration(PP.choiceObjectLines);
					break;
				case "빌라 바깥":
					WindowProviso WP = new WindowProviso();
					PlayerNarration(WP.choiceObjectLines);
					break;
				case "계단 위쪽":
					UpstairProviso UP = new UpstairProviso();
					PlayerNarration(UP.choiceObjectLines);
					break;
				case "현관문":
					FrontDoorProviso FD = new FrontDoorProviso();
					PlayerNarration(FD.choiceObjectLines);
					break;
				case "장도리":
					ClawHammerProviso CH = new ClawHammerProviso();
					PlayerNarration(CH.choiceObjectLines);
					Pcount++;
					break;
				default :
					System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(Pcount>=1)
				{
					break;
				}
			}
		}
		public void S1End() {
			Stage1Lines S1Lines = new Stage1Lines();
			PlayerNarration(S1Lines.S1Ending);	
		}
		
}
	
