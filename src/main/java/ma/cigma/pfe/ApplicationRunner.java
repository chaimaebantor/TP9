package ma.cigma.pfe;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.presentation.ClientController;
import ma.cigma.pfe.presentation.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr=(ClientController) ctx.getBean("idCtrl");
        Client clientForm=new Client("chaimae");

       /* ctr.save(clientForm);

        ctr.save(new Client("OMAR"));
        ctr.save(new Client("SIHAM"));
        ctr.save(new Client("AHMED"));
        ctr.save(new Client("FARAH"));

        ctr.modify(new Client(1,"new Name"));

        ctr.removeById(1L);

        Client found = ctr.getById(1L);
        //ctr.save(new Client(2,"chaimae"));
        //System.out.println(ctr.getService());
        //ClientController controller =new ClientController();
        // Client clientForm =new Client(1,"chaimae");
        //controller.save(clientForm);*/

//********************************FACTURE****************************************************

        FactureController ctrlF = (FactureController) ctx.getBean("controllerFacture");

        // Test save use case for two factures
        ctrlF.save(new Facture(new Date(System.currentTimeMillis()), 1450.00));
        ctrlF.save(new Facture(new Date(2021, 04,17), 999.00));
        ctrlF.save(new Facture(new Date(2021, 04,17), 333.00));
        // Test modify use case for facture with id==1
        ctrlF.modify(new Facture(1L, new Date(System.currentTimeMillis()),1340.00));

        // Test remove use case for facture with id==1
        //ctrlF.removeById(1L);

        // Test find use case for facture with id==1
        Facture foundF = ctrlF.getById(1L);

        // Test get all factures
        List<Facture> factureList = ctrlF.getAll();



    }
}
