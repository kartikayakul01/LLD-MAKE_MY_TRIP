package models;

public enum UserEnum {
    Admin(1),
    Consumer(2);

    private final int id;

    private UserEnum(int id){
        this.id = id;
    }
    private int getid(){
        return this.id;
    }
    public static UserEnum getThing(int value) throws Exception {
        for (UserEnum type : UserEnum.values()) {
            if (type.getid() == value) {
                return type;
            }
        }
        throw new Exception("This User Type do not exists");
    }

}