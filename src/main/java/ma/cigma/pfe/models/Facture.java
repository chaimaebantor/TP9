package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter

@Entity
@Table(name = "TFacture")
public class Facture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="CDATE")
    private Date date;
    @Column
    private Double amount;

   public Facture(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

  public Facture(long id, Date date, Double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public Facture()
    {

    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
