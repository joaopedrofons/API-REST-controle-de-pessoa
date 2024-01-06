package entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String primeiroNome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate dataNascimento;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Telefone> telefones;
}
