package generics;

public class GenericsStackUsingArray<E>  {

    int currentIndex = 0;
    private E[] list;

    public GenericsStackUsingArray(int initializer) {
        this.list = (E[]) new Object[initializer];
    }

    public boolean isEmpty() {
        for (E e: list) {
            if (e != null) {
                return false;
            }
        }
        return true;
    }

    public void push(E element) {
        if (currentIndex < list.length) {
            list[currentIndex++] = element;
        }
    }

    public E pop() {
        E lastValue = list[currentIndex - 1];
        list[currentIndex--] = null;
        return lastValue;
    }

    public E peek() {
        return list[currentIndex - 1];
    }

    public Integer size() {
        return currentIndex;
    }

    public void display() {
        for (E e : list) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        GenericsStackUsingArray<String> stack = new GenericsStackUsingArray<>(5);

        System.out.println(stack.isEmpty());

        stack.push("Emperor");
        stack.push("Ridoh");
        stack.push("Noah");
        stack.push("Pelorina");
        stack.display();

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.push("Carpenter");
        stack.push("Carpent");
        stack.push("Carpt");
        System.out.println(stack.peek());
        stack.display();
        System.out.println(stack.size());

    }

}
