import java.util.Scanner;

public class atmSystem {
    static int pin = 1234;
    static double accountBalance = 10000;  // User account balance
    static double atmBalance = 50000;      // ATM machine balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your ATM PIN: ");
        
        // Check if the input is an integer
        if (sc.hasNextInt()) {
            int userPin = sc.nextInt();
            
            // Validate the PIN
            if (userPin == pin) {
                boolean continueBanking = true;
                while (continueBanking) {
                    System.out.println("\nATM Menu:");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Deposit");
                    System.out.println("3. Exit");
                    System.out.print("Please select an option: ");
                    
                    if (sc.hasNextInt()) {
                        int option = sc.nextInt();
                        
                        switch (option) {
                            case 1: // Withdrawal
                                System.out.print("Enter amount to withdraw: ");
                                
                                if (sc.hasNextInt()) {
                                    int withdrawAmount = sc.nextInt();
                                    
                                    // Validate withdrawal
                                    if (withdrawAmount > 0 && withdrawAmount <= accountBalance && withdrawAmount <= atmBalance) {
                                        accountBalance -= withdrawAmount;
                                        atmBalance -= withdrawAmount;
                                        System.out.println("Withdrawal successful.");
                                        System.out.println("Please collect your money.");
                                        System.out.println("Remaining account balance: ₹" + accountBalance);
                                        System.out.println("Remaining ATM balance: ₹" + atmBalance);
                                    } else {
                                        System.out.println("Insufficient balance in account or ATM.");
                                    }
                                } else {
                                    System.out.println("Invalid input. Please enter a valid withdrawal amount.");
                                    sc.next(); // Clear invalid input
                                }
                                break;
                            
                            case 2: // Deposit
                                System.out.print("Enter amount to deposit (Max ₹50000): ");
                                
                                if (sc.hasNextInt()) {
                                    int depositAmount = sc.nextInt();
                                    
                                    // Validate deposit
                                    if (depositAmount > 0 && depositAmount <= 50000) {
                                        accountBalance += depositAmount;
                                        atmBalance += depositAmount;
                                        System.out.println("Deposit successful.");
                                        System.out.println("Updated account balance: ₹" + accountBalance);
                                        System.out.println("Updated ATM balance: ₹" + atmBalance);
                                    } else {
                                        System.out.println("Invalid deposit amount. Must be between ₹1 and ₹50000.");
                                    }
                                } else {
                                    System.out.println("Invalid input. Please enter a valid deposit amount.");
                                    sc.next(); // Clear invalid input
                                }
                                break;
                            
                            case 3: // Exit
                                System.out.println("Thank you for using the ATM. Goodbye!");
                                continueBanking = false;
                                break;
                            
                            default:
                                System.out.println("Invalid option. Please select a valid menu option.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric option.");
                        sc.next(); // Clear invalid input
                    }
                }
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric PIN.");
        }
        
        // Close the scanner
        sc.close();
    }
}
