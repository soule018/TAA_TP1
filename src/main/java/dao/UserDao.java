package dao;

import business.Fiche;
import business.User;

public class UserDao extends  AbstractJpaDao<Long, User>{
    public  User user;
    public UserDao() {
        super(User.class);
    }

    public User createUser(String name){
        User user = new User(name);
            this.save(user);
            return user;
    }

    public void addFiche(Fiche fiche){
        if(!user.getListFiche().contains(fiche)){
           user.getListFiche().add(fiche);
        }
    }
}
