import java.util.*;
public class projects{
    public static void towerofHanoi(int n, String source, String helper, String Destination ){
    if(n==1){
        System.out.println("transfer disk "+n+" from "+source+" to "+Destination);
        return;
    }

    towerofHanoi(n-1, source, Destination, helper);
    System.out.println("transfer disk "+n+" from "+source+" to "+Destination);

    towerofHanoi(n-1, helper, source, Destination);
  }
    public static void main(String args[]){
       int n=5;
       towerofHanoi(n, "A", "B", "C");

    }


}    