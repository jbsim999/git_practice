import java.util.ArrayList;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        class Solution {
            public ArrayList<Stack> browserStack(String[] actions, String start) {
                Stack<String> prevStack = new Stack<>();
                Stack<String> nextStack = new Stack<>();
                Stack<String> current = new Stack<>();
                ArrayList<Stack> result = new ArrayList<>();

                actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
                start = new String("A");

                // start는 current.push(start)
                current.push(start);
                // for문으로 actions 순회(if(el==1||el==-1))->
                for (int i = 0; i < actions.length; i++) {
                    if (actions[i] == "-1") {
                        nextStack.push(current.pop());
                        current.push(prevStack.pop());
                    } else if (actions[i] == "1") {
                        prevStack.push(current.pop());
                        current.push(nextStack.pop());
                    } else {
                        prevStack.push(current.pop());
                        current.push(actions[i]);
                        nextStack.clear();
                    }
                }
                result.add(prevStack);
                result.add(current);
                result.add(nextStack);


                return result;
            }

        }
        System.out.println(Solution.result);
    }
}
