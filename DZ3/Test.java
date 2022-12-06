package DZ3;

public class Test {
    public int[] sortMerge(int[] arr) {
        // отработаем исключение, если массив нулевой длинны
        if (arr == null){
            System.out.println("Massiv pust");
            return null;
        }
        // если массив меньше двух, значит он уже отсортирован
        if (arr.length < 2){
            return arr;
        }
        //выделим память под массивы, какие они будут ,сделаем позже
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - (arr.length/2)];
        // копируем массив из arr с позиции 0 в массив left с позиции 0 до элемента arr.length/2          
        //копирует с учетом таких границ  (]
        // ctrl+д   - выделяет строчку в коде!!!
        System.arraycopy(arr, 0, left, 0, arr.length/2);//таким методом уже заполнили массив  left
        System.arraycopy(arr, arr.length/2, right, 0, arr.length-(arr.length/2));//таким методом уже заполнили массив  right
        
        //вызываем рекурсию самого метода на себя делим на 2 до размера <2
        //работает метод для небольших чисел, иначе будет заполнен стек
        left = sortMerge(left);
        right = sortMerge(right);

        //выплняем операцию слияния отсортированных массивов с помощью метода merge в порядке возрастания,
        // который опишем ниже и возвращаем его как результат метода sortMerge
        return merge(left,right); 
    }


    private int[] merge(int[] a, int[] b){
        //создаем место память для результирующего массива
        int[] res = new int[a.length + b.length];
        int n = a.length;
        int m = b.length;
        //i  указатель по a
        //j указатель по b
        //k указатель по res 
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if (a[i] <= b[j]) {//здесь одинаковой длины
                res[k] = a[i];
                i++;
            }
            else{
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < n){//дописываем оставшуюся длину
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < m){//дописываем оставшуюся длину
            res[k] = b[j];
            j++;
            k++;
        }
        return res;  
    }
    
}
