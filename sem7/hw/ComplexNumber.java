package sem7.hw;

public class ComplexNumber {
    private Double real;
    private Double complex;

    public ComplexNumber() {
    }

    public ComplexNumber(Double real, Double complex) {
        this.real = real;
        this.complex = complex;
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getComplex() {
        return complex;
    }

    public void setComplex(Double complex) {
        this.complex = complex;
    }

    @Override
    public String toString() {
        return this.real.toString() + " + " + this.complex.toString() + "i";
    }
}
