package MoreDatatypesAndOperators;

public class QDemo {

	public static void main(String[] args) {

		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		int ch;
		int i;
		System.out.println("ussing bigQ to store the alphabet");
		// put some numbers into bigQ
		for (i = 0; i < 30; i++)
			bigQ.put(i);
		// Retrieve and put elements from bigQ
		System.out.print("Contents of bigQ: ");
		for (i = 0; i < 30; i++) {
			ch = bigQ.get();
			if (ch !=  0)
				System.out.print(ch+",");

		}
		System.out.println("\n");

		System.out.println("using smallQ to generate errors.");
		// now use smallQ to generate some errors
		for (i = 0; i < 5; i++) {
			System.out.print("attemting to store " +  (i));

			smallQ.put( (i));

			System.out.println();
		}
		System.out.println();
		// more errors in smallQ
		System.out.print("contents of smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();

			if (ch !=  0)
				System.out.print(ch+",");

		}
	}

}
