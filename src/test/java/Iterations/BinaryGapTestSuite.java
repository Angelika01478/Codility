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





}
