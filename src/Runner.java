import java.util.Scanner;

public class Runner {
    public void execute() {
        Probability a = new Probability();
        double z = 0 ;
        for (int  i = 0; i < 20 ; i++) {
             z = z+5;
            a.setMember(z);
            a.birthdaydate_assign();
            boolean ans = a.compare();
            System.out.println("member = " + z + " = " + ans);
            a.probability_percentage(z);
            System.out.println("******************************************************");
        }
    }
}
