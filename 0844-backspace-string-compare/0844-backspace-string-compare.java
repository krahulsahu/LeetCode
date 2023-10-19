class Solution {
public boolean backspaceCompare(String s, String t) {
    return processString(s).equals(processString(t));
}

public String processString(String str) {
    Stack<Character> stack = new Stack<>();

    for (char c : str.toCharArray()) {
        if (c == '#') {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else {
            stack.push(c);
        }
    }

    // Convert the stack to a string
    StringBuilder result = new StringBuilder();
    for (char c : stack) {
        result.append(c);
    }

    return result.toString();
}

}