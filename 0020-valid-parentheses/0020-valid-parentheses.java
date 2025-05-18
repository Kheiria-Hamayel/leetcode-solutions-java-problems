class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        // Character [] ca = s.toCharArray();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (c == map.get(top).charValue()) {
                    stack.pop();
                } 
                else {
                    stack.push(c);
                }
            }
            else{
            stack.push(c);
            }

        }

        return stack.isEmpty() ? true:false;

    }
}