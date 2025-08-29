public class Probability {
int member;
Random_num_generator r;
    int[] dates = new int[10];
    Probability(){
        r = new Random_num_generator();
    }
public void setMember(int member){
    this.member = member;
    dates = new int[member];
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
}
