package Stage4;
import deepsleep.EndingLines;
import deepsleep.Narrator;
import java.util.ArrayList;
import java.util.Scanner;
import Stage2.ChoiceObject2;
import Stage2.Stage2Flow;

public class Stage4Flow extends Narrator {
	EndingLines edline = new EndingLines();	
	public void S4start(Stage2Flow A)  {
		ChoiceObject2 COB = A.COB;
		Stage4Lines S4Lines = new Stage4Lines();
		NameNarration(S4Lines.stage4Start);
		}
	public void S4Input(Stage2Flow A) {
		String input;
		ChoiceObject2 COB = A.COB;
		Scanner scr =new Scanner(System.in);
		Stage4Lines S4Lines = new Stage4Lines();
		EndingLines Ed = new EndingLines();
		while(true) {
			int catsdead=0;
			int firing=0;
			ArrayList<String> temp= COB.getdecisiveProviso();
			String[] arr= temp.toArray(new String[temp.size()]);
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("내가 죽음을 결심하게 된 결정적인 계기는... : ");
			input=scr.nextLine();
			switch(input) {
			case "고양이의 죽음" :
				NameNarration(S4Lines.stage4CatsDead);
				catsdead++;
				break;
			case "화재" :
				Narration(S4Lines.stage4Fire);
				firing++;
				break;
			case "정체성" :
				
			default: System.out.println("이유는 저 세가지 중에 있을 거야.");
			if(firing==1 || catsdead==1) {
				break;
				}
			}
			if(catsdead==1) {
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println("내가 죽음을 결심하게 된 두 번째 계기는... : ");
				input=scr.nextLine();
				switch(input) {
				case "고양이의 죽음" :
					System.out.println("이건 이미 결정한 단서야 ");
					break;
				case "화재" :
					Narration(S4Lines.stage4Fire);
					firing++;
					break;
				case "정체성" :
					
				default: System.out.println("이유는 저 세가지 중에 있을 거야.");
				if(firing>=1 && catsdead>=1) {
					break;
					}
				}
			}
			if(firing>=1) {
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println("내가 죽음을 결심하게 된 두 번째 계기는... : ");
				input=scr.nextLine();
				switch(input) {
				case "고양이의 죽음" :
					NameNarration(S4Lines.stage4CatsDead);
					catsdead++;
					break;
				case "화재" :
					System.out.println("이건 이미 결정한 단서야 ");
					break;
				case "정체성" :
					
				default: System.out.println("이유는 저 세가지 중에 있을 거야.");
				}
				if(firing>=1 && catsdead>=1) {
					break;
				}
			}
			if(firing>=1 && catsdead>=1) {
				break;
			}
		}
	}
		public void isTrueEnding(Stage2Flow A) {
			ChoiceObject2 COB= A.COB;
			if (COB.getchosenProviso().contains("단서 : 티오필렌나트륨"))
				Narration(edline.trueEnding);
			if (!COB.getchosenProviso().contains("단서 : 티오필렌나트륨"))
				Narration(edline.normalEnding2);
			}
		}
	
	
	



