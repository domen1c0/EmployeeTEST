import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Salary {
    public void Increase(ArrayList<Funcionarios> list, int id, double perc) {
        Locale.setDefault(Locale.US);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                double increase = list.get(i).getSalary() * perc + list.get(i).getSalary();
                double valor = increase;
                list.get(i).setSalary(valor);
                System.out.println("Sucess!");
                System.out.println("=========================================");
            }
        }
    }
}
