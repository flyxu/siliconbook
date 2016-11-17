package silicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class compare8 implements Comparator<Interval> {

	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
		if (o1.start < o2.start) {
			return -1;
		} else if (o1.start > o2.start) {
			return 1;
		} else {
			if (o1.end < o2.end) {
				return -1;
			} else if (o1.end > o2.end) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}

public class sort_8 {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> list = new ArrayList<>();
		if (intervals == null) {
			return list;
		}
		Collections.sort(intervals, new compare8());
		list.add(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			int listend = list.get(list.size() - 1).end;
			if (intervals.get(i).start <= listend) {
				listend = Math.max(intervals.get(i).end, listend);
			} else {
				list.add(intervals.get(i));
			}
		}
		return list;
	}
}
