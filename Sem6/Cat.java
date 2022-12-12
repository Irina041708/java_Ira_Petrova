package Sem6;


// 1. Продумайте структуру класса Кот. 
// Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.



public class Cat {
    String name;
    String p;
    Integer age;
    String color;
    String type;

        
    Cat(){ 
        name = "Vasya";
        p = "m";
        age = "black";
        
        type = "brit";

    }

    Cat(Integer k){ //конструктор без параметров
        name = "Vasya";
        p = "m";
        age = "black";

        type = "brit";
    }

    Cat(String n, String pp, Integer a, String c, String t){ //конструктор без параметров
        name = n;
        p = pp;
        age = a;
        color = c;
        type = t;
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()) return false;
        // var g = (Cat) obj;
        Cat g = (Cat) obj;  //!!!!!!!!!!!!
        if (!this.name.equals(g.name)) return false;
        
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        int result = 1;
        result += (this.age + this.name.hashCode() + this.color.hashCode() + this.p.hashCode() + this.type.hashCode());
        System.out.println(result);
        return result;
    }

    void PrintInfo(){
        System.out.println(name +" "+ age+" "+ p +" "+ type +" "+ color);
    }
    
}
