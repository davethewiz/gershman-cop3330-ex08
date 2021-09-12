/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static int StringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main( String[] args )
    {
        int peopleCount = StringToInt(GetInput("How many people? "));
        int pizzaCount = StringToInt(GetInput("How many pizzas do you have? "));
        int pizzaSliceCount = StringToInt(GetInput("How many slices per pizza? "));
        int totalSlices = pizzaSliceCount * pizzaCount;

        System.out.println(peopleCount + " people with " + pizzaCount + " pizzas (" + totalSlices + " slices)");

        int slicesPerPerson = totalSlices / peopleCount;
        int leftOverSlices = totalSlices % peopleCount;

        System.out.println("Each person gets " + slicesPerPerson +" pieces of pizza.");
        System.out.println("There are " + leftOverSlices + " leftover pieces.");
    }
}