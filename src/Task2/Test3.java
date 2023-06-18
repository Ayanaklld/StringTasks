package Task2;

public class Test3 {
    public static void main(String[] args) {

        //Из массива names вывести только те имена которые начинаются на символ `A`
        //Реализация через indexOf

        String names[] = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };

        for (String name:
             names) {
            if (name.indexOf("A") == 0){
                System.out.println(name);
            }
        }
    }
}
