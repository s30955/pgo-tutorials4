import java.math.BigDecimal;

public class Adder {
    public int x;
    public int y;

    public int add(int x, int y){
        return x*y;
    }
    public BigDecimal add(BigDecimal c, BigDecimal d){
        return c.add(d);
    }
}
