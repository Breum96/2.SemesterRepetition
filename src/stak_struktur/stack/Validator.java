package stak_struktur.stack;

import java.util.Stack;

public class Validator {

    public static boolean validateBrackets(String expression){
        Stack<Character> parantes = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                parantes.push(expression.charAt(i));
            }
            if (expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']'){
                Character temp = parantes.pop();
                if (expression.charAt(i) == ')' && temp != '('){
                    return false;
                }else if (expression.charAt(i) == '}' && temp != '{'){
                    return false;
                } else if (expression.charAt(i) == ']' && temp != '['){
                    return false;
                }
            }

        }
        return parantes.isEmpty();
    }
}
