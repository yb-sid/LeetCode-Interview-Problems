package problems.valid_parentheses;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidParentheses {

    private ArrayDeque<Character> stack = new ArrayDeque<>();
    private Set<Character> open = new HashSet<>(Arrays.asList('(', '[', '{'));
    private Set<Character> close = new HashSet<>(Arrays.asList(')', ']', '}'));

    public boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            if (open.contains(c)) {
                stack.push(c);
            }
            if (close.contains(c)) {
                if (stack.isEmpty())
                    return false;
                else {
                    char top = stack.pop();
                    boolean one = (top == '(' && c == ')');
                    boolean two = (top == '{' && c == '}');
                    boolean three = (top == '[' && c == ']');

                    if (!(one || two || three))
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
