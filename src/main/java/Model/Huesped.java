package Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="HUESPEDES")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Huesped {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter 
    private long id;

    @Getter @Setter
    private String nombre;
    
    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private LocalDate fecha_nacimiento;

    @Getter @Setter
    private Nacionalidad nacionalidad;

    @Getter @Setter
    private String telefono;

    @OneToOne
    @JoinColumn(name = "reserva_id")
    @Getter @Setter
    private Reserva reserva;

    public Huesped(String text, String text2, String text3, Object object, String text4, Reserva reservacion) {
        
        this.nombre = text;
        this.apellido = text2;
        this.fecha_nacimiento = LocalDate.parse(text3);
        this.nacionalidad =  (Nacionalidad) object;
        this.telefono = text4;
        this.reserva = reservacion;

    }



}
