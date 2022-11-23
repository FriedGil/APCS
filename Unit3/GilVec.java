public class GilVec <T> {
    private T[] contents;
    private int length;

    public GilVec(T[] contents){
        this.contents = contents;
        this.length = contents.length;
    }

    public void append(T value){
        T[] temp = this.contents;
        contents = (T[]) new Object[length+1];
        for (int i = 0; i < length; i++){
            contents[i] = temp[i];
        }
        contents[length+1] = value;
        length+=1;
    }
}
