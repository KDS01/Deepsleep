package Stage3;

import java.util.Scanner;
import deepsleep.EndingLines;
import Stage2.ChoiceObject2;
import Stage2.Stage2Flow;
import deepsleep.Narrator;
import java.util.ArrayList;
public class Stage3Flow extends Narrator {
		public void S3Start() {
			Stage3Lines S2Lines = new Stage3Lines();
			NameNarration(S2Lines.stage3Start);	
		}
		public void S3FirstChoice(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			Scanner scr =new Scanner(System.in);
			Stage3Lines S3Lines = new Stage3Lines();
			EndingLines Ed = new EndingLines();
			while(true) {
				int Pcount=0;
				System.out.print("\r\n"+S3Lines.Stage3FirstChoice +"\r\n"+ "지금 내가 해야 할 일은...");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "조사한다" :
					NameNarration(S3Lines.stage3Find);
					Pcount++;
					break;
				case "탈출한다":
					Narration(Ed.NorMalEnding1);
					System.exit(0);
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("지금 내가 할 수 있는 걸 찾아보자.");
				}
				if(Pcount>=1) {
					break;
				}
				
			}
		}
		
		public void S3provisoInput2(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			Scanner scr =new Scanner(System.in);
			Stage3Lines S3Lines = new Stage3Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S3Lines.Stage3Proviso1 + "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "불길" :
						NameNarration(new FireProviso().choiceObjectLines);
						break;
					case "현관문":
						NameNarration((new Frontdoor3Proviso().choiceObjectLines));
						break;
					case "싱크대":
						NameNarration((new SinkProviso().choiceObjectLines));
						break;
					case "화장실":
						NameNarration((new ToiletProviso().choiceObjectLines));
						break;
					case "안방":
						NameNarration((new MainRoomProviso().choiceObjectLines));
						COB.setChosenProviso("단서 : 안방");
						provisocount++;
						break;
					case "단서":
						COB.getChosenProviso();
						break;
					default :
						System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(provisocount>=1) {
					break;
				}
			}
			NameNarration(S3Lines.stage3MainroomChoice);
		}
		
		public void S3provisoInput3(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			Scanner scr =new Scanner(System.in);
			Stage3Lines S3Lines = new Stage3Lines();
			int Pcount =0;
			NameNarration(S3Lines.stage3MainRoomLines);
			while(true)
			{
				System.out.print(S3Lines.stage3Proviso2+ "\r\n"+"무엇을 조사해볼까? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "전기 스토브" :
					NameNarration(new StoveProviso().choiceObjectLines);
					break;
				case "멀티탭":
					NameNarration(new MultitapProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 멀티탭");
					Pcount++;
					break;
				case "전기 포트":
					NameNarration(new PotProviso().choiceObjectLines);
					break;
				case "이불":
					NameNarration(new BlanketProviso().choiceObjectLines);
					COB.setChosenProviso("단서 : 이불");
					Pcount++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("마루를 찾는 것이 먼저다.");
				}
				if(Pcount==1)
				{
					System.out.println("아직 조금 부족한 느낌이 들어. 조금 더 샅샅히 찾아보자.");
				}
				if(Pcount>=2)
				{
					break;
				}
			}
		}
		public void S3ORG() {
			Stage3Lines S3Lines = new Stage3Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S3Lines.orgbase[i]);
			}
			PlayerNarration(S3Lines.stage3Org);
		}
		public void S3provisoInput4(Stage2Flow A) {
			ChoiceObject2 COB = A.COB;
			Scanner scr =new Scanner(System.in);
			Stage3Lines S3Lines = new Stage3Lines();
			int Pcount =0;			
			while(true)
			{
				System.out.print("\r\n" + S3Lines.stage3Proviso2 + "마루는 어디에 있을까..? :");
				System.out.println("모은 단서들 목록을 보려면" +" 단서"+"를 입력하세요");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "전기 스토브" :
					System.out.println("이건 아니야.... 다시 생각해보자..");
					break;
				case "전기 포트":
					System.out.println("이건 아니야.... 다시 생각해보자..");
					break;
				case "이불":
					NameNarration(new BlanketProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				case "멀티탭":
					NameNarration(new MultitapProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				case "단서":
					COB.getChosenProviso();
					break;
				default :
					System.out.println("이건 아니야.... 다시 생각해보자..");
				}
				if(Pcount==1)
				{
					System.out.println("한 가지 단서로 유추하기에는 조금 어려운데.. 다른 단서에서 얻을 수 있을 만한 정보는 없을까?");
				}
				if(Pcount>=2)
				{
					break;
				}
			}
			NameNarration(S3Lines.stage3identityLines);
			COB.setDecisiveProviso("결정적인 단서 : 고양이의 죽음");
		}

}