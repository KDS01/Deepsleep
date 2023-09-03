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
			System.out.println("한수연  : " +a[i]);
			System.out.println("\r\n");
		}
	}

}
	

