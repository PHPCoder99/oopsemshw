package sem5.hw;

public class ComplexCalculator {
    public static ComplexNumber sum(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber(z1.getReal() + z2.getReal(), z1.getComplex() + z2.getComplex());
    }

    public static ComplexNumber sub(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber(z1.getReal() - z2.getReal(), z1.getComplex() - z2.getComplex());
    }

    public static ComplexNumber mul(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber(z1.getReal()*z2.getReal()-z1.getComplex()*z2.getComplex(), z1.getReal()*z2.getComplex()+z2.getReal()*z1.getComplex());
    }

    public static ComplexNumber div(ComplexNumber z1, ComplexNumber z2){
        return new ComplexNumber((z1.getReal()*z2.getReal()+z1.getComplex()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()), (z2.getReal()*z1.getComplex()-z1.getReal()*z2.getComplex())/(z2.getReal()*z2.getReal()+z2.getComplex()*z2.getComplex()));
    }
}
