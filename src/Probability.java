public class Probability {
double member;
Random_num_generator r;
    double[] dates = new double[10];
    Probability(){
        r = new Random_num_generator();
    }
public void setMember(double member){
    this.member = member;
    dates = new double[(int) member];
}

public void birthdaydate_assign(){
        //for assigning random birthday date to each member
    for(int i  = 0 ; i < dates.length; i++){
dates[i] = r.generator();

    }
    }
    public boolean compare(){
            boolean checker = false;
for(int i = 0 ; i < dates.length; i++){
    for(int j = i+1 ; j<dates.length ; j++){
        if(dates[i] == dates[j]){
            checker =true;
            break;
        }
    }
    if(checker == true){
        break;
    }
}
return checker;
    }


    public void probability_percentage(double member){
        double days = 365.0;
        double PnoMatch = 1.0;
        for(int  i = 0 ; i < member; i++){
            PnoMatch*=(days - i)/days;
        }
        PnoMatch *= 100;
        double PMatch =(100 - PnoMatch);


        System.out.printf("Probability of finding atleast one match is : %2.2f\n", PMatch , "%");
        System.out.printf("Probability of finding  no match is : %2.2f\n " , PnoMatch , "%");
        System.out.println("number of members : " + member);
    }
}
