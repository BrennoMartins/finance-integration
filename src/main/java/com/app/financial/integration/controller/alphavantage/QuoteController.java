package com.app.financial.integration.controller.alphavantage;

import com.app.financial.integration.service.alphavantage.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/{symbol}")
    public Object getQuote(@PathVariable String symbol) {
        return quoteService.getQuote(symbol);
    }
}