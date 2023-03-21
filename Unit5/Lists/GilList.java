package Unit5.Lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GilList implements List<Object>{
    private Node initial;
    public int size;

    public GilList(){
        initial = new Node(0);
        size = 0;
    }
    public Object set(int index, Object value){
        Node current = initial;
        for (int i = 0; i < index; i++){
            if (current.getNode() == null) return null;
            current = current.getNode();
        }
        return current.getValue();
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return false;
    }
    public boolean contains(Object o) {
        Node current = initial;
        for (int i = 0; i < size; i++){
            current = current.getNode();
            if (current.getValue() == o) return true;
        }
        return false;
    }
    public Iterator<Object> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    public Object[] toArray() {
        Object[] res = new Object[size];
        Node current = initial;
        for (int i = 0; i < size; i++){
            res[i] = current.getValue();
            current = current.getNode();
        }
        return res;


    }
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }
    public boolean add(Object e) {
        if (size == 0){
        }
        Node current = initial;
        if (current.value == null){
            current.value = e;
            size ++;
            return true;

        }
        for (int i = 0; i < size; i++){
            current = current.getNode();
        }
        current.setRight(new Node(e));
        size ++;
        return true;

    }

    
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean addAll(Collection<? extends Object> c) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean addAll(int index, Collection<? extends Object> c) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    public void clear() {
        initial = null;
        size = 0;        
    }
    public Object get(int index) {
        Node current = initial;
        for (int i = 0; i < size; i++){
            current = current.getNode();
        }
        return current.getValue();

    }
    public void add(int index, Object element) {
        // TODO Auto-generated method stub
        
    }
    public Object remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    public ListIterator<Object> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    public ListIterator<Object> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    public List<Object> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }
    private class Node{
        private Object value;
        private Node right;
        public Node(Object v){
            value = v;
            right = null;
        }
        public Node(){
            value = null;
            right = null;
        }
        public Node getNode(){
            return right;
        }
        public Object getValue(){
            return value;
        }
        public void setRight(Node n){
            this.right = n;
        }
        public void setValue(Object value){
            this.value = value;
        }
    }
}


