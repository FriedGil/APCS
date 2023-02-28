package ListLab;


public interface FixedLengthList 
{
  void clear();			//clear all elements
  boolean add(String elem);	//add an element to the end, return true if operation is successful, return false if list is full
  boolean insert(String elem, int index);	//add an element to the end, return true if operation is successful, return false if list is full or index out of bound
  boolean remove(int index);	//remove an element at given index, return true if operation is successful, return false if the index is empty or index out of bound
  int count();				//return the number of element in the list
  String[] getArray();		//return an array containing all elements
}

