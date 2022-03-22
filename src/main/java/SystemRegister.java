import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class SystemRegister {
    public void Register (ArrayList<Funcionarios> list, int reg){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<reg; i++){
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();
            Funcionarios func = new Funcionarios(name, salary, id);
            list.add(func);
        }
    }
}
