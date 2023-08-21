package com.ipi.jva324.commande;


import com.ipi.jva324.Jva324Application;
import com.ipi.jva324.commande.service.CommandeProduitServiceRestImpl;
import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) // Junit 4 : @RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(Jva324Application.class)
//@Import(TestRestConfiguration)
public class CommandeProduitServiceRestImplIntegrationTest {

    @Autowired
    private ProduitService produitService;
    @Autowired
    private CommandeProduitServiceRestImpl commandeProduitServiceRestImpl;

    @BeforeEach
    void setUp() {

    }
    @Test
    public void testGet() {
        Long produitId1 = produitService.getProduits().get(0).getId();

        ProduitEnStock p = commandeProduitServiceRestImpl.getProduit(produitId1);
        Assertions.assertEquals(produitId1, p.getId());
    }
}
