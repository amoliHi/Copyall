package Linked_List_Implentations;

import java.util.LinkedList;

public class Fib_LinkedList {
    private LinkedList<Integer> fibonacciList;

    public Fib_LinkedList() {
        this.fibonacciList = new LinkedList<Integer>();
    }

    public LinkedList<Integer> sum()
    {
        int n, a = 0, b = 0, c = 1;

        for(int i = 1; i <= 20; i++)
        {
            fibonacciList.add(a);
            a = b;
            b = c;
            c = a + b;
        }
        return fibonacciList;
    }

    public void display() {
        System.out.println(fibonacciList);  
    }

    public static void main(String[] args) {
    	Fib_LinkedList fibonacciList = new Fib_LinkedList();
        fibonacciList.sum();
        fibonacciList.display();
    }
}