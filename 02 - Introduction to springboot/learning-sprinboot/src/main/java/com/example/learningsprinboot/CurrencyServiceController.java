package com.example.learningsprinboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @Autowired
    public CurrencyServiceController(CurrencyServiceConfiguration currencyServiceConfiguration) {
        this.currencyServiceConfiguration = currencyServiceConfiguration;
    }

    @RequestMapping("currency-configuration")
    public CurrencyServiceConfiguration getAllConfig() {
        return currencyServiceConfiguration;
    }


}
