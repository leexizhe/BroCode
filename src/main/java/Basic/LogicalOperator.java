package Basic;

public class LogicalOperator {
    // logical operators = used to connect two or more expressions
    //
    //  && = (AND) both conditions must be true
    //  || = (OR) either condition must be true
    //  ! = (NOT) reverses boolean value of condition

    public static void main(String[] args) {
        int temp = 25;
        if (temp >= 20 && temp <= 30) { // && = (AND) both conditions must be true
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

        String response = "q";
        if (response.equals("q") || response.equals("Q")) { // || = (OR) either condition must be true
            System.out.println("It is the letter q");
        } else {
            System.out.println("It is not the letter q");
        }

        String responsed = "q";
        if (!responsed.equals("q") || responsed.equals("Q")) { // ! = (NOT) reverses boolean value of condition
            System.out.println("It is the letter q");
        } else {
            System.out.println("It is not the letter q");
        }
    }
}
