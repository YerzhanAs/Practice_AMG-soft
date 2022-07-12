package lesson3.practice;

public class MyLibMatrixProcessingException extends MyLibException {
   private int index;
   private int value;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyLibMatrixProcessingException( int index, int[] array) {
        super("Invalid data in ["+index+"]: "+array[index]);
        this.index = index;
        this.value = array[index];
    }
}
