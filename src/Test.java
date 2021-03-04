import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        double sv,time,distv1,distv2,distance,dogdist;
        boolean b = true;

        distance = 100;
        dogdist = 0;
        DecimalFormat dF = new DecimalFormat( "#.################" );
        for (int i=1; i<=25; i++){
            if (b) {sv=30; b=false;}
            else {sv=35; b=true;}
            System.out.print("Проход "+i);
            time = distance/sv;
            distv1 = time*15;
            distv2 = time*10;
            dogdist = dogdist + time*20;
            distance = distance - distv1 - distv2;
            System.out.println(" dog пробежала="+dF.format(dogdist)+"км   остаток:"+dF.format(distance)+"км"+"  это:"+dF.format(distance*1000)+"метров" );
        }



    }
}
