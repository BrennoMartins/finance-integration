package com.app.financial.integration.service.hgbrasil;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class FinancialService {

    RestTemplate restTemplate = new RestTemplate();

    public Object returnAllDataFinanceHgBrasil() {


        URI uri = UriComponentsBuilder
                .fromHttpUrl("https://api.hgbrasil.com/finance")
                .encode()
                .build()
                .toUri();

        return restTemplate.getForObject(uri, Object.class);

    }
}
