import java.util.Scanner;

interface Role {
}

class User implements Role {
    private String role;

    public void setRole(String role) {
        this.role = role;
    }

    public String Role() {
        while (true) {
            switch (role) {
                case "manager", "staff":
                    System.out.println(role);
                    break;
                default:
                    break;
            }
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
                System.out.println("Pin accepted");
                setRole("manager");
                break;
            }
            else {
                System.out.println("Incorrect pin, you still have " + (3 - counter) + " tries left.");
                counter++;
                if (counter >= 3 ) {
                    setRole("staff");
                    break;
                }
            }
        }
    }

}

class Staff extends User {

}