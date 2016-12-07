package silicon;

import java.util.HashMap;
import java.util.Stack;

public class sort_108 {
	public boolean isbracketvalid(String s){
		HashMap<Character, Character> map=new HashMap<Character,Character>();
		map.put('(',')');
		map.put('{', '}');
		map.put('[', ']');
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			if(!stack.isEmpty()&&s.charAt(i)==map.get(stack.peek())){
				stack.pop();
			}
			else{
			stack.add(s.charAt(i));
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}
