import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int age;
    public Employee(int id, String name,int age){
        this.id= id;
        this.name=name;
        this.age=age;
    }
}
public class Collector2 {
    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(1,"Sonu", 21));
        employeeList.add(new Employee(2,"Monu", 25));
        employeeList.add(new Employee(3,"Lily", 22));
        employeeList.add(new Employee(4,"Sam", 23));
        Set<Integer> employeeNameSet = employeeList.stream().map(x->x.age).collect(Collectors.toSet());
        System.out.println(employeeNameSet);
    }
}