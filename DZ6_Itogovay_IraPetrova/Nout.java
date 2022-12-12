package DZ6_Itogovay_IraPetrova;


public class Nout {


    String Name_; // ОЗУ
    String OZU_; // ОЗУ
    String SSD_; // Объем ЖД
    String operatingSystem_; // Операционная система
    String color_; // Цвет
    Integer price_;


    Nout(String Name, String OZU, String SSD, String operatingSystem,String color,Integer price){
        Name_ = Name;
        OZU_ = OZU;
        SSD_ = SSD;
        operatingSystem_ = operatingSystem;
        color_ = color;
        price_ = price;
    }


    void PrintInfo(){
        System.out.printf("Name: %s \tOZU: %s \tSSD: %s \toperatingSystem: %s \tcolor: %s \tprice_: %s\n\n ",Name_, OZU_, SSD_, operatingSystem_, color_,price_);
    }


    public Object getName() {
        return Name_;
    }

    
    public Object getOZU() {
        return OZU_;
    }


    public Object getSSD() {
        return SSD_;
    }


    public Object getOperatingSystem() {
        return operatingSystem_;
    }


    public Object getColor() {
        return color_;
    }


    public Object getPrice() {
        return price_;
    }
}
class NoutSort{
     
    private Integer price2;
    private String Name2;
     
    public NoutSort(String Name, Integer price){
        this.Name2=Name;
        this.price2 = price;
    }

    public Object getPrice2() {
        return price2;
    }

    public void PrintInfo() {
        {
            System.out.printf("Name: %s \tprice_: %s\n\n ",Name2,price2);
        }
    } 
}
