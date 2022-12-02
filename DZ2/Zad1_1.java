package DZ2;


// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json строки. 
//  Если значение null, то параметр не должен попадать в запрос. 
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …


public class Zad1_1 {
    public static StringBuilder result = new StringBuilder();
    public static String[] c1 = new String []{"name","country","city","age"};//массив создаем типа String
    public static String[] c2 = new String []{"Ivanov","Russia","Moscow","null"};

    public static void main(String[] args) {
        getQuery2(args);
        getQuery(args);
    }   


    public static void getQuery2(String[] args) {
        for (var el : c1) {
            System.out.print(el+" ");
        }
        System.out.println(" ");
        for (var el : c2) {
            System.out.print(el+" "); 
        }
        System.out.println(" ");
    }


    public static void getQuery(String[] args) {
        for (int i = 0; i < c1.length;i++){
            String oneResult = c1[i]; 
            for(int j = 0; j < c1.length; j++){
                if(i==j && c2[j] != "null"){
                    String twoResult = c2[j];
                    System.out.print(" '" + oneResult + "' : '" + twoResult  + "' and ");
                }
                
            }
             
        }
    } 
}
