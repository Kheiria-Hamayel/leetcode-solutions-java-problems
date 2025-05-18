class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        // Character [] ca = s.toCharArray();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (c.equals(map.get(top))) {
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