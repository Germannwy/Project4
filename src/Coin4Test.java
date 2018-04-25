/*

 * Authors: Luke Cardon & Wyatt Germann

 * Date: April 24, 2018

 * Description: Using github and junit to help build and run a dynamic program to solve

 * 			    the minimum change problem where minimum number of coins must be found

 */



import org.junit.Assert;



import org.junit.Test;



public class Coin4Test {



	//Prints normal answer (gives minimum number of coins and what denomination)

    @Test

    public void TestOneAnswer() 

    {

        int[] denom = {1,5,10,25};

        int changeFor = 73;

        int[] coins = {25,25,10,10,1,1,1};

        Assert.assertArrayEquals(coins, Coin4.coinsDynamic(denom,changeFor));

        System.out.println("Test 1 Passes");

    }

    //test for incorrect coin (negative coin)

    @Test(expected=IllegalArgumentException.class)

    public void TestThree() 

    {

        System.out.println("Test 3");

        int[] denom = {1,-2,0,10};

        int changeFor = 73;

        int[] coins = {25,25,10,10,1,1,1};    

        Assert.assertArrayEquals(coins, Coin4.coinsDynamic(denom,changeFor));

    }

    //test for impossible change amount (negative change)

    @Test(expected=IllegalArgumentException.class)

    public void TestFour() 

    {

        System.out.println("Test 4");

        int[] denom = {1,5,10,21,25};

        int changeFor = -73;

        int[] coins = {};

        Assert.assertArrayEquals(coins, Coin4.coinsDynamic(denom,changeFor));

    }

    //test for empty array of coins

    @Test(expected=IllegalArgumentException.class)

    public void TestTwo() 

    {

        System.out.println("Test 2");

        int[] denom = {};

        int changeFor = 73;

        int[] coins = {25,25,10,10,1,1,1};

        Assert.assertArrayEquals(coins, Coin4.coinsDynamic(denom,changeFor));

    }

 

}