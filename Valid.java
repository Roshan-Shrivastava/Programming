// Q-1-Valid Pranteheses
// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.




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
