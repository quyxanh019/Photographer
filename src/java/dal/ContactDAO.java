
package dal;

import context.ContextPath;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Contact;

public class ContactDAO {

    //get all Contact information
    public Contact getContact() throws Exception {
        ContextPath path = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Contact n = null;
        String sql = "SELECT [Name]\n"
                + "      ,[Address]\n"
                + "      ,[City]\n"
                + "      ,[Country]\n"
                + "      ,[Telephone]\n"
                + "      ,[Email]\n"
                + "      ,[image]\n"
                + "  FROM [Photographer].[dbo].[Contact]";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //get the Contact out from databse
            while (rs.next()) {
                n = new Contact();
                n.setName(rs.getString("Name"));
                n.setAddress(rs.getString("Address"));
                n.setCity(rs.getString("City"));
                n.setCountry(rs.getString("Country"));
                n.setPhone(rs.getInt("Telephone"));
                n.setEmail(rs.getString("Email"));
                n.setImage(path.getImage() + rs.getString("Image"));
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
