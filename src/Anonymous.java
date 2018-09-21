
public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
		
		// counts[ch] is # occurrences of ch in headlines
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
        	if (enoughLetters(mess,counts)) {
        		total += 1;
        	}
        }
        return total;
  }

	private boolean enoughLetters(int[] mess, int[] allLetters) {
		boolean canCreate = true;
    	for(char ch='a'; ch <= 'z'; ch += 1) {
    		// do we have enough letters to create message?
    		if (mess[ch] > allLetters[ch]) {
    			return false;
    		}
    	}
    	return true;
	}

	private int[] oneCount(String s) {
		int[] counts = new int[256];
		for(char ch : s.toLowerCase().toCharArray()) {
			counts[ch] += 1;
		}
		return counts;
	}
}
