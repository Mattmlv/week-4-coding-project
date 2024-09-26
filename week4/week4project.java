package week4;

public class week4project {

	public static void main(String[] args) {

// 1.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

// a. 
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);

// b. 
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};

// i.
        System.out.println(ages2.length);

// ii.
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);

// iii.
        int[] dynamicAges = {5, 10, 25, 80};
        int dynamicResult = dynamicAges[dynamicAges.length - 1] - dynamicAges[0];
        System.out.println(dynamicResult);

// c.
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = sum / ages.length;
        System.out.println(average);

// 2.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

// a.
        double totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = totalLetters / names.length;
        System.out.println("Average number: " + averageLetters);

// b.
        StringBuilder allNames = new StringBuilder();
        for (String name : names) {
            allNames.append(name).append(" ");
        }
        System.out.println(allNames.toString().trim());

// 3.
        System.out.println("Last number of array: " + ages[ages.length - 1]);

// 4.
        System.out.println("First number of array: " + ages[0]);

// 5.
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

// 6.
        int totalLength = 0;
        for (int length : nameLengths) {
            totalLength += length;
        }
        System.out.println("Sum: " + totalLength);

// 7.
        String repeat = repeatWord("imconfused", 3);
        System.out.println(repeat);

// 8.
        String fullName = fullName("John", "Doe");
        System.out.println("Full name: " + fullName);

// 9.
        int[] numbers = {50, 60, 30};
        boolean isSumGreaterThan100 = sumGreaterThan100(numbers);
        System.out.println("Sum: " + isSumGreaterThan100);

// 10.
        double[] doublesArray = {10.5, 20.5, 30.5};
        double averageOfDoubles = calculateAverage(doublesArray);
        System.out.println("Average array: " + averageOfDoubles);

// 11.
        double[] array1 = {10.0, 15.0, 20.0};
        double[] array2 = {5.0, 10.0, 15.0};
        boolean isFirstArrayGreater = compareAverages(array1, array2);
        System.out.println("First array average greater: " + isFirstArrayGreater);

// 12.
        boolean willBuy = willBuyDrink(true, 15.0);
        System.out.println("Will buy drink: " + willBuy);

// 13.
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5: " + factorialOf5);
        

	}
	
	
// 7.
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

// 8.
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

// 9.
    public static boolean sumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

// 10.
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11.
    public static boolean compareAverages(double[] array1, double[] array2) {
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        return average1 > average2;
    }

    // 12.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13.
        public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
	
	
}
