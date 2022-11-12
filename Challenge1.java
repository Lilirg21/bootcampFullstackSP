import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Challenge1 {

	
	public  String generateText(String typeText){
		Random rand = new Random();
		int num = rand.nextInt(99999999);
		String newText = String.valueOf(num);
		
		
		if (typeText.equals("Tipo A"))
			newText ="54" + newText;
			
		else 
			newText ="08" + newText;
		
		return newText;	
	}
	
	public  boolean findText(String text, List<String> listText) {
	boolean found = true;
		for (int i =0; i<listText.size(); i++) {
			if(text.equals(listText.get(i))) {
				found =false; 
				break;
			}
		
		}
		return found; 
	}

}
