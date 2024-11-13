public class TestPrep {

    public static void main(String [] args) {
        // an array that's 1d that holds ints called nums
        //-more dimensions would include more square brackets
        int [] nums;
        nums = new int [ (int)(Math.random() * 5 + 4) ];

        //set first and last values in nums to 4
        nums[0] = 4;
        nums[ nums.length-1 ] = 4;

        //set all other values to 2
        for (int i = 1; i < nums.length-1; i++) {
            nums[i] = 2;
        }

        //print the array
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //for-each
        //data type patches the array type
        //the variable iterates through all VALUES, not
        //indices in the array
        for(int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //print the values in nums with even-numbered indices
        for (int i = 0; i < nums.length; i+=2) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //this can't be done with a for-each loop bc
        //for-each loops don't iterate through indices
        //-they go through all VALUES in sequence

        //for-each loops cannot be used to assign values
        //into arrays
        for (int num: nums){
            num = 0;
        }

        for(int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //selection sort - swap the next smallest value
        //on the unsorted right side with the current
        //left side position

        //shuffling an array - need at least one random index to
        //swap values - do this multiple times

        //to swap in an array, need a temp variable


        //4 rows, 7 cols
        //an array of 4 subarrays
        int [][] nums2d = new int[4][7];

        //length is number of rows/subarrays
        System.out.println(nums2d.length);

        //to get the number of cols, use the length
        //of any valid row
        System.out.println(nums2d[0].length);

        //set the corner values to 3
        nums2d[0][0] = 3; //TL
        nums2d[0][6] = 3; //TR
        nums2d[3][0] = 3; //BL
        nums2d[nums2d.length - 1][nums2d[0].length-1] = 3; //BR

        //print 2d array as a grid
        //when printing, use rows as the outer loop
        for (int i = 0; i < nums2d.length; i++) {
            //columns as inner loop
            for (int j = 0; j < nums2d[0].length; j++) {
                System.out.print(nums2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //outer loop iterates through the subarrays (rows)
        // of the 2d array
        for(int [] row: nums2d) {
            //inner loop iterates through each row as if it's a 1d array
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        //can mix regular for loops and for-each loops
        for (int i = 0; i < nums2d.length; i++) {
            //nums2d[i] is the current row/subarray controlled
            //by i
            for (int num: nums2d[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int [] row: nums2d) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //set each column's values to a different random number

        // 5 7 4 2
        // 5 7 4 2
        // 5 7 4 2

        //go through cols on outside to assign each one its
        //own random number
        for (int col = 0; col < nums2d[0].length; col++) {

            //the same value is used throughout the column
            int random = (int)(Math.random() * 5 + 4);

            for (int row = 0; row < nums2d.length; row++) {
                nums2d[row][col] = random;
            }
        }

        for (int [] row: nums2d) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //one index will produce the part of the string
        //starting at the indicated position until the end of the
        //string
        System.out.println("apple".substring(3));

        //with two indices, the produced string starts at the
        //beginning but is exclusive of the ending index
        System.out.println("apple".substring(0, 3));
    }
}

