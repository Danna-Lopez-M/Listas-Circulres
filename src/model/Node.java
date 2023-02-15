package model;

public class Node{
    
    private Node next;
    private Node previous;
    private int value;
    

    public Node(int value){
        this.value = value;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getPrevious(){
        return this.previous;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        
        return "";
    }
}