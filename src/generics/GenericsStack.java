package generics;

import java.util.ArrayList;

public class GenericsStack<E> {

    //isEmpty(), isFull(), push, pop, peek, size()
    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public Integer size() {
        return list.size();
    }

    public void display() {
        for (E e : list) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        GenericsStack<String> stack = new GenericsStack<>();
        GenericsStack<Integer> scores = new GenericsStack<>();

        System.out.println(stack.isEmpty());

        stack.push("Emperor");
        stack.push("Ridoh");
        stack.push("Noah");
        stack.push("Pelorina");
        stack.push("Carpenter");

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();

    }

}
