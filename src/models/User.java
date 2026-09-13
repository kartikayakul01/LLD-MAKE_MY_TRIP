package models;

import java.util.Set;

public class User {
    private String name;
    private String email;
    private String phno;
    private UserEnum userType;
    private Coordinates currentlocations;


    public User(String name,String email,String phno){
        this.name=name;
        this.email=email;
        this.phno=phno;
        this.userType = UserEnum.Consumer;
    }

    public void setlocation(Double x,Double y){
        this.currentlocations=new Coordinates(x,y);
    }

    public void setUserType(UserEnum type){
        this.userType = type;
    }

    public Coordinates getCurrentlocations(){
        return this.currentlocations;
    }

}
