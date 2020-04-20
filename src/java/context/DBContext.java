package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {

    private Connection con;
    private String url = "";
    private String username = "";
    private String password = "";

    public DBContext() {
    }

    public Connection getConnection() {
        try {
            ContextPath contextPath = new ContextPath();
            url = "jdbc:sqlserver://" + contextPath.getServerName() + ":" + contextPath.getPortNumber() + ";databaseName=" + contextPath.getDbname();
            username = contextPath.getUsername();
            password = contextPath.getPassword();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws Exception {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
