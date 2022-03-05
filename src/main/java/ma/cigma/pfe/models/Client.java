package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "TClient")

public class Client {
    @Id
    //identity= auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="CNAME")
    private String name;
    //this column will not be saved in the database bc it's calculable
    //@Transient
   // private double amount;
public Client(String name)
{

}
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Client(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Client()
    {

    }
}
