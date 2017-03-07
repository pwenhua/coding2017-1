package basic;
 

import java.util.Arrays;

public class ArrayList implements List {
	
	private int size = 0;
	
	private Object[] elementData = new Object[2];
	
	public void EnsureEnoughSize(){
		if (size == elementData.length )			
		{
			//elementData = Arrays.copyOf(elementData, elementData.length +10); 
			Object[] newElement = new Object[size+10];
			System.arraycopy(elementData, 0, newElement, 0, size);
			elementData = newElement;
		}
	}
	
	public void add(Object o){
		EnsureEnoughSize();
		elementData[size]=o;
		size++;	
	}
	public void add(int index, Object o){

		EnsureEnoughSize();
		if (index > size || index < 0){
			return;	
		}
		
		//for (int i =  size-1; i>index;i --){
		//	elementData[i]=elementData[i-1];
		//}
		
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]=o;
		size++;
	}
	
	public Object get(int index){
		if (index >= size || index < 0){
			return null;
		}
		else {
			return elementData[index];
		}
		
	}
	
	public Object remove(int index){
		if (index >= size || index < 0){
			return null;
		}
		else {
			Object o = elementData[index];
			//for (int i =index; i< size-1; i++){
			//	elementData[i]= elementData[i+1];
			//}
			
			System.arraycopy(elementData, index+1, elementData, index, size-index);
			size--;
			return o;
		}
	}
	
	public int size(){
		return size;
	}
	
	public Iterator iterator(){
		return null;
	}
	
}

private class Iter (){
	
}