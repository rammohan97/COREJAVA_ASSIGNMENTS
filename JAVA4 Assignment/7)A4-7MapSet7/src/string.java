
import java.util.HashMap;
import java.util.Map;

public class string {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("doraemon", 1);
		m.put("nobitha",2);
		m.put("sizuka",3);
		
		StringBuilder s = new StringBuilder();
		m.entrySet().forEach(n -> s.append(n.getKey()).append(n.getValue()));
		System.out.println(s.toString());
		
	}

}
