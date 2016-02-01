package codility;

import java.util.Stack;

public class Brackets {

    public static int solution(String S) {
        if (S.isEmpty()) return 1;
        int length = S.length();
        if (length % 2 == 1) return 0;

        Stack<Character> current_stack = new Stack<>();

        for (Character current_character : S.toCharArray()) {
            if (current_character.equals('{') || current_character.equals('(') || current_character.equals('['))
                current_stack.push(current_character);
            else {
                if (current_stack.size() == 0) return 0;
                char previous_character = current_stack.pop();
                if (!checkValidity(previous_character, current_character)) return 0;
            }
        }

        if (current_stack.size() != 0) return 0;
        return 1;
    }

    private static boolean checkValidity(char previous, char current) {
        return previous == '{' && current == '}' ||
                previous == '[' && current == ']' ||
                previous == '(' && current == ')';
    }

    public static void main(String... args) {
        System.out.print(solution("{[()()]}"));
    }
}
