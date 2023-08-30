package Stage1;
import java.util.ArrayList;

public class ChoiceObject {
	protected static String choicename;
	protected static String[] choiceObjectLines;
	protected static ArrayList<String>chosenProviso =new ArrayList<>();
	protected static ArrayList<String>decisiveProviso =new ArrayList<>();
	public static boolean addProviso(String a) {
		return chosenProviso.add(a);
	}
	public void ProvisoLinesOut() {
		
	}
}
 
