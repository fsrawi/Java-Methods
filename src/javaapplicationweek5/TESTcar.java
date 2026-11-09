package javaapplicationweek5;


public class TESTcar {
    public static void main(String[] args) {
        car c1=new car();
        c1.Type="Mercedes";
        c1.Year=2010;
        c1.trunOn();
        c1.MoveBackword();
        c1.Stop();
        c1.trunOff();
        
        car c2=new car();
        c2.Type="Toyota";
        c2.Year=2015;
        c2.trunOn();
        c2.MoveBackword();
        c2.Stop();
        c2.trunOff();
        
        
        
    }


    
}
