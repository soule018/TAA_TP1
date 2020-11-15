package dao;

import business.Fiche;

public class FicheDao extends AbstractJpaDao<Long, Fiche> {


    public FicheDao() {
        super(Fiche.class);
    }

    public Fiche createFiche(String libelle,String temps, String tags, String lieu, String url, String noteExplicative) {
        Fiche fiche = new Fiche(libelle);
        this.save(fiche);
        return fiche;
    }

    /*public void createFiche(String libelle,){
        this.save(fiche);
    }*/
}
