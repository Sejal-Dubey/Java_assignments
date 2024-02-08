package assignment2_part1;
public class even_odd {
    public void part1(int data[])
    {
         int[] evenArray=new int[data.length];
        int[] oddArray=new int[data.length];
        int evenCnt=0,oddCnt=0;
        for(int i=0;i<data.length;i++)
        {
            if(data[i]%2==0)
            {
                evenArray[evenCnt]=data[i];
                evenCnt++;
            }//if
            else
            {
                oddArray[oddCnt]=data[i];
                oddCnt++;
            }//else
        }//for

        System.out.println("Original Array");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+"\t");
        System.out.println();
        System.out.println("Even Array");
        for(int i=0;i<evenCnt;i++)
            System.out.print(evenArray[i]+"\t");
        System.out.println();
        System.out.println("Odd Array");
        for(int i=0;i<oddCnt;i++)
            System.out.print(oddArray[i]+"\t");

    }//part1
}
    

