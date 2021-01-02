package algorithms;

import java.util.Stack;

/**
 * Given a string made up of ()[]{} determine whether the brackets properly match
 */
public class Brackets {

    private final String str;

    public Brackets(String str) {
        
        this.str = str;
    }

    public boolean isMatch() {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            switch (str.charAt(i)) {
                case '}' :
                case ']':
                case ')':
                    if(stack.empty() || stack.pop() != getReversedChar(str.charAt(i))) return false;
                    break;
                default:
                    stack.push(str.charAt(i));
                    break;
            }
        }

        return stack.empty();
    }

    private char getReversedChar(char c)
    {
        switch (c)
        {
            case '}' :
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
        }
        return '_';
    }
}
