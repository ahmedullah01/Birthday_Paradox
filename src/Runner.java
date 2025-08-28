import java.util.Scanner;

public class Runner {
    public void execute() {
        Probability a = new Probability();
        int z = 0 ;
        for (int  i = 0; i < 20 ; i++) {
             z = z+5;
            int num = z;
            a.setMember(num);
            a.birthdaydate_assign();
            boolean ans = a.compare();
            System.out.println("member = " + z + " = " + ans);
        }
    }
}
