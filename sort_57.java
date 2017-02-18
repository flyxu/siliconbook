package silicon;

public class sort_57 {
	public int atio(String str){
		if(str==null||str.length()==0){
			return 0;
		}
		boolean isNeg=false;
		str=str.trim();
		int p=0;
		if(str.charAt(p)=='-'){
			isNeg=true;
			p++;
		}
		else if(str.charAt(p)=='+'){
			isNeg=false;
			p++;
		}
		
		int num=0;
		while(p<str.length()){
			char c=str.charAt(p);
			if(c<'0'||c>'9')
				break;
			if((num==214748364 && (c-'0')>7)||(num>214748364)){
				return (!isNeg)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			num=10*num+(c-'0');
			p++;
		}
		return (!isNeg)?num:-num;
		
	}
}
