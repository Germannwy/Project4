/*

 * Authors: Luke Cardon & Wyatt Germann

 * Date: April 24, 2018

 * Description: Using github and junit to help build and run a dynamic program to solve

 * 			    the minimum change problem where minimum number of coins must be found

 */



import java.util.Arrays;



public class Coin4 {



    public static int[] coinsDynamic(int[] denom, int changeFor)

    {     

        //throw exception for an empty array

        if(denom.length == 0)

        {

            throw new IllegalArgumentException("Can't have an empty array");

        }

        //throw exception for negative change

        for(int i=0; i<denom.length; i++)

        {

            if(denom[i] <= 0)

            {

                throw new IllegalArgumentException("Can't have negative denom");

            }   

        }

        //throw exception for zero change

        if(changeFor <= 0)

        {

            throw new IllegalArgumentException("Can't have zero change");

        }

        //puts lowest denomination denom in front

        Arrays.sort(denom);

        //puts denom in the table

        int[] tableOfCoins = new int[changeFor+1];

        //keeps minimum amount of denom for changeFor

        int[] table = new int[changeFor+1];

        //minimum number of denom needed for changeFor

        int minDenom = 0;

        //a is amount we are calculating in the table

        for(int c =1; c<=changeFor; c++)

        {

            //for each coin denomination

            for(int d=0; d<denom.length; d++)

            {

                if(c>=denom[d])

                {

                    int den = denom[d];

                    minDenom = table[c-den] +1;

                    if((minDenom <= table[c]) || (table[c] == 0))

                    {

                        table[c] = minDenom;

                        tableOfCoins[c] = den;

                    }

                }                

            }      

        }

        int[] coins = new int[minDenom];

        int n = 0;

        int a = changeFor;

        while(coins[minDenom-1] == 0)

        {

            coins[n] = tableOfCoins[a]; 

            a = a-coins[n];

            n++;  

        }

        System.out.println("Minimum coins used: ");

        for(int i=0; i<coins.length; i++)

        {

            System.out.println(coins[i]);

        }        

        return coins;

    } 

}