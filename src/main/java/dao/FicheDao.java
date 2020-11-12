package dao;

import business.Fiche;

public class FicheDao extends AbstractJpaDao<Long, Fiche> {


    public FicheDao() {
        super(Fiche.class);
    }

    public void createFiche(Fiche fiche){
        this.save(fiche);
    }

    /*public void createFiche(String libelle,){
        this.save(fiche);
    }*/
}
