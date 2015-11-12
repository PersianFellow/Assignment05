/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderedListAssignment;

/**
 *
 * @author fathn1690
 */
public class OrderedList {
    private Node head;
    private int numItems = 0;
    
    /**
     * creates an empty list
     */
    public OrderedList(){
        head = null;
        numItems = 0;
    }
    
    /**
     * Add the node to the beginning of the list 
     * @param n the node to add
     */
    public void add(int num){
        
        Node x = new Node(num);
        
        Node current = head;
        
        if(numItems == 0){
            x.setNext(head); //since there are no numbers in the list, the whole list is the head
        }
        
        
    }
    
    
    
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }
    
    public void remove(int index){
        if(index >= numItems || index < 0){
            return;
        }
        //delete first item
        if(index == 0){
            head = head.getNext();
            //deleting end item
        }else if(index == numItems -1){
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.getNext();
            }
            //make it point nowhere
            n.setNext(null);
            
            //remove from the middle
        }else{
            Node n = head;
            for(int i = 0; i < index -1; i++){
                n = n.getNext();
            }
            //ask the node for its next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }
    
    public int getInt(int index){
        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.getNext();
        }
        return n.getNum();
    }
    
    public int size(){
        return numItems;
    }
    
}
