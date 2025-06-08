import java.util.Stack;

public class Valid {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else {
				if (st.isEmpty()) {
					return false;
				}
				int temp=st.peek();
				if(st.peek()=='(') {
					temp+=1;
				}else {
					temp+=2;
				}
				System.out.println(st.peek());
				if (temp == s.charAt(i) || temp ==  s.charAt(i)  || temp ==  s.charAt(i) ) {
					st.pop();
				}else{
                    return false;    
                }
			}

		}
		if(st.size()==0) {
			return true;
		}
		return false;

    }
}
