
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nizar Zgolli
 */
public class Critere {
    private int id ;
    private char sexe ; 
    private trancheAge age ;
    private boolean fumeur ;
    private boolean  animaux ;  
    private String description ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public trancheAge getAge() {
        return age;
    }

    public void setAge(trancheAge age) {
        this.age = age;
    }

    public boolean isFumeur() {
        return fumeur;
    }

    public void setFumeur(boolean fumeur) {
        this.fumeur = fumeur;
    }

    public boolean isAnimaux() {
        return animaux;
    }

    public void setAnimaux(boolean animaux) {
        this.animaux = animaux;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Critere{" + "id=" + id + ", sexe=" + sexe + ", age=" + age + ", fumeur=" + fumeur + ", animaux=" + animaux + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + this.sexe;
        hash = 79 * hash + Objects.hashCode(this.age);
        hash = 79 * hash + (this.fumeur ? 1 : 0);
        hash = 79 * hash + (this.animaux ? 1 : 0);
        hash = 79 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Critere other = (Critere) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.sexe != other.sexe) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.fumeur != other.fumeur) {
            return false;
        }
        if (this.animaux != other.animaux) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    
    
}
