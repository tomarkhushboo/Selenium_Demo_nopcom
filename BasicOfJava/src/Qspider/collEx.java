package Qspider;

import java.util.LinkedList;
import java.util.Queue;

public class collEx {

	public static void main(String[] args) {
		Queue p = new LinkedList();
		p.add(10);
		p.add("java");
		p.add(35.89);
		p.add('a');
		p.add(true);

		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p.peek());
		System.out.println(p.element());
	}

}
