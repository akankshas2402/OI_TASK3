//shendage akanksha vijaykumar
//java programming


Import java.util.Scanner;

Public class Atm_machine {
    Int trans = 0;
    String transHist;

    Public static void main(String args[]) throws Exception {
        Atm_machine a = new Atm_machine();
        Scanner s = new Scanner(System.in);
        String n, Name = “akanksha shendage”;
        Int f, withdraw = 0, Deposite, Transfer;
        Int choice, balance = 10000;
        Int C;
        System.out.println(“======Welcome to ATM MACHINE======”);
        System.out.println(“Enter your name :- “);
        N = s.nextLine();
        System.out.println(“Enter  password :- “);
        F = s.nextInt();

        If (f == 9988 && Name.equals(“akanksha shendage”)) {
            Do {
                System.out.println(“Press 1.Transactions history”);
                System.out.println(“Press 2.Withdraw”);
                System.out.println(“Press 3.Deposit “);
                System.out.println(“Press 4.Transfer”);
                System.out.println(“Press 5.Exit”);

                System.out.println(“Choose the Transaction”);

                Choice = s.nextInt();
                Switch (choice) {
                    Case 1:
                        System.out.println(“===Transition history ===”);
                        a.T();
                        break;
                    case 2:
                        System.out.println(“===Withdraw money===”);
                        System.out.println(“Enter money to be Withdrawn : “);
                        Withdraw = s.nextInt();
                        If (balance >= withdraw) {
                            Balance = balance – withdraw;
                            System.out.println(“Please collect your money..”);
                            System.out.println(“Balance is : “ + balance);
                            String str = (“Rs “ + withdraw + “ withdrawal”);

                        } else {
                            System.out.println(“Balance is not Insufficient”);
                        }
                        Break;
                    Case 3:
                        System.out.println(“===Deposit money===”);
                        System.out.println(“Enter money to be deposited : “);
                        Deposite = s.nextInt();
                        Balance = balance + Deposite;
                        System.out.println(“Balance is : “ + balance);
                        System.out.println(“Your money has been Deposited Successfully…”);
                        String str = (“Rs “ + Deposite + “ Deposite.”);

                        Break;
                    Case 4:
                        System.out.println(“===Transfer money===”);
                        Int id;
                        System.out.println(“Enter receiver Account number :”);
                        Id = s.nextInt();
                        System.out.println(“Enter Transfer money “);
                        Transfer = s.nextInt();
                        If (Transfer <= balance) {
                            Balance = balance – Transfer;

                            System.out.println(“Rs “ + Transfer + “ Transfer to  “ + id);
                            String st = (“Rs “ + Transfer + “ Transfer to  “ + id);

                            System.out.println(“Your money has been Transfer Successfully…”);
                        } else {
                            System.out.println(“Enter Correct Amount.”);
                        }
                        Break;
                    Case 5:
                        System.out.println(“===Thank You For Using ATM MACHINE===”);
                        Break;
                    Default:
                        System.out.println(“please Choose correct number”);
                }
                System.out.println(“Do you want to continue for yes press 1/for no press 0 .”);
                C = s.nextInt();
            } while (C == 1);
        } else {
            System.out.println(“ Please Enter correct Password”);
        }
    }

    Public void T() {
        If (trans == 0) {
            System.out.println(“No Transition”);
        } else {
            System.out.println(“\nDeposite”);
        }

    }

}
