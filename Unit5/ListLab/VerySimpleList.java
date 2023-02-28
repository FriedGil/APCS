package ListLab;

public class VerySimpleList implements FixedLengthList, Sortable{
    private String[] contents;
    private int elemStored;
    public VerySimpleList(){
        contents = new String[10];
        elemStored = 0;
    }
    public void clear(){
        contents = (String[]) new String[10];
        elemStored = 0;
    }

    public int count(){
        return elemStored;
    }

    public String[] getArray(){
        return contents;
    }

    public boolean add(String elem){
        if (elemStored < 10){
            contents[elemStored] = elem;
            elemStored++;
            return true;
        }
        return false;
    }
    public boolean insert(String elem, int index){
        if (elemStored < 10 && index<10 && index>-1){
            for (int i = contents.length-1; i > index; i--){
                contents[i] = contents[i-1];
            }
            contents[index] = elem;
            elemStored++;
            return true;
        
        }
        return false;
    }

    public boolean remove(int index){
        if (index < 10 && index > -1 && !(contents[index] == null)){
            for (int i = index; i < contents.length-1; i++){
                contents[i] = contents[i+1];
            }
            elemStored --;
            return true;        
        }
        return false;
    }

    public void sortAsc() {
        int min;
        String temp;
        for (int i = 0; i < elemStored; i ++){
            min = i;
            for (int j = i + 1; j < elemStored; j++){
                if (contents[min].compareTo(contents[j]) > 0){
                    min = j;
                }
            }
            temp = contents[i];
            contents[i] = contents[min];
            contents[min] = temp;
        }
    }

    public void sortDes() {
        int min;
        String temp;
        for (int i = 0; i < elemStored; i ++){
            min = i;
            for (int j = i + 1; j < elemStored; j++){
                if (contents[min].compareTo(contents[j]) < 0){
                    min = j;
                }
            }
            temp = contents[i];
            contents[i] = contents[min];
            contents[min] = temp;


        }
    }
    
}

