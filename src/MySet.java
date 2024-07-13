import java.util.HashSet;

class MySet {
    private HashSet<Short> set;
    private static final int MAX_SIZE = 100;

    public MySet() {
        this.set = new HashSet<>();
    }

    public void addNumber (short number) throws MySetException {
        if (this.set.size() >= MAX_SIZE) {
            throw new MySetException("O conjunto já possui 100 elementos.");
        }
        if (this.set.contains(number)) {
            throw new MySetException("Este valor já existe.");
        }
        if (number < 0) {
            throw new MySetException("Valor negativo não permitido.");
        }
        this.set.add(number);
    }

    public void showNumbers () {
        System.out.println("Conjunto: " + this.set);
    }
}