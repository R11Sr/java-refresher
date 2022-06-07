
/**
 * Write a description of class Rational here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rational
{
    // instance variables - replace the example below with your own
    private int num,denum;

    /**
     * Constructor for objects of class Rational
     */
    public Rational()
    {
        // initialise instance variables
        this.num = 0;
        this.denum =1;
    }
    
    
    public Rational(int n, int d){
         // initialise instance variables
        this.num = n;
        this.denum =d;
    }
    
    public void negate(){
        setNum(Math.negateExact(getNum()));
        setDenum(Math.negateExact(getDenum()));
    }
    
    public void invert(){
        int temp = getNum();
        setNum(getDenum());
        setDenum(temp);
    }
    
    public String reduce(){
        int num = Math.abs(getNum());
        int denum = Math.abs(getDenum());
        int gcd = gcd(num, denum);
        String dSign = (getDenum() < 0) ? "-":"";
        String nSign = (getNum() < 0) ? "-":"";
        
        if(gcd == 0 || gcd ==1){
            return String.format("REDUCED: %d / %d",getNum(), getDenum());
        }
        return "REDUCED:" + nSign + num/gcd + " / " + dSign + denum/gcd ;
        //return String.format("REDUCED: %d / %d",num/gcd, denum/gcd);
        
    }
    
    // extended Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
    
    public String toDouble(){
        return String.format("%f / %f",Double.parseDouble(String.format("%d",getNum())),Double.parseDouble(String.format("%d",getDenum())));
        
    }
    
    public Rational add(Rational that){
        Rational total = new Rational();
        total.setNum(this.getNum() * that.getDenum() + that.getNum() * this.getDenum());
        total.setDenum(this.getDenum() * that.getDenum());
        System.out.println(total);
        total.reduce();
        return total;
    
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void setDenum(int num){
        this.denum= num;
    }
    
    public int getDenum(){
        return this.denum;
    }
    
    public int getNum(){
        return this.num;
    }    
    public String toString(){
        return String.format("%d/%d",this.num,this.denum);
    }
    
    public static void printer(int p){
        System.out.println(p);
    }
    
    public static void main(String[] args){
        Rational rationalNumbers = new Rational();
        Rational r1 = new Rational(9,17);
        rationalNumbers.setNum(12);
        rationalNumbers.setDenum(34);
        r1.add(rationalNumbers);
        
        //rationalNumbers.negate();
        //rationalNumbers.invert();
        System.out.println(r1);

        
    }
    

}

   
