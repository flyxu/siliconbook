package silicon;

public class sort_135 {
	public static int add(int a,int b){
		do{
			int sum=a^b;
			int carry=(a&b)<<1;
			a=sum;
			b=carry;
		}while(b!=0);
		return a;
		
	}
	public static void main(String[] args) {
		int a=58;
		int b=77;
		System.out.println(add(a, b));
	}
	
}
