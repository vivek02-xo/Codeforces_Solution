import java.util.*;
public class SkibidusAndAmogiu2065A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while(t-- > 0){
            String n = sc.next();
            int len = n.length();
            System.out.println(n.substring(0,len-2) + "i");
        }
        
    }
    
}
