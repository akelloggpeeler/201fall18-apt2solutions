
public class IsomorphicWords {
	public int countPairs(String[] words) {
		int total = 0;
		
		for(int j=0; j < words.length; j += 1) {
			String jword = iso(words[j]);
			for(int k=j+1; k < words.length; k += 1) {
				String kword = iso(words[k]);
				if (jword.equals(kword)) {
					total += 1;
				}
			}
		}
		return total;
	}

	private String iso(String str) {
		char[] map = new char[256];
		char current = 'a';
		for(int k=0; k < str.length(); k += 1) {
			char ch = str.charAt(k);
			if (map[ch] == 0) {
				map[ch] = current;
				current += 1;
			}
		}
		String ret = "";
		for(int k=0; k < str.length(); k += 1) {
			char ch = str.charAt(k);
			ret = ret + map[ch];
		}
		return ret;
	}
}
