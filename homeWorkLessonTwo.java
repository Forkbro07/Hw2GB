package HomeWork;

public class homeWorkLessonTwo {
    public static void main(String[] args){
        System.out.println(checksum(13,7));
        plusMinusNum( 1);
        System.out.println(minusPlusNum(20));
        stringNum("Denis", 5);
    }


    //пункт 1 - 2 целых числа с проверкой предела от 10 до 20 включительно
    public static boolean checksum(int a, int b) {
        int sum = a + b;
        boolean bool = (sum >= 10 && sum <= 20);
        return bool;
    }
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    public static void plusMinusNum(int c) {
        if (c < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
    private static boolean minusPlusNum(int d) {
       if (d < 0) {
           return true;
       }
       return false;
    }
//метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз
    private static void stringNum(String s, int e) {
        for(int d = 1;d <= e; d++) {//переменная "d" задаёт номер строки,сравнение останавливает вывод на числе в "e",d++ даёт + 1 к "d"
            System.out.println(d +"_"+ s);
        }
    }
}


