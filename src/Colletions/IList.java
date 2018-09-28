package Colletions;

public interface IList<E> {
	
	
	public void addElement(E elem);
	public void removeElement(E elem);
	public int sizeList();
	public boolean existElement(E elem);
	
	public boolean isEmptyList();
	public E searchElement(E elem);
	
	
}
