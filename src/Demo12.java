import java.util.Random;

void main(){
    //Local constant Declaration Statement
    final double PI =22 / 7; // this is compile time constant
    final double SOME_RANDOM_CONSTAN = Math.random();// this is run time constant

    System.out.println(PI);
    System.out.println(SOME_RANDOM_CONSTAN);

    final int   DAYS_OF_WEEK = 2+3+2;//compile time constant
    final int SOME_RANDOM_NUMBER_INT=new Random().nextInt();//run time constant

    byte MyByte1 = DAYS_OF_WEEK;
    //byte MyByte2 = SOME_RANDOM_CONSTAN;

    System.out.println(DAYS_OF_WEEK);
    //System.out.println(SOME_RANDOM_CONSTAN);

}