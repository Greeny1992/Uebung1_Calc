package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CalculatorImpl implements Calculator{
    List<Integer> intList = new ArrayList<>();

    @Override
    public int getMaximum() {
        int max = intList.get(0);
        for(int actualVal : intList){
            if(actualVal > max)
                max = actualVal;
        }
        return max;
    }

    @Override
    public int getMinimum(){
        int min = intList.get(0);
        for(int actualVal : intList){
            if(actualVal < min)
                min = actualVal;
        }
        return min;
    }
    @Override
    public void addValue(int val){
        intList.add(val);
    }

    @Override
    public int sum(){
        return intList.stream().mapToInt(Integer::intValue).sum();
    }
}
