import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Nive","Abi","Selva","Suganthi");
        List<String> longnames = new ArrayList<String>();
        longnames = names.stream().filter(str->str.length()>4&&str.length() <9).collect(Collectors.toList());
        System.out.println("Using stram: "+ longnames);
        names.stream().filter(str->str.length()>4&&str.length() <9).forEach(str-> System.out.println(str));

    }
}