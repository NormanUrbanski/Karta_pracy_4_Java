
public class Prostokat extends Figura {
    
     private double a;
      private double b;
    public Prostokat(double a,double b)
    {
        this.a = a;
        this.b=b;
        
    }
    @Override
    public double pole() {
       return a*b;
    }

    @Override
    public double obwod() {
        return a*2+ b*2;
    }
}
