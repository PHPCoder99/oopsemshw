package sem6.hw;

public class ComplexCalculator extends AbstractComplexCalculator {

    @Override
    public Complex sumc(Complex z1, Complex z2) {
        return new Complex(z1.getReal() + z2.getReal(), z1.getComplex() + z2.getComplex());
    }

    @Override
    public Complex subc(Complex z1, Complex z2) {
        return new Complex(z1.getReal() - z2.getReal(), z1.getComplex() - z2.getComplex());
    }

    @Override
    public Complex mulc(Complex z1, Complex z2) {
        return new Complex(z1.getReal()*z2.getReal()-z1.getComplex()*z2.getComplex(), z1.getReal()*z2.getComplex()+z2.getReal()*z1.getComplex());
    }

    @Override
    public Complex divc(Complex z1, Complex z2) {
        return new Complex((z1.getReal()*z2.getReal()+z1.getComplex()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()), (z2.getReal()*z1.getComplex()-z1.getReal()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()));
    }
}
