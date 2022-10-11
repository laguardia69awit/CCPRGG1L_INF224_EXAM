import java.util.Scanner;

public class Exam {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        posneg();
        primecompos();
        haba();
        largest();
        vowel();
        partII();
        titik();
        condition();
        strand();
        emailAdd();
        atm();
    }
  
// Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

// ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
    static void posneg (){
        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
    int number = sc.nextInt();

    if (number > 0) 
        System.out.println("POSITIVE");

    else if (number == 0)
    System.out.println("ZERO");
    
    else 
    System.out.println("NEGATIVE");
      
}
  
// ==============================================================================
    
        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)
    static void primecompos() {
    System.out.println("2. PRIME or COMPOSITE number");
    System.out.print("Enter the last digit of your student number: ");
    int lastDigit = sc.nextInt();

    if  (lastDigit %  3 == 0){
        System.out.println("PRIME");
    }else if (lastDigit % 2 == 0) {
        System.out.println("COMPOSITE");
    }else 
        System.out.println("NEITHER");
    }
  
// ==============================================================================
    
    // 3. Create a method that will return the sum of the character length of your
    // firstname and your surname. (10 pts)
    static void haba() {
        System.out.println("3. Length of your name");
        System.out.print("Enter your firstname: ");
        String first = sc.next();
        int size = first.length();
        System.out.println("The number of character for firstname is: " + size);
        System.out.print("Enter your surname: ");
        String last = sc.next();
        int sizes = last.length();
        System.out.println("The number of character for surname is: " + sizes);

        int sum = size + sizes;
        System.out.println("the total is " + sum);
    }

// ==============================================================================

    // 4. Create a method that will take three whole numbers and print the largest number.
    static void largest() {
    System.out.println("4. Largest Number");
    System.out.print("Enter first number: ");
    int firstNumber = sc.nextInt();
    System.out.print("Enter second number: ");
    int secondNumber = sc.nextInt();
    System.out.print("Enter third number: ");
    int thirdNumber = sc.nextInt();
    
    if( firstNumber >= secondNumber && firstNumber >= thirdNumber)
    System.out.println(firstNumber+" is the largest Number");

  else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
    System.out.println(secondNumber+" is the largest Number");

  else
    System.out.println(thirdNumber+" is the largest Number");

} 

// ==============================================================================

    // 5. Create a method that will return true if your name starts with
    static void vowel() {
        System.out.println("5.  Check if your first name is vowel ");
        System.out.print("Enter the first character of your first name: ");
        char first = sc.next().charAt(0);

        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'
                || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U')
            System.out.println("VOWEL");
        else
            System.out.println("CONSONANT");
    }
// =========================================================================================================================

    // Part II
    // Print "valid" if the result is true.
    // Print "invalid" if the result is false.
    
    // 6. Create a condition to check if the entered student number is your student
    // number. (10 pts)
    static void partII() {
        System.out.println("6. Student ID validation");
        System.out.print("Enter your ten digit student number: ");
        int StudentNumber = sc.nextInt();

        if (StudentNumber == 2022104583)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

// ==============================================================================

    // 7. Create a condition to check if your firstname is in UPPERCASE and your
    // lastname is in lowercase. (10 pts)
    static void titik() {
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String Pangalan = sc.next();
        System.out.print("Enter your surname in lowercase: ");
        String Apelyido = sc.next();

        if (Pangalan == Pangalan.toUpperCase() && Apelyido == Apelyido.toLowerCase())
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

// ==============================================================================

    // 8. Create a nested condition that will ask the specialization of the student
    // is taking
    // depending if the student is a BSIT or BSCS student.

    // Condition 1
    // if the student is BSIT, ask again if the student is taking MWA or MAA.

    // Condition 224
    // if the student is BSCS, ask again if the student is taking ML or DF.
    static void condition() {
        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = sc.next();

        // If BSIT
        switch (course) {
            case "BSIT":
                System.out.print("Enter your specialization (MWA or MAA): ");
                String Condition1 = sc.next();
                switch (Condition1) {
                    case "MWA":
                        System.out.print("you are enrolled in BSIT-MWA ");
                        break;

                    case "MAA":
                        System.out.println("you are enrolled in BSIT-MAA ");
                        break;
                }
                break;
            // If BSCS
            case "BSCS":
                System.out.print("Enter your specialization (DF or ML): ");
                String Condition2 = sc.next();
                switch (Condition2) {
                    case "ML":
                        System.out.println("you are enrolled in BSCS-ML ");
                        break;

                    case "DF":
                        System.out.println("you are enrolled in BSCS-DF ");
                        break;
                }

        }
    }

// ==============================================================================

    // 9. Create a condition to check if the answer belongs to one of the possible
    // answers. (10 pts)

    // STEM
    // ICT
    // ABM
    // HUMSS
    // HOME ECONOMICS
    // ARTS AND DESIGN
    // TVL MARITIME
    static void strand() {

        System.out.println("9. Selection of STRANDS");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("ABM");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your strand: ");

        String strand = sc.next();
        switch (strand) {
            case "STEM":
                System.out.println("valid");
                break;

            case "ICT":
                System.out.println("valid");
                break;

            case "ABM":
                System.out.println("valid");
                break;

            case "HUMSS":
                System.out.println("valid");
                break;

            case "HOME ECONOMICS":
                System.out.println("valid");
                break;

            case "ARTS AND DESIGN":
                System.out.println("valid");
                break;

            case "TVL MARITIME":
                System.out.println("valid");
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }

// ==============================================================================

    // 10. Create a condition to check if your student email address contains your
    // surname. (10 pts)
    static void emailAdd() {
        System.out.println("10. Validate student email address ");

        System.out.println("Enter your Email Address:");
        String mensahe = sc.next();

        if (mensahe.contains("laguardialh@students.national-u.edu.ph")) {
            System.out.println("valid");

        } else {
            System.out.println("invalid");
        }

    }


    // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)
 static void atm(){
        System.out.println("11. Think like an ATM");
        System.out.print("Enter the total amount of money in your bank account: ");
        int amount = sc.nextInt();
        System.out.println("total balance is " + amount);
        amount = 0; 
        // Close scanner
        sc.close();
    }
}
