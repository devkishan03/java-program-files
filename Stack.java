package Assignment3;

import java.util.Scanner;

class StackFull extends Exception {
    public StackFull() {
    }

    public String toString() {
        return "Stack if full";
    }
}

class EmptyStack extends Exception {

    public EmptyStack() {
    }

    public String toString() {
        return "Stack is Empty";
    }
}

public class Stack {
    private int arr[];
    private int n, top;

    public Stack(int size) {
        top = size - 1;
        n = -1;
        arr = new int[size];
    }

    private void push(int number) throws StackFull {
        if (n == top) {
            throw new StackFull();
        } else {
            arr[++n] = number;
        }

    }

    private int pop() throws EmptyStack {
        if (n == -1) {
            throw new EmptyStack();
        } else {
            return arr[n--];
        }

    }

    public void testPush() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value want to push:");
        int a = sc.nextInt();

        try {
            push(a);
        } catch (StackFull sf) {
            System.out.println(sf);
        }

    }

    public void testPop() {
        try {
            System.out.println(pop());
        } catch (EmptyStack es) {
            System.out.println(es);
        }

    }

    public static void main(String[] args) {
        Stack ss = new Stack(2);
        ss.testPush();
        ss.testPush();
        // ss.testPush();
        ss.testPop();
        ss.testPop();
        ss.testPop();

    }
}
