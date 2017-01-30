/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nizar Zgolli
 */
public class Chambre {

    private int id ;  
    private int  nbLitsSimple ; 
    private int  nbLitsDouble ;
    private int nbLitsBebe ;

    public Chambre(){
        
    }
    
    public Chambre (int id ,int nbLitsSimple , int nbLitsDouble,int nbLitsBebe){
        this.id = id ;
        this.nbLitsSimple = nbLitsSimple;
        this.nbLitsDouble = nbLitsDouble;
        this.nbLitsBebe = nbLitsBebe;
    }
    @Override
    public String toString (){
        return ("Lits Simple :  "+this.nbLitsSimple + " LitsDoubles : " + this.nbLitsDouble + " Lits bébé : " +this.nbLitsBebe);
    }
  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbLitsSimple() {
        return nbLitsSimple;
    }

    public void setNbLitsSimple(int nbLitsSimple) {
        this.nbLitsSimple = nbLitsSimple;
    }

    public int getNbLitsDouble() {
        return nbLitsDouble;
    }

    public void setNbLitsDouble(int nbLitsDouble) {
        this.nbLitsDouble = nbLitsDouble;
    }

    public int getNbLitsBebe() {
        return nbLitsBebe;
    }

    public void setNbLitsBebe(int nbLitsBebe) {
        this.nbLitsBebe = nbLitsBebe;
    }   
  @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
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
        final Chambre other = (Chambre) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nbLitsSimple != other.nbLitsSimple) {
            return false;
        }
        if (this.nbLitsDouble != other.nbLitsDouble) {
            return false;
        }
        if (this.nbLitsBebe != other.nbLitsBebe) {
            return false;
        }
        return true;
    }
}
