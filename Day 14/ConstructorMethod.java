import javax.naming.Name;

public class ConstructorMethod {
    public static void main(String[] args){
        UserInterface userInterface=User::new;
        User user = userInterface.getUser("Nivetha");
        System.out.println("Name: "+user.Username);

        UserInterface userInterface1= s->new User(s);
        User user1 = userInterface.getUser("Selvakumar");
        System.out.println("Name: "+user1.Username);
    }

}
@FunctionalInterface
interface UserInterface{
    User getUser(String name);
}
class User{
    String Username;
    public User(String Username){
        this.Username=Username;
    }
}