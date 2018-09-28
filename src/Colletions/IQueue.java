package Colletions;



public interface IQueue<E> {
	
	public boolean isEmpty();
	public void enQueue(E element);
	public Nodo<E> deQueue();
	public Nodo<E> front();
	

}
