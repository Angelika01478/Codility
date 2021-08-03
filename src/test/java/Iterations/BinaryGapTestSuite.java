package Iterations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by &[User] and &[Date].
 */
public class BinaryGapTestSuite {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testFromExample(){
        int N =9;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFromExample2(){
        int N =529;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =4;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFromExample3(){
        int N =20;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFromExample4(){
        int N =15;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFromExample5(){
        int N =1041;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =5;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testFromExample6(){
        int N =32;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =0;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testForBigValue(){
        int N =65531;
        int result= binaryGap.findLengthOfLongestBinaryGap(N);
        int expected =1;
        Assert.assertEquals(expected,result);
    }





}
