package lesson3.hw;

public class Main {
    public static void main(String[] args) {

        String arr[][]={
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3A","4"},
        };

        try{
            System.out.println(SumArray(arr));
        }catch (MyException e){
            System.out.println("Error");
        }

    }

    public static int SumArray(String arr [][]){
        int sum=0;

        if(arr.length!=4){
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length!=4){
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException n) {
                    throw new MyArrayDataException();
                }
            }
        }

        return sum;
    }
}
