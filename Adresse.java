/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nizar Zgolli
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nizar
 */
public class Adresse {
    
    private int id;
    private String nomRue;
    private String ville;
    private String gouvernerat;
    private int codeP;
    private String pays;
    

    public Adresse() {
        this.id = 0;
        this.nomRue = "";
        this.ville = "";
        this.codeP = 0;
        this.gouvernerat = "";
        this.pays = "";
    }

    public Adresse(int id, String nomRue, String ville, int codeP, String gouvernorat, String pays) {
        this.id = id;
        this.nomRue = nomRue;
        this.ville = ville;
        this.codeP = codeP;
        this.gouvernerat = gouvernorat;
        this.pays = pays;
        
    }

    @Override
    public int hashCode() {
        return 5; //To change body of generated methods, choose Tools | Templates.
    }
  
    @Override
    public String toString() {
        return id + " "
                + nomRue + " "
                + ville + " "
                + codeP + " "
                + pays + " "
                ; 
    }
    
    public int getId() {
        return id;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public int getCodeP() {
        return codeP;
    }

    public String getPays() {
        return pays;
    }
    
    public void setGouvernerat(String gouvernerat) {
        this.gouvernerat = gouvernerat;
    }

    public String getGouvernerat() {
        return gouvernerat;
    }
}

