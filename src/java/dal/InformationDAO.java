package dal;

import context.ContextPath;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Information;

public class InformationDAO {

    //get Informattion from database
    public Information getinformation() throws Exception {
        ContextPath contextPath = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Information n = null;
        //sql statement
        String sql = "SELECT [About]\n"
                + "      ,[ShortAbout]\n"
                + "      ,[Image]\n"
                + "  FROM [Photographer].[dbo].[Information]";
        DBContext dBContext = new DBContext();
        try {
            //trying connect to database
            con = dBContext.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //get the Information out from databse
            while (rs.next()) {
                n = new Information();
                n.setAbout(rs.getString("About"));
                n.setSortAbout(rs.getString("ShortAbout"));
                n.setImage(contextPath.getImage() + rs.getString("Image"));
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return n;
    }
}
