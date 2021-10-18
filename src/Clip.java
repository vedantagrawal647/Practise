/*Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
 */

public class Clip {

    public static int powerInt(int num1,int num2)
    {
        return (int)Math.pow(num1,num2);
    }

    public static double powerDouble(double num1,int num2)
    {
        return Math.pow(num1,num2);
    }

}
class Zim{
    public static void main(String[] args) {
        Clip obj=new Clip();
        int c=obj.powerInt(2,3);
        double d=obj.powerDouble(2,3);
        System.out.println(c);
        System.out.println(d);
    }
}
