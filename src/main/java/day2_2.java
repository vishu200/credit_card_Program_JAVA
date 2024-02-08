import java.util.Arrays;



public class day2_2 {



    public static void main(String[] args) {

        int numArr[]=new int[10];
        numArr[0]=10;
        numArr[1]=34;
        numArr[2]=34;
        numArr[3]=34;
        numArr[4]=34;
        numArr[5]=34;
        numArr[6]=34;
        numArr[7]=34;
        numArr[8]=34;

        System.out.println(numArr.length);  //output will be 100

        System.out.println(Arrays.toString(numArr)); //to print complete array

        Arrays.sort(numArr); //sort the array

        System.out.println(Arrays.toString(numArr));

        /*
        int sum=0;

        for(int a:numArr)
        {
            sum+=a;
        }
        System.out.println(sum);*/
        int prefixSum[]=getPrefixSum(numArr);
        System.out.println(Arrays.toString(prefixSum));

    }

    public static int []getPrefixSum(int[] numArr)
    {
        int resultArr[]=new int[numArr.length];
        int sum=0;
        for(int i=0;i<numArr.length;i++)
        {
            sum+=numArr[i];
            resultArr[i]=sum;
        }

        return resultArr;

    }
}
