package arr;

import java.util.Scanner;
import java.util.Random;

public class Tester {

    public static void ex1(int[] arr, int i)
    {
        if(arr.length == 5)
        {
                if(arr[i] % 2 == 0)
                {
                    //
                }

                else
                {
                    for(int j = i; j<arr.length; j++)
                    {
                        if(arr[j] % 2 == 0)
                        {
                            arr[i] = arr[j];
                        }

                        else
                        {
                            for(int z = 0; z < i; z++)
                            {
                                if (arr[z] % 2 == 0)
                                {
                                    arr[i] = arr[z];
                                }
                            }
                        }
                    }


                }
        }

        System.out.println(arr[i]);

    }

    public static void ex2(int[] arr)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0; int count = 0;
        for(int i = 0; i<5; i++)
        {
            count++;

            System.out.println("Enter an integer number: ");
            arr[i] = scan.nextInt();

            sum += arr[i];
        }

        System.out.println(sum / count);
    }

    public static int ex3(int[] arr)
    {
        Scanner scan = new Scanner(System.in);

        int min = 101;

        for(int i = 0; i<5; i++)
        {
            System.out.println("Enter an integer number: ");
            arr[i] = scan.nextInt();
            if(arr[i] <= 100) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }

        return min;
    }

    public static void ex4(int[] arr)
    {
        if(arr.length == 10)
        {
            for(int i = 0; i<arr.length - 1; i++)
            {
                if(arr[i] % 2 != 0 && arr[i+1] % 2 != 0)
                {
                    System.out.println("(" + arr[i] + ", " + arr[i+1] + ")");
                }
            }
        }
    }

    public static void ex5(int num)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = rand.nextInt();
            if(num == arr[i])
            {
                System.out.println("true");
                break;
            }
        }

        System.out.println("false");

    }

    public static void ex6()
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = rand.nextInt();
        }

        for(int j = 0; j< arr.length - 1; j++)
        {
            if((arr[j] + arr[j+1]) % 2 == 0)
            {
                System.out.println("(" + arr[j] + ", " + arr[j+1] + ")");
            }
        }
    }

    public static void ex7()
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int max = 0;
        int[] arr = new int[10];
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = rand.nextInt();
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        arr[arr.length - 1] = max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[10];
        for(int i = 0; i< arr1.length; i++)
        {
            arr1[i] = rand.nextInt(10);
        }

        for(int i = 0; i< arr2.length; i++)
        {
            arr2[i] = rand.nextInt(10);
        }

        ex1(arr1, 2);
        System.out.println("------------------------------");
        ex2(arr1);
        System.out.println("------------------------------");
        System.out.println("Lowest grade: " + ex3(arr1));
        System.out.println("------------------------------");
        ex4(arr2);
        System.out.println("------------------------------");
        ex5(9);
        System.out.println("------------------------------");
        ex6();
        System.out.println("------------------------------");
        ex7();


    }

}
