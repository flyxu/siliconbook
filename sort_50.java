package silicon;

public class sort_50 {
	boolean isuniquechars(String str){
		boolean charset[]=new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val=str.charAt(i);
			if(charset[val]==true) return false;
			charset[val]=true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		int val="xbxiang".charAt(1)-'a';
		System.out.println(val);
		int a=4;
		System.out.println(1<<a);
		
	}
}
