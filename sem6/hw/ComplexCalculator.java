package sem6.hw;

public class ComplexCalculator extends AbstractComplexCalculator {

    @Override
    public ComplexNumber sumc(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.getReal() + z2.getReal(), z1.getComplex() + z2.getComplex());
    }

    @Override
    public ComplexNumber subc(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.getReal() - z2.getReal(), z1.getComplex() - z2.getComplex());
    }

    @Override
    public ComplexNumber mulc(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.getReal()*z2.getReal()-z1.getComplex()*z2.getComplex(), z1.getReal()*z2.getComplex()+z2.getReal()*z1.getComplex());
    }

    @Override
    public ComplexNumber divc(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber((z1.getReal()*z2.getReal()+z1.getComplex()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()), (z2.getReal()*z1.getComplex()-z1.getReal()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()));
    }
}
