/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoePart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login register = new Login();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n====register====");
        System.out.println("Please enter the username");
        String name = scan.nextLine();
        
    
                    
        System.out.println("Enter your password");
                String password = scan.nextLine();
                
           System.out.println("Enter cellphone");       
             String cellphone = scan.nextLine();
                
      System.out.println(register.registerUser(name, password, cellphone)); 
      
      if (!register.registerStatus(name, password, cellphone)){
    return;
    
    
    }
      System.out.println("\n====login====");
      System.out.println("Enter username:");
      String loginName = scan.nextLine();
      
      System.out.println("Enter password:");
      String loginPass = scan.nextLine();
      
      boolean loginSuccess = register.loginUser (loginName, loginPass);
      System.out.println(register.returnLoginStatus(loginSuccess));
      System.out.println(register.returnLoginStatus(loginSuccess));
      }
        
        }

    
   
    

