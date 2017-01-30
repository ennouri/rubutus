
import java.awt.List;
import java.util.ArrayList;
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
public class Logement {
    private int id ;
    private TypeLogement type ;
    private int superficie ; 
    private int prix;
    private String titre ;
    private String description ;
    private String image ; 
    private boolean internet ;
    private boolean chauffage ;
    private boolean tv ;
    private boolean jardin ;
    private boolean parking ;       
    private int nbVoyageur ;
    private Adresse adresse ;
    private user hote ;
    private ArrayList<Chambre> chambres ;
    private Critere critere ;

    public Logement(){
    
    }
    
    public Logement(int id, TypeLogement type, int superficie, int prix, String titre, String description, String image, boolean internet, boolean chauffage, boolean tv, boolean jardin, boolean parking, int nbVoyageur, Adresse adresse, user hote, ArrayList<Chambre> chambres, Critere critere) {
        this.id = id;
        this.type = type;
        this.superficie = superficie;
        this.prix = prix;
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.internet = internet;
        this.chauffage = chauffage;
        this.tv = tv;
        this.jardin = jardin;
        this.parking = parking;
        this.nbVoyageur = nbVoyageur;
        this.adresse = adresse;
        this.hote = hote;
        this.chambres = chambres;
        this.critere = critere;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeLogement getType() {
        return type;
    }

    public void setType(TypeLogement type) {
        this.type = type;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isChauffage() {
        return chauffage;
    }

    public void setChauffage(boolean chauffage) {
        this.chauffage = chauffage;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public int getNbVoyageur() {
        return nbVoyageur;
    }

    public void setNbVoyageur(int nbVoyageur) {
        this.nbVoyageur = nbVoyageur;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public user getHote() {
        return hote;
    }

    public void setHote(user hote) {
        this.hote = hote;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Critere getCritere() {
        return critere;
    }

    public void setCritere(Critere critere) {
        this.critere = critere;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final Logement other = (Logement) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (this.superficie != other.superficie) {
            return false;
        }
        if (this.prix != other.prix) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (this.internet != other.internet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logement{" + "id=" + id + ", type=" + type + ", superficie=" + superficie + ", prix=" + prix + ", titre=" + titre + ", description=" + description + ", image=" + image + ", internet=" + internet + ", chauffage=" + chauffage + ", tv=" + tv + ", jardin=" + jardin + ", parking=" + parking + ", nbVoyageur=" + nbVoyageur + ", adresse=" + adresse + ", hote=" + hote + ", chambres=" + chambres + ", critere=" + critere + '}';
    }
    
    
    
}
