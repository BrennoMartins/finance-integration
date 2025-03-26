package com.app.financial.integration.service.alphavantage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class QuoteService {

    @Value("${alpha.api.url}")
    private String apiUrl;

    @Value("${alpha.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public Object getQuote(String symbol) {
        String uri = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("function", "GLOBAL_QUOTE")
                .queryParam("symbol", symbol)
                .queryParam("apikey", apiKey)
                .toUriString();

        return restTemplate.getForObject(uri, Object.class);
    }
}