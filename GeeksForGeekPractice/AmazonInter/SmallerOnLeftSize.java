package Javalab;
import java.util.*;

public class SmallerOnLeft {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
/*
    First:  [ 1 6 4 10 2 5]
              0 1 2 3  4 5   
    Second: [-1 1 1 1  1 2]             
             

*/
        
        int[] First =new int[6]; // [1 6 4 10 2 5]
        int[] Second=new int[6]; 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Values");
        for(int i=0;i<First.length;i++)
        {
            First[i]=sc.nextInt();
        }

        try
        {
            for(int i=0;i<First.length;i++)
            {

                int temp=1,temp1=1;
                int maintemp=i;
                if(i==0||i==1)
                {
                    Second[1]=First[0];
                    continue;
                }
                // i==2 ; First[2]>First[1] ; First[2]>First[1]  ; //false
                if(First[i]>First[i-1])
                {
                    temp=First[i-1];

                }
                i=maintemp;           //This is declared to handle Array out of Bound Exception


                if(First[i]>First[i-2])
                {

                    temp1=First[i-2];
                }
                i=maintemp;            //This is declared to handle Array out of Bound Exception

                if(temp>temp1)
                {
                    Second[i]=temp1;

                }
                else
                {
                    Second[i]=temp;
                }

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Array List is ");
        for(int i=0;i<Second.length;i++)
        {
            System.out.println(Second[i]);
        }

    }

}
