package com.app.financial.integration.controller.hgbrasil;


import com.app.financial.integration.service.hgbrasil.FinancialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hgbrasil")
public class FinanceController {

    FinancialService financialService = new FinancialService();

    @GetMapping("/finance")
    public Object returnAllDataFinanceHgBrasil(){
        return financialService.returnAllDataFinanceHgBrasil();
    }
}
