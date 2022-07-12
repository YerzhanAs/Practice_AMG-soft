package Task;

public class FirstTask {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;

        int[] new_Array=new int[2];

        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){//2+5 2+5 2+11
                    System.out.println(i+" "+j);
                    new_Array[0]=i;
                    new_Array[1]=j;
                }
            }
        }
    }

}
