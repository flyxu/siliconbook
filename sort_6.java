package silicon;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start;
	int end;

	Interval(int a, int b) {
		start = a;
		start = b;
	}
}

class mycompare implements Comparator<Interval> {
	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
		return o1.end - o2.end;
	}
}

public class sort_6 {
	public int overlabnumber(Interval[] intervals) {
		if (intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, new mycompare());
		int end = intervals[0].end;
		int count = 0;
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i].start >= end) {
				count++;
				end = intervals[i].end;
			}
		}
		return count;
	}
}