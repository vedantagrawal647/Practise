//Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON thatstores Boolean
// values to indicate whether the appliance is ON or OFF. Design a menu driven program in java that puts
// ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more
// than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts,
// Fan consumes 400 watts and light consumes 100 watt.
import java.util.Scanner;
class OnOff {
    String ac,hometh,fan,light;
    int a,b,c,d;
    OnOff()
    {
        a=1200;
        b=600;
        c=400;
        d=100;
        Scanner s=new Scanner(System.in);
        ac=s.nextLine();
        hometh=s.nextLine();
        fan=s.nextLine();
        light=s.nextLine();
    }
    public void show()
    {
        if(ac.equals("false"))
            a=0;
        if(hometh.equals("false"))
            b=0;
        if(fan.equals("false"))
            c=0;
        if(light.equals("false"))
            d=0;
        if((a+b+c+d)>2000)
        {
            System.out.println("System Overload");
        }
        else
            System.out.println("System Ok");
    }


}
class Jai{
    public static void main(String[] args) {
        OnOff obj=new OnOff();
        obj.show();
    }
}