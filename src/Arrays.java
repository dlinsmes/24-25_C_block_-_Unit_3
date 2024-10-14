import java.util.Scanner;

public class Arrays {

    public static void main(String [] args) {

        String word = "hello";

        //a string's length is the number of chars
        System.out.println(word.length());

        //indexing (positioning) starts at 0
        //substring(index) provides the part of the string
        //beginning at index and going to the end of the string
        System.out.println(word.substring(1));

        //another version of substring accepts two indices:
        //beginning and ending (exclusive of ending)
        System.out.println(word.substring(3, 4));

        //arrays hold multiple values under a single variable
        //name
        //-reference an individual value in the array by
        //using an index (position)

        //declare an array that holds String values called words
        //and initialize it to hold 4 values
        String [] words = new String [4];

        //different from lists, array lengths are fixed
        //-can't append or insert more items or remove items

        //indexing starts at 0

        //assign a value to a specific position
        //words[0] = "word";
        words[1] = "eyes";
        words[2] = "arms";
        words[3] = "legs";

        //when you use an index that isn't valid, the
        //program will crash with an out of bounds error

        //words[4] = "blah";

        //in general, the last usable index is the length - 1

        System.out.println("value at index 1 is: " + words[1]);

        //when a value isn't assigned in an array, it defaults to null (nothing stored)
        System.out.println("value at index 0 is: " + words[0]);

        //for int arrays, default value is 0, for doubles 0.0,
        //booleans false;

        //default values only get assigned for arrays,
        //not singular value variables
        String something;
        //System.out.println(something);

        int [] numbers = new int[3];
        System.out.println(numbers[2]);

        //print all the values in words

        //-this prints the array's memory location (not useful)
        System.out.println(words);

        //use a loop to print each element in words
        //iterate i through all valid indices in the array
        //[0, length)
        for (int i = 0; i < words.length; i++) {
            System.out.println("value at index " + i + " is " + words[i]);
        }

        //if you know the values to be assigned to the array,
        //can use this format:
        double [] moreNums = {34.9, 23.0, -1.0, 0, 122222223};
        System.out.println(moreNums[1]);

        //million die roll problem - using an array
        //-instead of 6 counter variables, use a single array
        //to store all the roll results

        //use an int array bc the count is always a whole number
        int [] results = new int[6];
        //indices will be [0, 5]

        //can assign 0 to all values, but they already default to 0
        for (int i = 0; i < 1000000; i++) {
            int roll = (int)(Math.random() * 6 + 1);

            //convert the [1,6] roll to a [0,5] index, increment that count's value
            results[roll-1] = results[roll-1] + 1;
        }

        //print the final count of each roll in a nicely formatted way
        for (int i = 0; i < results.length; i++) {
            //translate the index back to what roll that represents
            System.out.println("number of " + (i+1) + "s: " + results[i]);
        }

        //ask the user how many items they are adding to a shopping cart,
        //ask for and save each item,
        //after all items are added, print the cart contents

        Scanner s = new Scanner(System.in);
        System.out.println("how many items to add?");
        int quantity = s.nextInt();

        s.nextLine();

        //set the array length to the user input number
        String [] cart = new String[quantity];

        //quantity is also a valid loop condition bc it's the same number
        for (int i = 0; i < cart.length; i++) {
            System.out.println("what to add?");
            cart[i] = s.nextLine();
        }

        //print cart
        System.out.println("\nyour cart:");
        for (int i = 0; i < quantity; i++) {
            System.out.println("item " + i + ": " + cart[i]);
        }
    }
}
