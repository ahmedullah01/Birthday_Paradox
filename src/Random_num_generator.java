    public class Random_num_generator {
        //Linear Congruential Generator (LCG) WHICH FOLLOWING THE MATHS CYCLE
        int current_X  =1;
        int multiplier = 7;
        int increment = 11;
    int  m = 365;

    public int generator(){
    int next_x = (multiplier*current_X + increment)%m;
        current_X = next_x;
    return  next_x;
    }

    }
