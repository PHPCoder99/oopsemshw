package sem6.hw;

public class Complex {
    private Integer real;
    private Integer complex;

    public Complex() {
    }

    public Complex(Integer real, Integer complex) {
        this.real = real;
        this.complex = complex;
    }

    public Integer getReal() {
        return real;
    }

    public void setReal(Integer real) {
        this.real = real;
    }

    public Integer getComplex() {
        return complex;
    }

    public void setComplex(Integer complex) {
        this.complex = complex;
    }

    @Override
    public String toString() {
        return this.real.toString() + " + " + this.complex.toString() + "i";
    }
}
