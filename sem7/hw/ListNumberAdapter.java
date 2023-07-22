package sem7.hw;

import java.util.ArrayList;
import java.util.List;

public class ListNumberAdapter {
    public ComplexNumber asComplexNumberDouble(List<Double> doubles){
        return new ComplexNumber(doubles.get(0), doubles.get(1));
    }

    public ComplexNumber asComplexNumberInt(List<Integer> doubles){
        return new ComplexNumber(Double.parseDouble(doubles.get(0).toString()), Double.parseDouble(doubles.get(1).toString()));
    }

    public List<Double> asDoubleList(ComplexNumber number){
        ArrayList<Double> temp = new ArrayList<>();
        temp.add(number.getReal());
        temp.add(number.getComplex());
        return temp;
    }
}
