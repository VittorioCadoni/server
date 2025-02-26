package entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToOne(mappedBy = "utente", cascade = CascadeType.ALL, orphanRemoval = true)
    private LIST ordini;
}
