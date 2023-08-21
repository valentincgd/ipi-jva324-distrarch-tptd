package com.ipi.jva324.commande.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class CommandeProduitServiceLocalImpl implements CommandeProduitService {

    @Autowired
    private CommandeProduitService commandeProduitService;

    public ProduitEnStock getProduit(long id) {
        return commandeProduitService.getProduit(id);
    }

/*    @Override
    public List<ProduitEnStock> getProduits() {
        return null;
    }*/
}
