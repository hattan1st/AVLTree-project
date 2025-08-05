/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treeavl;
import java.util.*;

public class TreeAVL {

    public static void main(String[] args) {
       BST AVL = new BST();
       Scanner input = new Scanner(System.in);
       
        /*
       
       for (int i = 1; i <= 10; i++) {
            AVL.insert(i);
        }
       AVL.display();
       System.out.println("\nthe Height of Tree is : "+AVL.height());
       //System.out.println(AVL.balanced());
       
       
        */
       
       
       // /*
      System.out.print("Enter any Number to Start (Exsept 0):"); 
      int start = input.nextInt() ;
      
      
      while (start != 0){
        System.out.println("--------------------\nChoose 1 to Display Tree");
        System.out.println("Choose 2 to Check is Empty or Not");
        System.out.println("Choose 3 to Insert Node");
        System.out.println("Choose 4 to show Height");
        System.out.println("Choose 5 to Cheak if Balanced");
        System.out.println("Choose any number to Exit\n");
        
        System.out.print("Entr your Answer : "); 
        int chooses = input.nextInt() ;
      
      
        switch (chooses ){
              case 1 :
                  AVL.display();
                  
          
            case 2:
                boolean Answer = AVL.isEmpty();
                if (Answer) 
                      System.out.println("Tree is Empty\n");
                else
                      System.out.println("Tree is Not Empty\n");
                break;
                
            case 3 :
                System.out.print("Enter Value : ");
                int Value = input.nextInt();
                AVL.insert(Value);
                System.out.println("\nTree after insert Node :");
                AVL.display();
                break;
              
            case 4 :
              System.out.println("Height of the Tree is "+AVL.height()+"\n");  
              break;
            
             case 5 :
                 if (AVL.balanced()){
                     System.out.println("the tree is balanced\n");  
                 }else{
                     System.out.println("the tree is not balanced\n");  
                 }
              
              break;
         }
          System.out.println("--------------------\nDo you Want coutinu ? \n-Entr any number to coutoun\n-press 0 to Exit");
          
          System.out.print("Entr your Answer : "); 
          start = input.nextInt() ;
      }
      // */
        /*
        عمل الطالبات
            هتان عبدالله
            رنا عبدالله
            بيلسان دخيل
      */
      
        
      
        
      //System.out.println("The Height of the Tree is "+AVL.height()+"\n");
      //AVL.display();
      
      
        
    }
}
