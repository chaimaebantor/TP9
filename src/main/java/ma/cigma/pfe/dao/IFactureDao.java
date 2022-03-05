package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;

import java.util.List;

public interface IFactureDao {
    Facture save(Facture f);
    Facture update(Facture newFacture);
    void deleteById(long idFacture);
    Facture findById(long idFacture);
    List<Facture> findAll();

}
