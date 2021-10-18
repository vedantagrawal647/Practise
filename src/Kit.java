import java.util.Scanner;
class CarNew {
    String manu;
    int price;
    int i=0;
    String[] a1=new String[3];
    int[] a2=new int[3];
    CarNew(String manu,int price)
    {
        this.manu=manu;
        this.price=price;
        a1[i]=manu;
        a2[i]=price;
        i=i+1;
    }
    CarNew()
    {
        super();
    }
    public void display()
    {

        for(int i=0;i<3;i++)
        {
            int p=-1;
            int t=-1;
            for(int j=0;j<3;j++)
            {
                if(a2[j]>p)
                {
                    p=a2[j];
                    t=j;
                }
            }
            System.out.println("manufacture " + a1[t]+ " price " + p);
            a2[t]=0;
        }
    }
}
public class Kit{
    public static void main(String[] args) {
        String c;
        int d;
        for(int i=0;i<3;i++)
        {
            Scanner s=new Scanner(System.in);
            c=s.nextLine();
            d=s.nextInt();
            CarNew obj=new CarNew(c,d);
        }
        CarNew obj1=new CarNew();
        obj1.display();

    }
}

