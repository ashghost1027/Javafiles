package DSnA;

import java.util.*;
//FIFO Data Structures. 
//Sorts as per priority and serves the highest priority first. 

public class PriorityQueues {

    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.5);
        queue.offer(2.5);
        queue.offer(10.5);
        queue.offer(7.5);
        queue.offer(1.5);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        Queue<String> queuet = new PriorityQueue<>();
        queuet.offer("Arsh");
        queuet.offer("Balakumaran");
        queuet.offer("Mahalakhmi");
        queuet.offer("Midhursha");
        queuet.offer("Dharshini");
        while (!queuet.isEmpty()) {
            System.out.println(queuet.poll());
        }

    }
}
