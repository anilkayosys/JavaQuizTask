/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiztask;

/**
 *
 * @author anil.kumar
 */
public class LinkedList {
    protected LinkedListNode start;
    protected LinkedListNode end ;
    public int size ;

    /*  Constructor  */
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }
    
    /*  check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    
    /*  get size of list  */
    public int getSize()
    {
        return size;
    }
    
     /*  Append an element into the linkedlist */
    public void appendElement(int val)
    {
        LinkedListNode nodePtr = new LinkedListNode(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nodePtr;
            end = start;
        }
        else 
        {
            end.setLink(nodePtr);
            end = nodePtr;
        }
    }
    
  
    /*  Remove the tail element from a linkedlist */
    public void removeTailElement() {

            if (end == null)

                  return;

            else {

                  if (start == end) {

                        start = null;

                        end = null;

                  } else {

                        LinkedListNode previousToTail = start;

                        while (previousToTail.getLink() != end)

                             previousToTail = previousToTail.getLink();

                        end = previousToTail;

                        end.setLink(null);
                        size--;

                  }

            }

      }
                 
      /*  display elements  */
    public void displayLinkedList()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData());
            return;
        }
        LinkedListNode ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
      
    public void removeNodes(int x) {   
        //find first head node
        LinkedListNode temp = start;
        LinkedListNode prev = null;
            
        while(temp!=null && temp.getData()>x){
            start = temp.getLink();
            temp = null;
            size--;
            temp = start;
        }
        
        while(temp!=null){
            while(temp!=null && temp.getData()<=x){
                prev = temp;
                temp = temp.getLink();
            }
            
            if(temp == null) return;
            
            prev.setLink(temp.getLink());                      
            temp = null;
            size--;
            temp = prev.getLink();
        }
        
    }
    
    
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            LinkedListNode s = start;
            LinkedListNode t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        LinkedListNode ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                LinkedListNode tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }    
}
