package Sem1;
import java.time.LocalTime;
import java.util.Scanner;


public class Seminar1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        /* 
        System.out.print( "Р’РІРµРґРёС‚Рµ РёРјСЏ: " );
        String name = iScanner.nextLine();
        System.out.print( "Р’РІРµРґРёС‚Рµ С„Р°РјРёР»РёСЋ: " );
        String fam = iScanner.nextLine();
        //System.out.println("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ!!!");
        //System.out.println("РџСЂРёРІРµС‚, "+ name + " " +fam);
        //System.out.println(LocalDateTime.now());
        //System.out.println(NowTime(name,fam));
        */
        int[] arr = new int[10];
        FillMas(arr);
        PrintMas(arr);
        System.out.println(FindMaxCount(arr));
        iScanner.close();
    }

    public static void FillMas(int[] array){
        for(int i=0;i<array.length;i++){
            //System.out.print("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ РјР°СЃСЃРёРІР°: ");
            //int num = iScanner.nextInt();
            array[i] = (int)(Math.random()*2);
        }
    }

    public static void PrintMas(int[] array){
        for(var el : array)
            System.out.print(el+" ");
        System.out.println();
    }

    public static int FindMaxCount(int[] array){
        int count = 1;
        int result = 1;
        for(int i=1; i<array.length;i++){
            if (array[i]==array[i-1] && array[i]==1) {
                count++;
                if (count > result) result = count;
            }
            else {
                count = 1;
            }
        }
        return result;
    }

    public static String NowTime(String name, String fam){
        LocalTime now_time = LocalTime.now();
        //System.out.println(now_time);
        
        if(now_time.isAfter(LocalTime.of(5, 00)) && now_time.isBefore(LocalTime.of(11, 59)))
            return "Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, "+ name + " " +fam;
    
        else if(now_time.isAfter(LocalTime.of(12, 00)) && now_time.isBefore(LocalTime.of(17, 59))){
            return "Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, "+ name + " " +fam;
        }
        else if(now_time.isAfter(LocalTime.of(18, 00)) && now_time.isBefore(LocalTime.of(22, 59))){
            return "Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, "+ name + " " +fam;
        }
        else
            return "Р”РѕР±СЂС‹Р№ РЅРѕС‡Рё, "+ name + " " +fam;
    }
    
}