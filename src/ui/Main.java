package ui;
import model.List;
import model.Node;


public class Main {

    public static void main (String[] args){

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);


        List lista = new List();
        lista.addLast(node1);
        lista.addLast(node2);
        lista.addLast(node3);
        lista.addLast(node4);

        lista.print();

        System.out.println("Los valores de los nodos son: ");
        System.out.println (lista.toString());
        System.out.println("Bye, bye <3: ");

    }
}