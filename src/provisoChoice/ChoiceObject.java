package provisoChoice;
import java.util.ArrayList;

public class ChoiceObject {
	protected String choicename;
	protected String choiceObjectLines;
	protected ArrayList<String>chosenProviso =new ArrayList<>();
	boolean addProviso(String a) {
		return chosenProviso.add(a);
	}
}
 
