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
public class LinkedListNode {
    protected int data;
    protected LinkedListNode link;
 
    /*  Constructor  */
    public LinkedListNode()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public LinkedListNode(int d,LinkedListNode n)
    {
        data = d;
        link = n;
    }    
    /*  set link to next LinkedListNode  */
    public void setLink(LinkedListNode n)
    {
        link = n;
    }    
    /*  set data to current LinkedListNode */
    public void setData(int d)
    {
        data = d;
    }    
    /*  get link to next LinkedListNode  */
    public LinkedListNode getLink()
    {
        return link;
    }    
    /*  get data from current LinkedListNode  */
    public int getData()
    {
        return data;
    }
}
