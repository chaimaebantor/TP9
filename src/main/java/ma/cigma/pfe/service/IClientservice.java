package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Client;

public interface IClientservice {
    boolean save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);

}
