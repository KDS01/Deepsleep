package deepsleep;
import java.util.Scanner;
public class Basic {





}
class Narrator extends AllLines {
	public void Narration(String[] a)
	{
		for(int i=0; i<a.length; i++) 
		{
			Scanner scr =new Scanner(System.in);
			int input=0;
			input=scr.nextInt();
			System.out.println(a[i]); 
		}
	}
	
}
class ProvisoList extends ProvisoNames {
	public void provisoList(String a) {
		System.out.print("무엇을 조사해볼까? \r\n"+ a);
	}
	
}
class S1provisoInput extends ProvisoInfo {
	public void S1provisoInput(String[] a) {
		Scanner scr =new Scanner(System.in);
		AllLines line =new AllLines();
		while(true)
		{
			System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
			int input=0;
			input=scr.nextInt();
			switch(input) {
			case 1: System.out.println(a[0]);
			case 2: System.out.println(a[1]);
			case 3: System.out.println(a[2]);
			case 4: System.out.println(a[3]);
			case 5: System.out.println(a[4]);
			case 6: System.out.println(a[5]);
			case 7: System.out.println(a[6]);
			if(input==7) {
				System.out.println(line.stage1Organize);
				break;
			}
		}
		}
	}
	public void S1provisoInput2(String[] a) {
		Scanner scr =new Scanner(System.in);
		AllLines line =new AllLines();
		while(true)
		{
			System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
			int input=0;
			input=scr.nextInt();
			switch(input) {
			case 1: System.out.println(a[0]);
			case 2: System.out.println(a[1]);
			case 3: System.out.println(a[2]);
			case 4: System.out.println(a[3]);
			case 5: System.out.println(a[4]);
			case 6: System.out.println(a[5]);
			case 7: System.out.println(a[6]);
			case 8: System.out.println(a[7]);
			if(input==8) {
				System.out.println(line.clawHammer);
				break;
			}
		}
		}
	}
		public void S2provisoInput(String[] a) {
			Scanner scr =new Scanner(System.in);
			AllLines line =new AllLines();
			while(true)
			{
				System.out.print(a+"\r\n"+"무엇을 조사해볼까? :");
				int input=0;
				input=scr.nextInt();
				switch(input) {
				case 1: System.out.println(a[0]);
				case 2: System.out.println(a[1]);
				case 3: System.out.println(a[2]);
				case 4: System.out.println(a[3]);
				case 5: System.out.println(a[4]);
				case 6: System.out.println(a[5]);
				if(input==4) {
					System.out.println(line.stage2Ecobag);
					break;
				}
			}
			}
		
		

		}
}
		
	

