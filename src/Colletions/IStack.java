package Colletions;

public interface IStack<E> {
	
	public void push(E element);
	public void pop();
	public E top();
	public int sizeStack();
	public boolean isEmpty();
	public E lastElement();

}
