package dao;

public class dbExceptions extends  RuntimeException{
    private static final long serialVersion_UID = 1L;

    public dbExceptions(String msg){
        super(msg);
    }
}