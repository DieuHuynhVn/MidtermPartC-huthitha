/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridan.huthitha.midtermpartc;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Status {
public static void main(String[] args)
    {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    StausUser t= new StausUser();
    t.statusDetail(code); 
    }    
}
