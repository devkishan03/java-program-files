
import java.util.Stack;

public class Mypractice {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(3);
        stk.push(1);
        stk.push(2);
        System.out.println(stk.pop());

        for (Integer integer : stk) {
            System.out.println(integer);
        }

    }
}
