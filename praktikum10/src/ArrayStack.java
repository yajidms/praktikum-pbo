import java.util.ArrayList;
import java.util.List;

public class ArrayStack<T> {
  private final int maxsize;
  private final List<T> items;
  private int top;

  public ArrayStack(int maxsize) {
    if (maxsize <= 0) throw new ArrayStackException("Stack size must be positive");
    this.maxsize = maxsize;
    this.items = new ArrayList<>(maxsize);
    this.top = 0;
  }

  public void push(T item) {
    if (top == maxsize) throw new ArrayStackException("Overflow Error");
    if (top < items.size()) items.set(top, item); else items.add(item);
    top++;
  }

  public T pop() {
    if (isEmpty()) throw new ArrayStackException("Underflow Error");
    T val = items.get(--top);
    items.remove(top);
    return val;
  }

  public boolean isEmpty() { return top == 0; }

  public static class ArrayStackException extends RuntimeException {
    public ArrayStackException(String message) { super(message); }
  }

  public static void main(String[] args) {
    ArrayStack<Integer> stack = new ArrayStack<>(3);
    stack.push(1); stack.push(2); stack.push(3);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
