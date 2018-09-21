
public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
        int counts[] = new int[256];
        for(String s : headlines) {
        	for(char ch : s.toLowerCase().toCharArray()) {
        		if (ch == ' ') continue;
        		counts[ch] = counts[ch] + 1;
        	}
        }
        
        int total = 0;
        for(String s : messages) {
        	int[] mess = oneCount(s);
        	boolean canCreate = true;
        	for(char ch='a'; ch <= 'z'; ch += 1) {
        		if (mess[ch] > counts[ch]) {
        			canCreate = false;
        			break;
        		}
        	}
        	if (canCreate) total += 1;
        }
        return total;
  }

	private int[] oneCount(String s) {
		int[] counts = new int[256];
		for(char ch : s.toLowerCase().toCharArray()) {
			counts[ch] += 1;
		}
		return counts;
	}
}
