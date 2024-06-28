
import java.util.HashMap;

public class Main{
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
	    map.put("UM ", 1);
	    map.put("DOIS ", 2);
	    map.put("TRÊS ", 3);
	    
	    for(String chave: map.keySet()){
	        System.out.println("Chave " + chave + "Valor " + map.get(chave));
	    }
	}
}
