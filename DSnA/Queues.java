package DSnA;

import java.util.Queue;
import java.util.LinkedList;
//FIFO = First In First Out. 
// Holds elements prior to processing;

//Enqueue = Add to the last of the queue;
//Dequeue = Remove from the first of the queue;

// add = offer()
// remove = poll()
// peek = peek()
// Used in LinkedLists, PriorityQueues, BreadthFirstSearch Algorithm. 

// Inherits from collections class and thus has the methods;
// eg: .isempty(), .size(), .contains(). 

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Number1");
        queue.offer("Number2");
        queue.offer("Number3");
        System.out.println(queue.peek());
        queue.poll();
        String first = queue.poll();
        System.out.println(first);
    }
}
