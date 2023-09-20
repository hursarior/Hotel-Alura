package Model;


import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "RESERVA")
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "reserva_id")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    private Long reserva_id;

    public Long getReserva_id() {
        return reserva_id;
    }
    

    @Getter @Setter
    private LocalDate chechin;

    @Getter @Setter
    private LocalDate checkout;

    @Getter @Setter
    private BigDecimal valor_reserva;

    @Getter @Setter
    private FormasPago Forma_pago;
    


    public Reserva( LocalDate chechin, LocalDate checkout, BigDecimal valor_reserva,
        Object object) {
            
        this.chechin = chechin;
        this.checkout = checkout;
        this.valor_reserva = valor_reserva;
        this.Forma_pago = (FormasPago) object;
    }

    
}
