package Colletions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Nodo <E> {
	
	
	E element;
	
	
	Nodo<E> siguiente;
	
	
	public Nodo(E element ) {
		
		this.element=element;
		siguiente=null;
		
	}
	
 
	
		 
		
		 
		 
		 
		 
	 
	 



	public Nodo<E> getSiguiente() {
		return siguiente;
	}





	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}




	public E getElement() {
		return element;
	}




	public void setElement(E element) {
		this.element = element;
	}
	
	
	

}
