import java.util.*;

public class CounterAttack {
	public int[] analyze(String str, String[] words) {
		int counts[] = new int[words.length];
		List<String> list = Arrays.asList(str.split(" "));
		for(int k=0; k < words.length; k += 1) {
			counts[k] = Collections.frequency(list, words[k]);
		}
		return counts;
	}
}
