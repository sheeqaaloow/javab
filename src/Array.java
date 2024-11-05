public class Array {
    public static void main(String[] args) {
//        String[] cars = {"masda", "bmw", "volvo", "fiat", "toyota"};
//        for (int i = 0; i < cars.length ; i++) {
//            System.out.println(cars [2]);
//        }
//        int sum = 0;
//        int[] numbers  = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//
//        };
//        //System.out.println(sum);
//        int length = numbers.length;
//        int resolve=sum/length;
//        System.out.println(resolve);
//          String[] names = {"madey", "C/fitaax", "mahamed", "naasir"};
//                  for (int i = 0; i < names.length; i++) {
//
//        }
//        System.out.println(names.length);


//int sum = 0;
//
//        for (int number : numbers) {
//sum += number;
//        }
//
////                System.out.println("Sum: " + sum);
//            int sum = 0;
//            int [] numbers = { 1, 2, 3, 4, 5,};
//            for (int num : numbers){
//                System.out.println(num);
//                sum += num;
//
//
//            }
////            System.out.println(sum);
//              int sum =0;
//        for (int i = 0; i < 5; i++) {
//            //System.out.println(i);
//            sum+=i;
//
//
//        }
//        System.out.println(sum);
        //int number = 10;
        for (int i = 0; i < 10; i++) {


            if (i % 2 == 0) {
                System.out.println("Number is Even " + i);
            } else {
                System.out.println("Number is odd " + i);
            }

    } 
         String name = "John";
//        String names = name.charAt(0).;
//
//        //String names = name.toUpperCase();
//        System.out.println(names);
//        String myStr = "Split a string by spaces, and also punctuation.";
//         String regex = "[,\\.\\s]";
////        String[] myArray = myStr.split(regex);
////        for (String s : myArray) {
////            System.out.println(s);
//        System.out.println(myStr.replaceAll(regex, "."));
////        }

//        String myStr = "       Hello World!        ";
//        String myStr1 = "    Hello World!      ";
//        System.out.println(myStr.trim());
//        System.out.println(myStr1);i


//        int [] mynum = { 5, 2, 8, 4, 9 };
//                Arrays.sort (mynum);
//        System.out.println(Arrays.toString( mynum));
        int[] numbers = {5, 9, 8, 4, 2};
        Arrays.sort (numbers);
        int lastNumber = numbers[numbers.length - 1];

        System.out.println(lastNumber);
    
    } }


