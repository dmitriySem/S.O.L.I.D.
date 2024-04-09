package example_1;

public class Client {
    DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}