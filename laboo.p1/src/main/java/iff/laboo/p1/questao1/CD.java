package iff.laboo.p1.questao1;

import java.util.HashSet;
import java.util.Set;

public class CD {
    private String titulo;
    private Set<Trilha> trilhas;

    public CD(String titulo, Set<Trilha> trilhas) {
        this.trilhas = new HashSet<>();
        this.titulo = titulo;
        this.trilhas = trilhas;
    }
    
    public CD(String titulo) {
        this.trilhas = new HashSet<>();
        this.titulo = titulo;       
    }
    
    public void addTrilha(Trilha trilha){
        if (trilha == null)
            throw new IllegalArgumentException("Trilha não pode ser nula");
        this.trilhas.add(trilha);
    }
    
    public void removeTrilha(Trilha trilha){
        this.trilhas.remove(trilha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Trilha> getTrilhas() {
        return trilhas;
    }

    public void setTrilhas(Set<Trilha> trilhas) {
        this.trilhas = trilhas;
    }
    
    
    
    
}
