package Sergo.Lisens.Lisens2.FrameWork.LinkedList;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size;

    public void add(int value){
        // если это первое добавление
        if(head == null){
             this.head = new Node(value);
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));
            //[1] -> [2] -> [3] -> [4]
        }
        size++;
    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while(temp != null){
            result[idx++] = temp.getValue();
            temp = temp.getNext();

        }
        return Arrays.toString(result);
    }

    public int get(int index)  {
        int correntIndex = 0;

        Node temp = head;

        while(temp != null ){
            if(correntIndex == index){
                return temp.getValue();
            }else{
                temp = temp.getNext();
                correntIndex++;
            }
        }
        throw new IllegalArgumentException();
    }
    public void remove(int index){
        int correntIndex = 0;
        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }
        Node temp = head;

        while (temp != null){
            if(correntIndex  == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else{
                temp = temp.getNext();
                correntIndex++;
            }
        }

    }
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        public Node getNext() {
            return next;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
