//Create a class Car having properties manufacturer and price. Create three instances of the
// class and display the details of each car sorted with respect to the price.

import java.util.Scanner;
public class Car {

    String manu;
    int price,milage;
    int n;
    String[] a1;
    int[] a2,a3;
    Car() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        a1 = new String[n];
        a2 = new int[n];
        a3 = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner s1 = new Scanner(System.in);
            a1[i] = s1.nextLine();
            a2[i] = s1.nextInt();
            a3[i] = s1.nextInt();
        }
    }
    public void display()
    {
        for(int i=0;i<n;i++)
        {
            int p=-1;
            int t=-1;
            for(int j=0;j<n;j++)
            {
                if(a2[j]>p)
                {
                    p=a2[j];
                    t=j;
                }
            }
            System.out.println("manufacture " + a1[t]+ " price " + p +" milage " + a3[t]);
            a2[t]=0;
        }
    }

}
class Demo
{
    public static void main(String[] args) {
        Car obj=new Car();
        obj.display();
    }
}
