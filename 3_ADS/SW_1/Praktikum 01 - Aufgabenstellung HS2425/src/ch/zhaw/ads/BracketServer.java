package ch.zhaw.ads;

import java.util.stream.Stream;

public class BracketServer implements CommandExecutor {
    private ListStack stack;
    private int i = 0;

    public BracketServer() {
        stack = new ListStack();
    }

    private String getNextBracket(String input) {
        String result = "";
        boolean foundBracket = false;
        while (!foundBracket) {
            Character x = input.charAt(i);
            if (x == '(' || x == ')' || x == '{' || x == '}' || x == '[' || x == ']') {
                foundBracket = true;
                result = x.toString();
            }
            i++;
        }
        return result;
    }

    public boolean checkBrackets(String command) {
        boolean noBracketsLeft = false;
        boolean correctlyFormatted = false;
        while (!noBracketsLeft) {
            String bracket = getNextBracket(command);
            switch (bracket) {
                case "(":
                    stack.push(bracket);
                    break;
                case "[":
                    stack.push(bracket);
                    break;
                case "{":
                    stack.push(bracket);
                    break;
                case ")":

                    break;
                case "]":
                    stack.push(bracket);
                    break;
                case "}":
                    stack.push(bracket);
                    break;
                default:
                    break;
            }
        }
        return correctlyFormatted;
    }

    public String execute(String command) {
    }
}
