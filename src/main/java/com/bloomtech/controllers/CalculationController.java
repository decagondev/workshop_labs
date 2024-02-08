package com.bloomtech.controllers;

import com.bloomtech.entities.Calculation;
import com.bloomtech.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {


    @Autowired
    CalculationService calcService;

    @PostMapping("/add")
    public Calculation add(@RequestBody Calculation calc) {
        return calcService.add(calc);
    }

    @PostMapping("/subtract")
    public Calculation subtract(@RequestBody Calculation calc) {
        return calcService.subtract(calc);
    }

    @PostMapping("/multiply")
    public Calculation multiply(@RequestBody Calculation calc) {
        return calcService.multiply(calc);
    }

    @PostMapping("/divide")
    public Calculation divide(@RequestBody Calculation calc) {
        return calcService.divide(calc);
    }


}
