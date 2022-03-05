package ma.cigma.pfe.presentation;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientServiceImpl;
import ma.cigma.pfe.service.IClientservice;

public class ClientController {
    IClientservice service;



    public void setService(IClientservice service) {

        this.service = service;
    }
     public void getservice(IClientservice service) {

        this.service = service;
    }

    public void save(Client c)
    {
        System.out.println("presentation layer ");
      service.save(c);
    }

    public void modify(Client c)
    {
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }

    public Client getById(long id){
        return service.getById(id);
    }


    public ClientController()
    {

        System.out.println("creation d'un object client controller");
    }
    public IClientservice getService() {

        return service;
    }
}
