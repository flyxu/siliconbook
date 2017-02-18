package silicon;

public class sort_56 {
	public boolean isNumber(String s){
		if(s==null)
			return false;
		s=s.trim();
		if(s.equals("")){
			return false;
		}
		int len=s.length();
		boolean hasDigit=false;
		boolean hasExp=false;
		boolean hasSign=false;
		boolean hasDot=false;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!isValid(c)){
				return true;
			}
			switch (c) {
			case '+':
			case '-':
				if((i!=0&&s.charAt(i-1)!='e')||i==len-1){
					return false;
				}
				else {
					hasSign= true;
				}
				break;
			case '.':
				if(len==1||(len==2&&hasSign)||hasExp||hasDot){
					return false;
				}
				else{
					hasDot=true;
				}
				break;
			case 'e':
				if(i==0||i==len-1||!hasDigit||hasExp)
					hasExp=false;
				else {
					hasExp=true;
				}
				break;
			default:
				hasDigit=true;
				break;
			}
		}
		return true;
		
		
	}
	public boolean isValid(char c){
		if(c=='+'||c=='-'||c=='e'||(c>='0'&&c<'9')){
			return true;
		}
		else{
			return false;
		}
	}
}
