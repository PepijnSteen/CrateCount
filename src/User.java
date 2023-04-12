import java.util.Scanner;

class User {
    Scanner scanner = new Scanner(System.in);

    public void roleCall() {
        Staff staff = new Staff();
        Manager manager = new Manager();

        System.out.println("What is your role? \nEnter either 'manager' or 'staff'");
        String roleCall = scanner.nextLine();
        if (roleCall.toLowerCase().equals("manager")) {
            manager.loginPin();
        }
        else {
            staff.roleStaff();
        }
    }
}

class Manager extends User {
    private int counter = 0;

    Staff staff = new Staff();
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    public void loginPin() {
        while (true){
            System.out.println( "Please enter your pin");
            if (scanner.nextInt() == 9999) {
                System.out.println("Pin accepted! \nYour role is set as manager");
                menu.setAuthorisation(true);
                menu.introductionText();
            }
            else {
                System.out.println("Incorrect pin, you have " + (3 - counter) + " tries left.");
                counter++;
                if (counter >= 4 ) {
                    staff.roleStaff();
                }
            }
        }
    }
}

class Staff extends User {
    Menu menu = new Menu();
    public void roleStaff() {
        System.out.println("Your role has been set as staff");
        menu.setAuthorisation(false);
        menu.introductionText();
    }
}