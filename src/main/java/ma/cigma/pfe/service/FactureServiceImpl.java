package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;

import java.util.List;

public class FactureServiceImpl implements IFactureservice{
    IFactureDao dao;
    public FactureServiceImpl() {
        System.out.println("FactureServiceImpl ....");
    }

    public FactureServiceImpl(IFactureDao factureRepository) {
        System.out.println("Call FactureServiceImpl with FactureRepository");
        this.dao = factureRepository;
    }

    @Override
    public Facture save(Facture f) {
        System.out.println("SL: FactureServiceImpl ");
        return dao.save(f);
    }
    @Override
    public Facture modify(Facture newFacture) {
        return dao.update(newFacture);
    }
    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Facture> getAll() {
        return dao.findAll();
    }
}
