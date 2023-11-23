public class Airpurifier {
    //These are instance variables and methods
    String name;
    String Snum;
    boolean Power;
    int FanSpeed ;

    private  Airpurifier(String name,String Snum){
        this.name = name ;
        this.Snum = Snum ;
        Power = false;
        FanSpeed = 0;
        Airpurifier.UpdateNewAirPurifier(name);
    }

    private Airpurifier() {
        this("ehe", "696969");
    }
    private Airpurifier(String name){
        this(name,"Unknow");
    }


    private void Turnon(){
        Power = true ;
        FanSpeed = 1;
        System.out.println(name+" is on");
    }
    private void Turnoff(){
        Power = false ;
        FanSpeed = 0;
        System.out.println(name+" is off");
    }
    void setfanspeed(int speed){
        if(Power && speed >= 0 && speed <=5){
            FanSpeed = speed;
            System.out.println("fan speed set to "+speed);
        }else if(speed > 5){
            System.out.println("too fast tum mai dai");
        }else{
            System.out.println("invalid");
        }
    }

    int getSpeed(){
        return FanSpeed;
    }

    //These are class variables and methods
    private static int total;
    static String[] Allmodel = new String[100];
    private static void Showall(){
        for (int i = 0; i < total; i++) {
            System.out.println((i+1) + "). " + Allmodel[i]);
        }
    }
    private static void UpdateNewAirPurifier(String name){
        Allmodel[total] = name;
        total++;
    }

    public static void main(String[] args) {
        Airpurifier air1 = new Airpurifier();
        Airpurifier air2 = new Airpurifier("Steven") ;
        Airpurifier air3 = new Airpurifier("asdwad","19854195");

        System.out.println("1st Airpurifier = " + air1.name);
        System.out.println("SerialNumber = " + air1.Snum);
        System.out.println("Power Status = " + air1.Power);
        air1.Turnon();
        air1.setfanspeed(5);
        System.out.println("Fan speed = " + air1.getSpeed());
        air1.Turnoff();

        System.out.println("--------------------------------------");

        System.out.println("2nd Airpurifier = " + air2.name);
        System.out.println("SerialNumber = " + air2.Snum);
        air2.Turnon();
        System.out.println("Power Status = " + air2.Power);
        air2.setfanspeed(2);
        System.out.println("Fan speed = " + air2.getSpeed());
        air2.Turnoff();

        System.out.println("--------------------------------------");

        System.out.println("3rd Airpurifier = " + air3.name);
        System.out.println("SerialNumber = " + air3.Snum);
        air3.Turnon();
        air3.setfanspeed(17);
        System.out.println("Fan speed = " + air3.getSpeed());
        air3.Turnoff();
        System.out.println("Power Status = " + air3.Power);

        System.out.println("--------------------------------------");

        System.out.println("total Airpurifier = "+total);
        Showall();
    }
}