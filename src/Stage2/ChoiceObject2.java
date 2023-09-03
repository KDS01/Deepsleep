package Stage2;
import java.util.ArrayList;

public class ChoiceObject2 {
	protected String choicename;
	public String[] choiceObjectLines;
	protected String[] CombchoiceObjectLines;
	protected ArrayList<String>chosenProviso =new ArrayList<>();
	protected ArrayList<String>decisiveProviso =new ArrayList<>();
	public boolean addProviso(String a) {
		return chosenProviso.add(a);
	}
	public boolean adddecisiveProviso(String a) {
		return decisiveProviso.add(a);
	}
}
 
