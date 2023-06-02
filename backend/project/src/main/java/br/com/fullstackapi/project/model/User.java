package br.com.fullstackapi.project.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 200, nullable = true)
    private String nome;
    @Column(name = "email", length = 50, nullable = true)
    private String email;
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name = "telefone", length = 15, nullable = true)
    private String telefone;
}
