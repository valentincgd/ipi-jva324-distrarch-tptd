package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Component
@Primary
public class CommandeProduitServiceRestImpl implements CommandeProduitService {

    @Value("${stock.apiUrl:http://localhost:8080/api/stock")
    private String stockApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProduitEnStock getProduit(long id) {
        return restTemplate.getForObject(stockApiUrl + "/" + id, ProduitEnStock.class);
    }

/*    @Override
    public List<ProduitEnStock> getProduits() {
        return restTemplate.getForObject(stockApiUrl, List.class, ProduitEnStock.class);
    }*/
}
