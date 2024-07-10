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
    private int n, m, top;

    public Stack(int size) {
        top = m = n = size - 1;
        arr = new int[size];
    }

    public void push(int number) {
        try {
            if (n < 0) {
                throw new StackFull();
            } else {
                arr[n] = number;
                n--;
            }
        } catch (StackFull e) {
            System.out.println(e);
        }

    }

    public int pop() {
        try {
            if (m < 0) {
                throw new EmptyStack();
            } else {
                return arr[m--];
            }

        } catch (EmptyStack e) {
            System.out.println(e);
            return 0;
        }

    }

    public void testPush() throws StackFull {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        push(a);
        sc.close();
    }

    public int testPop() throws EmptyStack {
        return pop();
    }

    public static void main(String[] args) {
        Stack ss = new Stack(5);
        ss.push(10);
        ss.push(12);
        ss.push(9);
        System.out.println(ss.pop());
        System.out.println(ss.pop());

    }
}
