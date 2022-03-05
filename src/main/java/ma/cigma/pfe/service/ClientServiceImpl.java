package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.ClientDaoImpl;
import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class ClientServiceImpl  implements IClientservice{
      IClientDao dao;

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    public IClientDao getDao() {
        return dao;
    }

    @Override
    public boolean save(Client c) {
        System.out.println("service layer");
        return dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }


    public ClientServiceImpl()
    {
        System.out.println("creation d'un object clientserviceimpl");
    }
}
