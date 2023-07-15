package sem6.hw;

public class BasicCalculator extends AbstractBasicCalculator{

    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        return a/b;
    }
}
