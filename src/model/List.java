package model;

public class List{
    
    private Node head;
    private Node tail;

    public List(){
    }

    public void addLast (Node node){
        if (head == null){
            head = node;
            tail = node;
            head.setNext(node);
            tail.setPrevious(node);
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
            this.tail = node;
            head.setPrevious(this.tail);
            tail.setNext(head);
        }
    }

    public void AddStar (Node node){
        if (head == null){
            head = node;
            tail = node;
            head.setNext(node);
            tail.setNext(node);
        }
        else{
            node.setNext(head);
            head.setPrevious(node);
            head = node;
            head.setPrevious(this.tail);
            tail.setNext(node);
        }
    }

    public Node searchNode(int value){
        return searchNode(value, head);
    }

    private Node searchNode (int value, Node current){
        //Caso base
        if (current == null){
            return null;
        }
        //Caso base
        if (value == current.getValue()){
            return current;
        }

        return searchNode (value, current.getNext());
    }

    public void deleteNode (int value){
        deleteNode(value, null, head);
    }

    private void deleteNode (int value, Node previous, Node current){
        //Caso base - Un unico elemento
        if (head.getValue()==value && tail.getValue()==value){
            head = null;
            tail = null;
            return;
        }

        //Caso base - Llega al ultimo elemento 
        if (current == null){
            return;
        }

        //Caso base - Encuentra el elemento que buscaba
        if (current.getValue() == value){
            previous.setNext(current.getNext());
            current.setNext(null);
            return;
        }

        //Caso recursivo - Recorre la lista de nodos
        deleteNode (value, current, current.getNext());

    }

    public String toString(){
        if (head==null){
            return "The list is empty";
        }
        else{
            return "[" + print() + "]";
        }
    }


    public String print(){
        return print(this.head);
    }

    private String print(Node current){
        String msg;

        if(this.head==null){
            msg = "La lista está vacia ";
            return msg;
        }
        if(current==this.tail){
            msg = "" + current.getValue();
            return msg;
        }

        msg = "" + current.getValue();
        return msg + ", " + print (current.getNext());
    }
}