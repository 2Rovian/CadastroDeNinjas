package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char dificuldade;

    // muitos ninjas vão ter uma única missão (potencialmente)
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel(){
    }

    public MissoesModel(String nome, char rank) {
        this.nome = nome;
        this.dificuldade = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(char dificuldade) {
        this.dificuldade = dificuldade;
    }
}
