package org.fasttrackit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/*

Given an array A (distinct numbers) of size N.
The array will be considered valid if each element satisfies the following condition:
whenever a number k from the array is lower than any number x that comes after it in the array,
all numbers following x in the array will be greater than k.
Validate the array according to this rule.

 */

public class ArrayValidator {

    public static String validateArray(int[] numbers){
        for (int k = 0; k < numbers.length; k++){
            for (int x = k+1; x < numbers.length; x++) {
                if (numbers[k] < numbers[x]){
                    for (int y = x+1; y < numbers.length; y++){
                        if (numbers[y] <= numbers[k]){
                            return "INVALID";
                        }
                    }
                }
            }
        }
        return "VALID";
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(
                Paths.get("C:\\Users\\halosd\\Desktop\\JavaProjekts\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\exercise 6 - input.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\halosd\\Desktop\\JavaProjekts\\PragmaticExercises\\src\\main\\java\\org\\fasttrackit\\exercise 6 - output.txt", true));


        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++){
            int arrayLength = scanner.nextInt();

            int[] numbers = new int[arrayLength];

            for (int j = 0; j<arrayLength; j++){
                numbers[j] = scanner.nextInt();
            }

            String result = validateArray(numbers);


            String resultLine = "CASE #" + i + ": " + result;

            bufferedWriter.write(resultLine);
            bufferedWriter.newLine();
        }
    scanner.close();
    bufferedWriter.close();
    }
}
