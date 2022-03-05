package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;

public interface IClientDao
{

boolean save(Client c);
Client update(Client newClient);
void deleteById(long idClient);
Client findById(long idClient);

}
