public class TwoDimensionalArrays {

    public static void main(String [] args) {

        //a 2d array is an array made up of subarrays
        int [][] nums = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12} };

        //to reference a value in a 2d array, you need
        //two indices: one for row (which subarray),
        // one for the position within the row (which col)

        //7
        System.out.println("value at row 1 col 2 is " + nums[1][2]);

        //9
        System.out.println("value at row 2 col 0 is " + nums[2][0]);

        //length of a 2d array is how many subarrays (how many rows)
        System.out.println("length (num of rows) is " + nums.length);

        //to get number of cols, get the length of one of the rows
        // (how many values are in the row)
        System.out.println("num of cols: " + nums[0].length);

        //for this class and AP, 2d arrays will always be rectangular
        //(all rows will have the same length)

        //tog et the total quantity of values, multiply nRows by nCols
        System.out.println("total quantity of values: " + nums.length* nums[0].length);

        //print everything in row 2: 9, 10, 11, 12
        System.out.print(nums[2][0] + " ");
        System.out.print(nums[2][1] + " ");
        System.out.print(nums[2][2] + " ");
        System.out.print(nums[2][3] + " ");
        System.out.println();

        //same thing using a loop:
        //iterate i through all the indices valid within the row (col indices)
        for (int i = 0; i < nums[2].length; i++) {
            System.out.print(nums[2][i] + " ");
        }
        System.out.println();
        System.out.println();

        //print the 2d array using nested loops

        //outer loop for rows
        for (int i = 0; i < nums.length; i++) {
            //inner loop for cols (each position within the row)
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //print the numbers in col 1: 2, 6, 10
        //col stays constant,
        // row iterates through each position within the col (number of rows)
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i][1]);
        }

        String [] names = {"ian", "george", "other chris"};
        String [] subjects = {"csp", "speed", "physics d", "chickens"};

        //3 rows, 4 cols
        int [][] grades = new int [3][4];

        //ian
        grades[0][0] = 50;
        grades[0][1] = 99;
        grades[0][2] = 90;
        grades[0][3] = 20;

        //george
        grades[1][0] = 90;
        grades[1][1] = 92;
        grades[1][2] = 97;
        grades[1][3] = 95;

        //other chris
        grades[2][0] = 3;
        grades[2][1] = 95;
        grades[2][2] = 60;
        grades[2][3] = 95;

        //use nested loops to determine each student's average grade in their classes
        //-row avgs
        for (int i = 0; i < grades.length; i++) {

            int avg = 0;
            for (int j = 0; j < grades[0].length; j++) {
                avg += grades[i][j];
            }

            avg = avg/subjects.length;
            System.out.println(names[i] + "'s avg grade: " + avg);
        }


        //calculate each class's average
        //-col avgs
        System.out.println();

        //iterate through cols in the outer loop
        for(int j = 0; j < grades[0].length; j++) {
            int avg = 0;
            for (int i = 0; i < grades.length; i++) {
                avg += grades[i][j];
            }
            avg = avg/names.length;
            System.out.println(subjects[j] + "'s avg grade: " + avg);
        }

    }
}
