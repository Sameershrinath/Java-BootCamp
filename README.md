# ATM System

This is a simple console-based ATM system implemented in Java. The system allows users to securely withdraw and deposit money, as well as check their account balance. Both the user's account balance and the ATM machine's balance are validated and updated accordingly.

## Features

- **PIN Validation**: The system validates the user’s PIN before allowing any transactions.
- **Withdrawal**: Users can withdraw money if both their account balance and the ATM machine's balance are sufficient.
- **Deposit**: Users can deposit money into their account with a maximum limit of ₹50,000 per transaction. The deposit will also increase the ATM machine’s balance.
- **Balance Check**: Users can view both their account balance and the ATM machine's balance.
- **Error Handling**: The system handles invalid inputs, insufficient funds, and deposit limits.

## How to Run

1. Clone or download this repository.
2. Open the project in any Java IDE or compile and run it via the command line.
3. The program will prompt the user for their ATM PIN. The default PIN is `1234`.
4. After a successful login, the user can choose to:
   - Withdraw money
   - Deposit money
   - Check account and ATM balances
   - Exit the system

## Code Structure

- `atmSystem`: The main class containing the entire ATM functionality.
  - **PIN Validation**: Ensures only authorized access.
  - **Withdrawal Method**: Validates and processes the withdrawal.
  - **Deposit Method**: Validates and processes the deposit.
  
## Usage

Once the program starts, the user will be prompted to:
1. **Enter ATM PIN**: If the PIN is valid, the user can proceed to the main menu.
2. **Choose an Action**:
   - Withdraw money
   - Deposit money
   - Check balance
   - Exit

### Example Output

```
Please enter your ATM PIN: 
1234
Welcome to ATM
Choose an option: 
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
```

### Withdrawal Example:
```
Please enter the amount to withdraw: 
5000
Amount withdrawn: 5000
Please collect your money.
Withdrawal successful. Remaining user balance: 5000
Remaining ATM balance: 45000
```

### Deposit Example:
```
Please enter the amount to deposit (Maximum allowed is 50000): 
20000
Amount deposited: 20000
Deposit successful. New user balance: 70000
New ATM balance: 70000
```

## Constraints

- The ATM machine has a starting balance of ₹50,000.
- The user account has a starting balance of ₹10,000.
- The maximum deposit per transaction is ₹50,000.
- The system checks for valid input types (e.g., integers for PIN and transaction amounts).

## Improvements

- Add functionality for changing PINs.
- Implement multiple user accounts.
- Add more transaction types (e.g., transfer, mini-statement).

## License

This project is open-source and available for any non-commercial use.

```

### Instructions:
- Replace any placeholders or adjust balances as necessary if your program changes.
- Feel free to add more sections depending on the features you implement later (like future improvements).