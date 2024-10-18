public class ArrayPractice {

    public static void main(String [] args) {
        //create an array that holds 5 animals
        //-assign values
        String [] zoo = new String [5];
        zoo[0] = "blah";
        zoo[1] = "panda";
        zoo[2] = "whale";
        zoo[3] = "narwhal";
        zoo[4] = "the void";

        //5 is an invalid index - out of bounds
        //zoo[5] = "chicken";

        System.out.println(zoo);

        // use a loop to iterate through each index
        //to access each value
        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i]);
        }

        System.out.println();

        //for-each loop aka enhanced for loop
        //-the variable type matches the array type
        //-the variable is temporarily set to each value
        //in the array
        //-don't use indexing
        for(String a: zoo) {
            System.out.println(a);
        }

        //can't use for-each loops to change
        //values inside arrays
        for(String a: zoo) {
            a = "cat";
        }

        System.out.println();

        for(String a: zoo) {
            System.out.println(a);
        }

        //can use regular for loops to change
        //array values
        for(int i = 0; i < zoo.length; i++) {
            zoo[i] = "cat";
        }

        for(String a: zoo) {
            System.out.println(a);
        }

        int [] nums = {4, 3, 2, 1, 3, 8, 3, 0, 3};

        //print each value in nums

        //regular for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //for each loop - be careful not to use
        //the variable as an index
//        for(int n: nums) {
//            System.out.print(nums[n] + " ");
//        }
//        System.out.println();

        //use a loop to count and output how many
        //3s are in the array

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3) {
                count++;
            }
        }
        System.out.println(count + " 3s ");

        count = 0;
        for (int n: nums) {
            if(n == 3) {
                count++;
            }
        }
        System.out.println(count + " 3s ");

        int a = 7;
        int b = 2;

        //swap
        int temp = a;
        a = b;
        b = temp;

        //swap the first and last elements in array
        temp = nums[0];
        nums[0] = nums[ nums.length-1 ];
        nums[ nums.length-1 ] = temp;

        for (int n: nums)
            System.out.print(n + " ");
        System.out.println();

        //selection sort: move from left to right
        //to build the sorted section on the left
        //-find the smallest value in the unsorted section
        //and swap it into the next sorted position

        //use index i as the current position of the sorted
        //section to build
        for (int i = 0; i < nums.length; i++) {


            //track the index of the next smallest value in the
            //unsorted section
            int nextSmallestIndex = i;

            //find the index of the next smallest value
            for (int j = i+1; j < nums.length; j++) {

                //to change whether the sort is working in
                //increasing or decreasing order, just flip the
                //comparison
                if(nums[j] < nums[nextSmallestIndex]) {
                    nextSmallestIndex = j;
                }
            }

            //swap the values at position i and position nextSmallestI
            int t = nums[i];
            nums[i] = nums[nextSmallestIndex];
            nums[nextSmallestIndex] = t;


            //output the progress of each swap
            for(int n: nums)
                System.out.print(n + " ");
            System.out.println();
        }






    }
}
