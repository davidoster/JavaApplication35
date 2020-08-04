/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 10 100
        // aaaa10aaaa10bbbb10dddd100
        // ffasadasd10sdfsrf1fdgdfgdf100dfsdfsd1dsdf10sdfsf100sdfsdf
       
        
        // 1. find if any of the numbers are substrings on the given strings
        // 2. if there are then count the occurences along with their position within the string
        
        Scanner scan = new Scanner(System.in);
        
        int num = askNumber(scan);
        int num2 = askNumber(scan);
        String s1 = askString(scan);
        String s2 = askString(scan);
        
        checkIfNumExistsInString(num, s1);
        checkIfNumExistsInString(num2, s2);
        
        
    }
    
    public static int askNumber(Scanner scan){
        
        int num;
        
        System.out.println("Give a number");
        System.out.println("/*********************************/");
        System.out.println("Give the number : ");
        num = scan.nextInt();
        
        return num;
    }
    
    
    public static String askString(Scanner scan){
        
        String s;
        
        System.out.println("Give a String");
        System.out.println("/*********************************/");
        System.out.println("Give the string : ");
        s = scan.nextLine();
        
        return s;
    }
    
    public static boolean checkIfNumExistsInString(int num, String s){
        
        return s.contains(String.valueOf(num));
    }
    
    public List<Integer> findStringOccurences(int num, String s) {
       List<Integer> occurences = new ArrayList<>();
       // for, while (loop) searching for the num in consecutive places
       
       // occurences.add(x);
       return occurences;
        
    }
    
    
}
