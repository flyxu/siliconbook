package silicon;

import java.util.ArrayList;

public class sort_7 {
	public ArrayList<Interval> insert(Interval[] intervals, Interval newint) {
		ArrayList<Interval> res = new ArrayList<Interval>();
		if (intervals == null) {
			res.add(newint);
			return res;
		}
		int n = intervals.length;
		int i = 0;
		while (i < n & intervals[i].end < newint.start) {
			res.add(intervals[i]);
			i++;
		}
		while (i < n & intervals[i].start <= newint.end) {
			newint.start = Math.min(intervals[i].start, newint.start);
			newint.end = Math.max(intervals[i].end, newint.end);
			i++;
		}
		res.add(newint);
		while (i < n) {
			res.add(intervals[i++]);
		}
		return res;
	}

}
