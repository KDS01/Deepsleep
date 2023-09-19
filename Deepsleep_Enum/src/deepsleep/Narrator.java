package deepsleep;
import java.util.Scanner;
import deepsleep.STAGE;
import deepsleep.STAGESTATUS;
import deepsleep.SUBSTATUS;
public class Narrator {
	private static long timeout = 300000;
	public void TimeOutSet(long temp) {
		this.timeout=temp;
	}
	private static long starttime = System.currentTimeMillis();
		// TODO Auto-generated constructor stub
	
//	private STAGE st;
//	private STAGESTATUS stt;
//	private SUBSTATUS sub;
//	
//	public Narrator(STAGE st,STAGESTATUS stt, SUBSTATUS sub) {
//		this.st=st;
//		this.stt=stt;
//		this.sub=sub;
//	}
//	public void setStage(STAGE st) {
//		this.st=st;
//	}
//	public STAGE getStage() {
//		return st;
//	}
//	public void setStagestatus(STAGESTATUS stt) {
//		this.stt=stt;
//	}
//	public STAGESTATUS getStagestatus() {
//		return stt;
//	}
//	public void setSub(SUBSTATUS sub) {
//		this.sub=sub;
//	}
//	public SUBSTATUS getsub() {
//		return sub;
//	}
//		
public void TimeoutNarrator() {
	
}
public void Narration(String[] a) {
			for(int i=0; i<a.length; i++) {
				
				Scanner scr =new Scanner(System.in);
				scr.nextLine();
				System.out.println(a[i]);
				System.out.println("\r\n");
		}
	}

	public void PlayerNarration(String[] a) {
		for(int i=0; i<a.length; i++) {
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
			System.out.println("한수연  : " +a[i]);
			System.out.println("\r\n");
		}
	}
}

	

