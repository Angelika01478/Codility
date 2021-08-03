package Iterations;

/**
 * Created by &[User] and &[Date].
 */
public class BinaryGap {

    public int findLengthOfLongestBinaryGap(int N){

       String binaryString = Integer.toBinaryString(N);
       int count =0;
       int max=0;

        for(int i=1;i<binaryString.length();i++){
            if(binaryString.charAt(i)=='1') {
                if(count>max) max=count;
                count=0;
            }else {
                count++;
            }
        }
        return max;
    }

}
