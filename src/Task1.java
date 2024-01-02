public class Task1 {

    static <T1 extends Number, T2 extends Number> void sum(T1 t1, T2 t2) {
        System.out.println("Сумма чисел равна: " + (t1.doubleValue() + t2.doubleValue()));
    }

    static <T1 extends Number, T2 extends Number> void sub(T1 t1, T2 t2) {
        System.out.println("Разность чисел равна: " + (t1.doubleValue() - t2.doubleValue()));
    }

    static <T1 extends Number, T2 extends Number> void mul(T1 t1, T2 t2) {
        System.out.println("Произведение чисел равно: " + (t1.doubleValue() * t2.doubleValue()));
    }

    static <T1 extends Number, T2 extends Number> void div(T1 t1, T2 t2) {
        System.out.println("Деление чисел равно: " + (t1.doubleValue() / t2.doubleValue()));
    }

    public static void main(String[] args) {
        sum(1.2, 5);
        sub(1.2, 5);
        mul(1.2, 5);
        div(1.2, 5);
    }
}
