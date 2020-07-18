
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Rama is a good now.";
		int vowelsCount =0;
		int consonentsCount =0;
		
		str = str.toLowerCase();
		System.out.println("Total Count : "+str.length());
		for (int i=0; i <str.length() ; i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' )
				vowelsCount ++;
			else {
				consonentsCount++;
			}
		}
		System.out.println("vowelsCount : "+vowelsCount + ": consonentsCount : "+consonentsCount);
	}

}
