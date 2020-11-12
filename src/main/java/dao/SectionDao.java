package dao;


import business.Section;

public class SectionDao extends AbstractJpaDao<Long, Section>{


    public SectionDao() {
        super(Section.class);
    }

    public void createSection(Section section){
        this.save(section);
    }
}
