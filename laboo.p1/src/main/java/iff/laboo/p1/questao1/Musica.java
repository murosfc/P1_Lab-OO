package iff.laboo.p1.questao1;

import java.util.HashSet;
import java.util.Set;


public class Musica {
    private String titulo;
    private Set<Artista> compositores;

    public Musica(String titulo) {
        this.titulo = titulo;
        this.compositores = new HashSet<>();
    }
    
    public void addCompositor(Artista compositor){
        if (compositor == null)
            throw new IllegalArgumentException("O compositor não pode ser nulo");
        this.compositores.add(compositor);
    }
    
    public void removeCompositor(Artista compositor){
        this.compositores.remove(compositor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Artista> getCompositores() {
        return compositores;
    }

    public void setCompositores(Set<Artista> compositores) {
        this.compositores = compositores;
    }
    
    
}
