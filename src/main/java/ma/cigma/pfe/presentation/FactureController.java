package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureservice;

import java.util.List;

public class FactureController {

    IFactureservice serviceFDI;

    public FactureController() {
        System.out.println("FactureController ....");
    }
    public FactureController(IFactureservice factureService) {
        System.out.println("FactureController with factureService ..");
        this.serviceFDI = factureService;
    }

    public void setFactureService(IFactureservice factureService) {
        this.serviceFDI = factureService;
    }

    public Facture save(Facture f ){
        System.out.println("FactureController ");
        return serviceFDI.save(f);
    }
    public void modify(Facture newFacture) {
        serviceFDI.modify(newFacture);
    }
    public void removeById(long id) {
        serviceFDI.removeById(id);
    }
    public Facture getById(long id) {
        return serviceFDI.getById(id);
    }

    public List<Facture> getAll() {
        return serviceFDI.getAll();
    }
}
