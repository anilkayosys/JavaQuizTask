/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiztask;

import java.util.Scanner;

/**
 *
 * @author anil.kumar
 */
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        LinkedList list = new LinkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\n Singly Linked List Operations\n");
            System.out.println("1. Please enter 1 to Append an element into the linkedlist");
            System.out.println("2. Please enter 2 to Remove the tail element from a linkedlist");
            System.out.println("3. Please enter 3 to Remove all element in the linkedlist that is great than a target value");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                int value = scan.nextInt() ;
                list.appendElement(value);                     
                break;                          
            case 2 : 
                if (list.isEmpty())
                    System.out.println("Singly Linked List is Empty\n");
                else
                    list.removeTailElement();
                break;                         
          case 3 : 
                System.out.println("Enter the target value");
                int target = scan.nextInt() ;
                if (list.isEmpty())
                    System.out.println("Please enter elements into Singly Linked List\n");
                else
                    list.removeNodes(target);
                break;                    
             
             default : 
                System.out.println("Invalid Option! Please select one of the given Option \n ");
                break;   
            }
            /*  Display the List LinkedList */ 
            if(list.isEmpty()){
            System.out.println("Singly Linked List is Empty\n");
            } else {
                 list.displayLinkedList();
            }         
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
    }
    
}
