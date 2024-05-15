import java.math.BigDecimal;

public class Multiplier {
    private int x;
    private int y;
    private double a;
    private double b;
    private BigDecimal c;
    private BigDecimal d;

    //A
    public int multiply(int x, int y) {
    return x * y;
    }


    //B
    public int multiply(int x, int y, int z, int k){
        return multiply(x, y)*multiply(z, k);
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public BigDecimal multiply(BigDecimal c, BigDecimal d){
        return c.multiply(d);
    }


    public int multiply(List<Integer> integers) {
        int result = 1;
        for (Integer integer : integers) {
            result *= integer;
        }
        return result;
    }
}
