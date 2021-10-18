/*import java.util.Scanner;
class Student{
    String name;
    int perc,i;
    String[] a1=new String[4];
    int[] a2=new int[4];
    Student(String name,int perc)
    {
        this.name=name;
        this.perc=perc;
        a1[i]=name;
        a2[i]=perc;
        i=i+1;
    }
    public void show()
    {
        int p=-1,t=-1;
        for(int i=0;i<3;i++)
        {
            if(a2[i]>p)
            {
                p=a2[i];
                t=i;
            }

        }
        System.out.println(a1[t] + p);
    }
}
public class School{
    public static void main(String[] args) {
        int a;
        String b;
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            b = s.nextLine();
            a = s.nextInt();
            s.nextLine();
            Student obj = new Student(b, a);
        }
        Student obj1 = new Student("0", 0);
        obj1.show();
    }
}*/
import java.util.Scanner;
class Student{
    String name;
    int perc,i;
    String[] a1=new String[5];
    int[] a2=new int[5];
    Student(String name,int perc)
    {
        this.name=name;
        this.perc=perc;
        a1[i]=name;
        a2[i]=perc;
        i=i+1;
    }
    public void show()
    {
        System.out.println(a1[4] + " "+ a2[4]);
    }
}
public class School {
    public static void main(String[] args) {
        int a, c = -1, d = -1;
        String b;
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            b = s.nextLine();
            a = s.nextInt();
            s.nextLine();
            Student obj = new Student(b, a);
        }
        Student obj1 = new Student("0", 0);
        for (int j = 0; j < 3; j++) {
            if (obj1.a2[j] > c) {
                c = obj1.a2[j];
                d = j;
            }
        }
        obj1.a2[4]=c;
        obj1.a1[4]=obj1.a1[d];
        obj1.show();
    }
}