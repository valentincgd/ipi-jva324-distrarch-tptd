package com.ipi.jva324.stock.web;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/stock")
public class StockApi {

    @Autowired
    ProduitService produitService;

    @GetMapping("{id}")
    public ProduitEnStock getStockProduit(@PathVariable Long id) {
        return produitService.getProduit(id);
    }

    @GetMapping
    public List<ProduitEnStock> getProduits() { return produitService.getProduits(); }
}
