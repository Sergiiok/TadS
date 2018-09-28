package Colletions;




public class Queue<T> implements IQueue<T> {

	
	
	
	private Nodo<T> first;
	private Nodo<T> last;
	private int size;
 public Queue() {
	 first=null;
	 last=null;
	 size=0;
	 
	 
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return first==null;
	}

	
	public T peek() {
		T p=null;
		if(isEmpty()) {
			p=first.getElement();
		}
		return p;
	}
	
	@Override
	public void enQueue(T element) {
		Nodo<T> oLast=new Nodo(element);
				
		if(isEmpty()) {
			first=oLast;
		}else {
			last.setSiguiente(oLast);
		}
		
		last=oLast;
		size++;
	}
	


	@Override
	public Nodo<T> deQueue() {
		
		Nodo<T> retu= new Nodo<T>(first.getElement());
		
		first=first.getSiguiente(); 
		size--;
		
		
		return retu;
		
	}
	@Override
	public Nodo<T> front() {
	return first;
	}
	
	
	

}
