/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.Scanner;

/**
 *
 * @author IT069 arjun
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory fur_type = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell Furniture you want for your home \n1.Mordern\n2.Royal"+"\nEnter choice :- ");
        int choice = Integer.parseInt(sc.nextLine());
        
       switch(choice){
           case 1:
               fur_type = new MordenFurnitureFactory();
               break;
           case 2:
               fur_type = new RoyalFurnitureFactory();
               break;
           default:
               System.out.println("not valid choice");
               break;
       }
       
       Manager furniture = new Manager(fur_type);
       furniture.getFurniture();
    }

}
