import java.util.Optional;

public class Optional4 {
    public static void main(String[] args){
        String str= "";
        Optional<String> optional= Optional.ofNullable(str);
        if(optional.isPresent()){
            System.out.println("Value is "+optional.get());
        }
        else{
            String value= optional.orElse("Default");
            System.out.println("Value is not present"+ value);
        }
    }
}