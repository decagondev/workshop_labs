package com.bloomtech.services;

import com.bloomtech.entities.Calculation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    // Add
    public Calculation add(Calculation calc) {
        /*
            Takes in a calculation entity.
            take the value from opA
            take the value from opB
            add the values from opA and opB together
            store the result in the result field of the calculation entity
            return the updated calculation entity to the caller
         */
        int a = calc.getOpA();
        int b = calc.getOpB();
        calc.setResult(a + b);
        return calc;
    }


    // Subtract
    public Calculation subtract(Calculation calc) {
        /*
            Takes in a calculation entity.
            take the value from opA
            take the value from opB
            subtract the value of opB from opA
            store the result in the result field of the calculation entity
            return the updated calculation entity to the caller
         */
        int a = calc.getOpA();
        int b = calc.getOpB();
        calc.setResult(a - b);
        return calc;
    }



    // Multiply
    public Calculation multiply(Calculation calc) {
        /*
            Takes in a calculation entity.
            take the value from opA
            take the value from opB
            multiply the values of opA and opB together
            store the result in the result field of the calculation entity
            return the updated calculation entity to the caller
         */
        int a = calc.getOpA();
        int b = calc.getOpB();
        calc.setResult(a * b);
        return calc;
    }


    // Divide
    public Calculation divide(Calculation calc) {
        /*
            Takes in a calculation entity.
            take the value from opA
            take the value from opB
            divide the value of opA by opB
            store the result in the result field of the calculation entity
            return the updated calculation entity to the caller
         */
        int a = calc.getOpA();
        int b = calc.getOpB();
        calc.setResult(a / b);
        return calc;
    }
}
