import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct1 {
    public static void main(String[] args){
        List<String> vehicleList= Arrays.asList("bus","car","bicycle","car","bus","bike");
        List<String> distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicle);
        vehicleList.stream().distinct().forEach(n->System.out.println(n));

        //count()
        long count= vehicleList.stream().distinct().count();
        System.out.println(count);

        //liimit()

        List<String> lmt= vehicleList.stream().limit(5).collect(Collectors.toList());
        System.out.println(lmt);

    }
}