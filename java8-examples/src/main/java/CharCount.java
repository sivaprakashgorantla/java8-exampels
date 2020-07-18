import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		String str = "Rama is a good Boy.  Sita is a good girl";
		
		str = str.toLowerCase();
		for(int i=0; i < str.length() ; i++) {
			if(map.size() > 0 && map.get(str.charAt(i)) != null) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				if(!" ".equals(str.charAt(i)  )){
					map.put(str.charAt(i), 1);
				}
			}
			if(!" ".equals(str.charAt(i)) && !"".equals(str.charAt(i)) ){
				System.out.println("I value "+str.charAt(i));
			}
		}
		
		map.entrySet().forEach(System.out::println);
	}

}
