import java.sql.Connection;
import dao.ConnectionDAO;

public class Main{
    void main(String[] args) {


        Connection connection = ConnectionDAO.getConnection();



        ConnectionDAO.closeConnection(connection);



    }

}

