import java.util.Map;
import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
    int sLen = s.length();
    if (sLen <= 1) {
      return false;
    }
    Map<Character, Character> popMap = Map.of(
        ')','(',
        ']','[',
        '}', '{'
    );
    Stack<Character> stack = new Stack<>();
    for (int pos = 0; pos < sLen; pos++) {
      char currentChar = s.charAt(pos);
      if (!popMap.containsKey(currentChar)) {
        stack.push(currentChar);
      } else {
        char matchChar = popMap.get(currentChar);
        if (stack.isEmpty()) {
          return false;
        }
        char topChar = stack.pop();
        if (matchChar != topChar) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
