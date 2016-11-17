package silicon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sort_3 {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public void Save(int input) {
		if (map.containsKey(input)) {
			map.put(input, map.get(input) + 1);
		} else {
			map.put(input, 1);
		}
	}

	public boolean find(int target) {
		Set<Integer> set = map.keySet();
		for (int key : set) {
			if (key == target - key && map.get(key) > 1) {
				return true;
			} else if (key != target - key && map.containsKey(target - key)) {
				return true;
			}
		}
		return false;
	}

}
