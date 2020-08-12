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
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet",7));
        
        Scanner scan = new Scanner(System.in);
        List<Integer> occur = new ArrayList<>();
        
        int num = askNumber(scan);
//        int num2 = askNumber(scan);
        String s1 = askString(scan);
//        String s2 = askString(scan);
        
        if(checkIfNumExistsInString(num, s1)) {
            occur = findStringOccurences(num, s1);
        }
        System.out.println("Occurences");
        for (Integer integer : occur) {
            System.out.println("Occurence in position = " + integer);
        }
    }
    
    public static int askNumber(Scanner scan){
        
        int num;
        
//        System.out.println("Give a number");
        System.out.println("/*********************************/");
        System.out.println("Give the number : ");
        num = scan.nextInt();
        
        return num;
    }
    
    
    public static String askString(Scanner scan){
        
        String s;
        
//        System.out.println("Give a String");
        System.out.println("/*********************************/");
        System.out.println("Give the string : ");
        s = scan.next();
        
        return s;
    }
    
    public static boolean checkIfNumExistsInString(int num, String s){
        
        return s.contains(String.valueOf(num));
    }
    
    // 22
//    strArr[0] = "22"
//    strArr[1] = "abc"
    //22abc22def22
    //22 abc 22 def
    public static List<Integer> findStringOccurences(int num, String s) {
       List<Integer> occurences = new ArrayList<>();
       // for, while (loop) searching for the num in consecutive places
       String strNum = String.valueOf(num);
       
       int counter = 0;
       int c = 0;
       while(c >= 0) {
           if(counter == 0) {
                counter = s.indexOf(strNum);
                occurences.add(counter);
                counter += strNum.length();
           } else {
               if(c > s.length()) c = -1;
               c = s.indexOf(strNum, counter);
               System.out.println(c);
               
               if(c > 0 && c <= s.length()) {
                   occurences.add(c);
                   counter += strNum.length();
               } 
               
           }
       }
       return occurences;
    }
    
    
}
