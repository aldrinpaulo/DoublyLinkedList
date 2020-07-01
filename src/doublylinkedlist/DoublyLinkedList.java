/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author Enubs
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person [] person = new Person[5];
      
        
      
      
        
        person[0] = new Person("Aldrin", "Wabingga", "Panacan,");
    	person[1] = new Person("Jonh", "Labandan", "Panacan,");
    	person[2] = new Person("Sherwin", "Dagoling", "Tibungco,");
    	person[3] = new Person("Dominique", "Tuloy", "Gensan,");
    	person[4] = new Person("Terrence", "Romeo", "Imus Cavite,");
        
    	
                
        DNode<String> node1 = new DNode<String>(person[0].get_FullName(), null);
        DNode<String> node2 = new DNode<String>(person[0].get_FullName(), null);
        DNode<String> node3 = new DNode<String>(person[0].get_FullName(), null);
        DNode<String> node4 = new DNode<String>(person[0].get_FullName(), null);
        DNode<String> node5 = new DNode<String>(person[0].get_FullName(), null);
        
       
    	
    	DList<String> DList = new DList<>();
        
        DList.addFirst(node1);
    	DList.addFirst(node2);
        DList.addFirst(node3);
    	DList.addFirst(node4);
         DList.addFirst(node5);
    	
        
        System.out.println("\nBefore removeFirst()");
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.removeFirst();
        DList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        DList.addFirst(node1);
        DList.addFirst(node5);
        DList.addLast(node3);
        DList.showList();
        System.out.println();
    }
}