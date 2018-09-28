package Colletions;



public class SerList<E> implements IList<E>, IStack<E> {
	
	
	E element;
	Nodo<E> nodo;
	private int size;
	
	public SerList () {
		nodo=null;
		size=0;
	}

	@Override
	public void addElement(E elem) {
		if (nodo == null) {
			nodo = new Nodo<E>(elem);
			size++;
		}
		else {
			Nodo<E> nodo2 = nodo;
			while (nodo2.getSiguiente() != null) {
				nodo2 = nodo2.getSiguiente();				
			}
			Nodo<E> nodeAdd = new Nodo<E>(elem);
			nodo2.setSiguiente(nodeAdd);;
			size++;
		}
		
	}

	@Override
	public void removeElement(E elem) {
		
		Nodo<E> nodo1=nodo;
		Nodo<E> nodo2=null;
		while(nodo1!=null) {
			if(nodo1.getElement().equals(elem)) {
				nodo2=nodo1.getSiguiente();
				nodo1=nodo2;
				
			}
			nodo1=nodo1.getSiguiente();
		}
		size--;
	}

	@Override
	public int sizeList() {
		
		return size;
	}

	@Override
	public boolean existElement(E elem) {
		boolean de=false;
		Nodo<E> nodo2= nodo;
		if(nodo2!=null) {
			if(nodo2.equals(element)) {
				de=true;
			}else {
				nodo2=nodo2.getSiguiente();
			}
		}
	
		return de;
	}


	
	@Override
	public boolean isEmptyList() {
		
		return nodo==null;
	}

	@Override
	public E searchElement(Object elem) {
		Nodo<E> nodo1 = null;
		for (Nodo<E> node2 =nodo ; nodo != null ; node2.getSiguiente()) {
			if (node2.getElement().equals(elem)) {
				nodo1 = node2;
			}
		}
		return (E) nodo1.getElement();
	}

	@Override
	public void push(E elem) {
		addElement(elem);
	}

	@Override
	public void pop() {
		
	removeElement(lastElement());	
	}

	@Override
	public E top() {
	
		
		return lastElement();
	}

	@Override
	public int sizeStack() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return nodo==null;
	}

	@Override
	public E lastElement() {
		Nodo<E> nodo2=null;	
		if(isEmpty()) {
			nodo2=null;
			
		}else {
			
			Nodo<E>nodo1=nodo;
			while(nodo1!=null) {
				if(nodo.getSiguiente()!=null) {
					nodo1=nodo1.getSiguiente();
					
				}else {
					nodo2=nodo1;
					nodo1=null;
				}
			}
		}
		return (E)nodo2;
	}
	

}
