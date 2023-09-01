package deepsleep;
import java.util.Scanner;
public class Narrator {
	public void Narration(String[] a)
	{
		for(int i=0; i<a.length; i++) 
		{
			Scanner scr =new Scanner(System.in);
			scr.nextLine();
			System.out.println(a[i]);
			System.out.println("\r\n");
		}
	}
	public void PlayerNarration(String[] a)
	{
		
		for(int i=0; i<a.length; i++) 
		{
			Scanner scr =new Scanner(System.in);
			scr.nextLine();
			System.out.println("???    :  " +a[i]);
			System.out.println("\r\n");
		}
	}
	public void NameNarration(String[] a)
	{
		
		for(int i=0; i<a.length; i++) 
		{
			Scanner scr =new Scanner(System.in);
			scr.nextLine();
			System.out.println("한수연  :" +a[i]);
			System.out.println("\r\n");
		}
	}
//	public void S1provisoInput2(String[] a) {
//		Scanner scr =new Scanner(System.in);
//		AllLines line =new AllLines();
//		while(true)
//		{
//			System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
//			String input;
//			input=scr.nextLine();
//			switch(input) {
//			case "계단": System.out.println(StairProviso.class);
//			case "형광등": System.out.println(LightProviso.class);
//			case "바닥에 떨어진 종이": System.out.println(PaperProviso.class);
//			case "빌라 바깥": System.out.println(WindowProviso.class);
//			case "계단 위쪽": System.out.println(UpstairProviso.class);
//			case "현관문": System.out.println(FrontDoorProviso.class);
//			case "도어락": System.out.println(DoorLockProviso.class);
//			case "장도리": System.out.println(ClawHammer.class);
//			if(input=="장도리") {
//				break;
//			}
//			System.out.println(Narration());
//		}
//		}
//	}
//		public void S2provisoInput(String[] a) {
//			Scanner scr =new Scanner(System.in);
//			AllLines line =new AllLines();
//			while(true)
//			{
//				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
//				String input;
//				input=scr.nextLine();
//				switch(input) {
//				case "신발장": System.out.println(ShoesRackProviso.class);
//				case "소파": System.out.println(SofaProviso.class);
//				case "냉장고": System.out.println(RefregeratorProviso.class);
//				case "에어컨": System.out.println(WindowProviso.class);
//				case "현관문": System.out.println(FrontDoorProviso2.class);
//				case "바닥에 내던져진 에코백": System.out.println(AbandonEcobag.class);
//				if(input=="바닥에 내던져진 에코백") {
//					break;
//				}
//			}
//			}
//		}
//
//		public void S2provisoInput2(String[] a) {
//			Scanner scr =new Scanner(System.in);
//			AllLines line =new AllLines();
//			while(true)
//			{
//				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
//				String input;
//				input=scr.nextLine();
//				switch(input) {
//				case "지갑": System.out.println(WalletProviso.class);
//				case "휴대폰": System.out.println(CellphoneProviso.class);
//				case "작은 봉투": System.out.println(SmallenvelopProviso.class);
//				if(input=="작은 봉투") {
//					break;
//				}
//				System.out.println()
//}
//			}
//		}
//		public void S3provisoInput(String[] a) {
//			Scanner scr =new Scanner(System.in);
//			AllLines line =new AllLines();
//			while(true)
//			{
//				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
//				String input;
//				input=scr.nextLine();
//				switch(input) {
//				case "화장실": System.out.println(ToiletProviso.class);
//				case "현관문": System.out.println(Frontdoor3Proviso.class);
//				case "불길": System.out.println(FireProviso.class);
//				case "안방": System.out.println(MainRoomProviso.class);
//				if(input=="안방") {
//					break;
//				}
//
//			}
//			}
//		}
//		
//		public void S3provisoInput2(String[] a) {
//			Scanner scr =new Scanner(System.in);
//			AllLines line =new AllLines();
//			while(true)
//			{
//				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
//				String input;
//				input=scr.nextLine();
//				switch(input) {
//				case "전기 스토브": System.out.println(StoveProviso.class);
//				case "멀티탭": System.out.println(MultitapProviso.class);
//				case "전기 포트": System.out.println(PotProviso.class);
//				case "이불": System.out.println(BlanketProviso.class);
//				}
//}
//}
}
	

