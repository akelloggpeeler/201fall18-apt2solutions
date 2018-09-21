import java.util.*;

public class Starter {
	public int begins(String[] words,
			          String first) {
		HashSet<String> set = new HashSet<>();
		for(String s : words) {
			if (s.charAt(0) == first.charAt(0)) {
				set.add(s);
			}
		}
		return set.size();
	}
}
