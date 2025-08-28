import java.util.Scanner;
class Transactions{
    static Scanner sc = new Scanner(System.in);
    static int  add(int balance){
        System.out.println("enter amount for deposit amount");
        int value = sc.nextInt();
        balance = balance+value;
        return balance;
    }
    static int  sub(int balance){
        System.out.println("enter amount for withdrawal amount");
        int value = sc.nextInt();
        balance = balance-value;
        return balance;
    }
    static int  asking(int balance){
        System.out.println("enter \'1\' for deposit \n enter \'0\' for withdrawal");
        int check =sc.nextInt();
        if(check == 1){
            balance= add(balance);
        }
        else if(check == 0){
            balance= sub(balance);
        }
        else{
            return 0;
        }
        return  balance;
    }
    public static void main(String[] args) {
        System.out.println("enter your current balance");
        int balance = sc.nextInt();
        System.out.println("you want to update your account if :\n enter \'1\' for yes\n enter \'0\' for no");
        int starting = sc.nextInt();
        while(starting > 0){
            balance = asking(balance);
            System.out.println("you want to update your account more if :\n enter \'1\' for yes\n enter \'0\' for no");
            starting = sc.nextInt();
        }
        if(balance<0){
            System.out.println("negative balance");
        }
        else{
            System.out.println("your total balance is "+ balance);
        }
    
        
    }
}