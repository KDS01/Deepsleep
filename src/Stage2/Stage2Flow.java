
package Stage2;
import java.util.Scanner;
import deepsleep.Narrator;

public class Stage2Flow extends Narrator {
		public void S1Start() {
			Stage2Lines S2Lines = new Stage2Lines();
			PlayerNarration(S2Lines.stage2Start);	
		}
		public void S2provisoInput1() {
			Scanner scr =new Scanner(System.in);
			ChoiceObject2 CO2 = new ChoiceObject2();
			Stage2Lines S2Lines = new Stage2Lines();
			int provisocount =0;
			while(true)
			{
				System.out.print(S2Lines.Stage2Proviso1 + "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
					case "신발장" :
						PlayerNarration((new ShoesRackProviso().choiceObjectLines));
						break;
					case "소파":
						PlayerNarration((new SofaProviso().choiceObjectLines));
						break;
					case "냉장고":
						PlayerNarration((new RefregeratorProviso().choiceObjectLines));
						break;
					case "현관문":
						PlayerNarration((new FrontDoorProviso2().choiceObjectLines));
						break;
					case "바닥에 내던져진 에코백":
						PlayerNarration((new AbandonEcobagProviso().choiceObjectLines));
						provisocount++;
						break;
					default :
						System.out.println("일단 눈에 띄는 것들에서 방법을 찾아보자.");
				}
				if(provisocount>=1) {
					break;
				}
			}
			PlayerNarration(S2Lines.stage2Ecobag);
		}
		public void S1provisoInput2() {
			Scanner scr =new Scanner(System.in);
			ChoiceObject2 COB = new ChoiceObject2();
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount =0;
			while(true)
			{
				System.out.print(S2Lines.Stage2EcobagList+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "휴대폰" :
					PlayerNarration(new CellphoneProviso().choiceObjectLines);
					Pcount++;
					break;
				case "작은 봉투":
					PlayerNarration(new SmallenvelopProviso().choiceObjectLines);
					break;
				case "지갑":
					PlayerNarration(new WalletProviso().choiceObjectLines);
					Pcount++;
					break;
				default :
					System.out.println("지금은 다른 것보단 저 세 가지 단서가 우선이야.");
				}
				if(Pcount>=2)
				{
					break;
				}
			}
		}
		public void S2provisoInput3() {
			Scanner scr =new Scanner(System.in);
			ChoiceObject2 COB = new ChoiceObject2();
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount =0;
			while(true)
			{
				System.out.print(S2Lines.Stage2EcobagList2+ "\r\n"+"무엇을 조사해볼까? :");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "휴대폰" :
					PlayerNarration(new CellphoneProviso().choiceObjectLines);
					break;
				case "작은 봉투":
					PlayerNarration(new SmallenvelopProviso().choiceObjectLines);
					break;
				case "지갑":
					PlayerNarration(new WalletProviso().choiceObjectLines);
					break;
				case "원격 조종 장난감":
					PlayerNarration(new RemoconToyProviso().choiceObjectLines);
					Pcount++;
					break;
				default :
					System.out.println("저 장난감이 자꾸만 신경쓰이는데...");
				}
				if(Pcount>=1)
				{
					break;
				}
			}
		}
		public void S2ORG() {
			Stage2Lines S2Lines = new Stage2Lines();
			for(int i=0; i<3; i++)
			{
				System.out.println(S2Lines.orgbase[i]);
			}
			PlayerNarration(S2Lines.stage2Organize);
		}
		public void S2ProvisoCombination() {
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			int Pcount=0;
			PlayerNarration(S2Lines.stage2CombinationLines);
			System.out.println("내가 누군지 생각나게 해 줄 단서를 입력해보자.");
			while(true) {
				System.out.print(S2Lines.Stage2ProvisoComb+ "\r\n"+"어떤 단서가 도움이 될까...:");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "에코백" :
					PlayerNarration(new AbandonEcobagProviso().CombchoiceObjectLines);
					break;
				case "휴대폰":
					PlayerNarration(new CellphoneProviso().CombchoiceObjectLines);
					break;
				case "원격 조종 장난감":
					PlayerNarration(new RemoconToyProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				case "지갑" :
					PlayerNarration(new WalletProviso().CombchoiceObjectLines);
					Pcount++;
					break;
				default :
					System.out.println("이건 아니야... 다시 생각해보자...");
				}
				if(Pcount==1)
				{
					System.out.println("한 가지 정보로는 조금 부족한 느낌이 들어.. 조금만 더 생각해보자..");
				}
				if(Pcount>=2)
				{
					break;
				}
			}
		}
		public void S2IdentityLines() {
			Stage2Lines S2Lines = new Stage2Lines();
			NameNarration(S2Lines.stage2identityLines);
		}
		public void S2MainRoomDoor() {
			Scanner scr =new Scanner(System.in);
			Stage2Lines S2Lines = new Stage2Lines();
			while(true) {
				int Pcount=0;
				System.out.println(S2Lines.Stage2DoorOption + "안방 문 앞에서 뭘 해볼까...");
				String input;
				input=scr.nextLine();
				switch(input) {
				case "문을 열어본다." :
					NameNarration(S2Lines.stage2DoorHandleLines);
					break;
				case "문을 두드린다.":
					NameNarration(S2Lines.stage2DoorKnockLines);
					Pcount++;
					break;
				default :
					System.out.println("지금은 어서 안방에 들어가봐야 해.");
				}
				if(Pcount>=1) {
					break;
				}
				
			}
			Narration(S2Lines.stage2DoorKnockLines2);
		}
}
	
