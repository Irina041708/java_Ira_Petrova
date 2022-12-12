package DZ6_Itogovay_IraPetrova;

public class Nout {
    // Создаем поля класса
    String Name_; // ОЗУ
    String OZU_; // ОЗУ
    String SSD_; // Объем ЖД
    String operatingSystem_; // Операционная система
    String color_; // Цвет
    Integer price_;
    // Создаем конструктор, так как он ничего не возвращает, в отличии от методов
    Nout(String Name, String OZU, String SSD, String operatingSystem,String color,Integer price){
        Name_ = Name;
        OZU_ = OZU;
        SSD_ = SSD;
        operatingSystem_ = operatingSystem;
        color_ = color;
        price_ = price;
    }

    void PrintInfo(){
        System.out.printf("Name: %s \tOZU: %s \tSSD: %s \toperatingSystem: %s \tcolor: %s \tprice_: %s\n",Name_, OZU_, SSD_, operatingSystem_, color_,price_);
    }
    void PrintInfo2(){
        System.out.printf("Name: %s \tprice_: %s\n ",Name_,price_);
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

    public Integer getPrice2() {
        return price_;
    }

    public String getName2() {
        return Name_;
    }
}
