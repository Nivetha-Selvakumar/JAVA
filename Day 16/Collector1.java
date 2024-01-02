import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    int id;
    String name;
    int age;
    public Employee1(int id, String name,int age){
        this.id= id;
        this.name=name;
        this.age=age;
    }
}
public class Collector1 {
    public static void main(String[] args){
        List<Employee1> employeeList=new ArrayList<Employee1>();
        employeeList.add(new Employee1(1,"Sonu", 21));
        employeeList.add(new Employee1(2,"Monu", 25));
        employeeList.add(new Employee1(3,"Lily", 22));
        employeeList.add(new Employee1(4,"Sam", 23));
        List<Integer> employeeNameList = employeeList.stream().map(x->x.age).collect(Collectors.toList());
        System.out.println(employeeNameList);
    }
}