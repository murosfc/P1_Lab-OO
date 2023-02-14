package iff.laboo.p1.questao1;

import java.util.HashSet;
import java.util.Set;

public class Trilha {
    private String nome;
    private Musica musica;
    private Set<Artista> cantores;
    
    public Trilha(String nome, Musica musica) {
        this.nome = nome;
        this.musica = musica;
        this.cantores = new HashSet<>();
    } 
    
   public void addCantor(Artista cantor){
       if (cantor == null){
           throw new IllegalArgumentException("Cantor não pode ser nulo");
       }
       this.cantores.add(cantor);       
   }
   
   public void removeCantor(Artista cantor){
       this.cantores.remove(cantor);
   }

    public Set<Artista> getCantores() {
        return cantores;
    }

    public void setCantores(Set<Artista> cantores) {
        this.cantores = cantores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
    
    
}
