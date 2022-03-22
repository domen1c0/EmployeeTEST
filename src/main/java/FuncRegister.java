import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;


public class FuncRegister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<Funcionarios> funcArray = new ArrayList<>();
        boolean run = true;

        while (run){
            System.out.println("[1] Register an employee" );
            System.out.println("[2] Salary increases");
            System.out.println("[3] Exit");
            System.out.print("---->");
            String n = scan.nextLine();

            switch (n){

                case "1": {
                    Locale.setDefault(Locale.US);
                    System.out.println("=================REGISTER=================");
                    System.out.print("How many employees will be registered? ");
                    int reg = scan.nextInt();
                    scan.nextLine();
                    SystemRegister register = new SystemRegister();
                    register.Register(funcArray,reg);
                    System.out.println("Sucess!");
                    System.out.println("=========================================");
                    break;
                }
                case "2": {
                    System.out.println("==============SALARY INCREASE=============");
                    for(int i=0; i<funcArray.size(); i++){
                        Funcionarios temp = funcArray.get(i);
                        System.out.println("ID: " + temp.getId() + "|" + "Name: " + temp.getName() +"|" + "Salary: " + temp.getSalary() + "|" );
                    }
                    //
                    System.out.println();
                    System.out.print("Enter the employee id that will have salary increase: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter the percentage: ");
                    double perc = scan.nextDouble();
                    scan.nextLine();
                    //
                    Salary salary = new Salary();
                    salary.Increase(funcArray, id, perc);
                    break;
                }
                case "3": {
                    run = false;
                    break;
                }
            }
        }
    }
}
