public class Main {
    public static void main(String args[]){
        /******
         * For the following expressions, write out the SOP code to show the step by step process the compiler
         * follows to evaluate each expression. The output should be the same for every step.
         *
         * Example:
         *
         * System.out.println(2 * 5 + 3 + 0.37);
         * System.out.println(10 + 3 + 0.37);
         * System.out.println(13 + 0.37);
         * System.out.println(13.37);
         *
         ********** Assignment Criteria********************
         *
         * 1. Only complete one computation per line of code
         * 2. The output for every line is always equal to the same number
         *
         * In the example above the output should be:
         *
         * 13.37
         * 13.37
         * 13.37
         * 13.37
         *
         * *****/

        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        System.out.println(10 % 4 + 5 + 8 / 2);

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        System.out.println(5 * 4);

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println(Math.pow(5 , 2) - 5.8);

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(0 - Math.sqrt(16) + 1);

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((Math.pow(2 , 3) + 2) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
    }
}
