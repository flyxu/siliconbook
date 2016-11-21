package silicon;

import java.util.ArrayList;

public class sort_7 {
	public ArrayList<Interval> insert(Interval[] intervals, Interval newint) {
		ArrayList<Interval> res = new ArrayList<Interval>();
		if (intervals == null) {
			res.add(newint);
			return res;
		}
		for (int i = 0; i < intervals.length; i++) {
			while (newint.start > intervals[i].end) {
				res.add(intervals[i]);
			}
		}

	}

}
