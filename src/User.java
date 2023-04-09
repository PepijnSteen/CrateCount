import java.util.Scanner;

class User {
    protected boolean manager = false;

    Scanner scanner = new Scanner(System.in);

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

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

    Scanner scanner = new Scanner(System.in);

    public void loginPin() {
        while (true){
            System.out.println( "Please enter your pin");
            if (scanner.nextInt() == 9999) {
                System.out.println("Pin accepted! \nYour role is set as 'Manager'");
                manager = true;
                break;
            }
            else {
                System.out.println("Incorrect pin, you have " + (3 - counter) + " tries left.");
                counter++;
                if (counter >= 4 ) {
                    System.out.println("Your role is set as 'Staff' \n");
                    break;
                }
            }
        }
    }
}

class Staff extends User {
    public void roleStaff() {
        setManager(false);
    }
}