package az.sahil.ds.queue;

public class App {
    public static void main(String[] args) {
        Queue queue =new Queue(5);

        queue.insert(124);
        queue.insert(7989);
        queue.insert(500);
        queue.insert(3);
        queue.insert(97);
        queue.insert(3364);

        queue.view();

    }

}
