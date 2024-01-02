public class Task3<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Task3(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {return t1;}
    public T2 getT2() {return t2;}

    @Override
    public String toString() {
        return "Pair{" + t1 + ", " + t2 + '}';
    }

    public static void main(String[] args) {
        Task3<Integer, String> task3 = new Task3<>(1, "first");
        System.out.println(task3.toString());
    }
}
