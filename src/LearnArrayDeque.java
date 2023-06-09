import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(24);
        adq.offerFirst(36);
        adq.offerLast(48);

        adq.offer(1);


        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);




    }
}
