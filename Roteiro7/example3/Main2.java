package example3;

public class Main2 {
    public static void main(String a[]){
  
        Linked queue = new Linked();
        
        queue.enqueue(6);
        queue.enqueue(3);
        queue.print_frontRear();
        queue.enqueue(12);
        queue.enqueue(24);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        
        queue.print_frontRear();
        }
       }

