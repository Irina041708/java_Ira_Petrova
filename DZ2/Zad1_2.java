package DZ2;
import java.util.LinkedHashMap;
import java.util.Map;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json строки. 
//  Если значение null, то параметр не должен попадать в запрос. 
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …


public class Zad1_2 {
     
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Russia");
        map.put("city","Moscow");
        map.put("age",null);
        
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        // if (params == null || params.isEmpty())
        //     return result.toString();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)//get - возвращает элемент из списка по указанной позиции
                continue;

            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }

        // if (result.length() > 5)
        //     result.delete(result.length() - 5, result.length());

        return result.toString();
    }

    
}
