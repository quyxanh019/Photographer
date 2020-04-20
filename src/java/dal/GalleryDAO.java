package dal;

import context.ContextPath;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Gallery;

public class GalleryDAO {

    //get top 3 header gallery
    public ArrayList getTop3Galleries() throws Exception {
        ContextPath path = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Gallery> listGalleries = new ArrayList<>();
        String sql = "SELECT TOP (3) [ID]\n"
                + "      ,[Name]\n"
                + "      ,[Description]\n"
                + "      ,[Image]\n"
                + "  FROM [Photographer].[dbo].[Gallery]";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //get the 2 galleries out from databse
            while (rs.next()) {
                Gallery n = new Gallery();
                n.setId(rs.getInt("ID"));
                n.setName(rs.getString("Name"));
                n.setDescription(rs.getString("Description"));
                n.setImage(path.getImage() + rs.getString("Image"));
                listGalleries.add(n);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return listGalleries;
    }

    //count the number of record and return counted number
    public int countGallery() throws Exception {
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //sql statement
        String sql = "  Select count(*)\n"
                + "  from Gallery";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //get the number of record from database
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return 0;
    }

    //Search and page the records
    public ArrayList<Gallery> pagingGallery(int pageIndex, int pageSize) throws Exception {
        ContextPath contextPath = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Gallery> listGalleries = new ArrayList<>();
        int firstGallery = (pageIndex - 1) * pageSize + 1;
        int lastGallery = pageIndex * pageSize;
        //sql statement
        String sql = "SELECT *\n"
                + "   FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY id ASC) as row_num \n"
                + "              FROM  Gallery) quiz\n"
                + "   where row_num >= ? and row_num <= ?";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            //adding search materials to sql statement
            ps.setInt(1, firstGallery);
            ps.setInt(2, lastGallery);
            rs = ps.executeQuery();
            //get the searched galleries out from databse
            while (rs.next()) {
                Gallery n = new Gallery();
                n.setId(rs.getInt("ID"));
                n.setName(rs.getString("Name"));
                n.setDescription(rs.getString("Description"));
                n.setImage(contextPath.getImage() + rs.getString("Image"));
                listGalleries.add(n);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return listGalleries;
    }

    //cout image of gallery
    public int countImage(int galleryID) throws Exception {
        ContextPath contextPath = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(*)\n"
                + "  FROM [Photographer].[dbo].[ImageInGallery]\n"
                + "  where [GalleryID] = ?";
        DBContext dBContext = new DBContext();
        try {
            //trying connect to database
            con = dBContext.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, galleryID);
            rs = ps.executeQuery();
            //get the number of Gallery's image from database
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return 0;
    }

    //Page the image by page index, pagesize and GID
    public ArrayList<String> pagingImage(int galleryID, int pageIndex, int pageSize) throws Exception {
        ContextPath contextPath = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<String> listImages = new ArrayList<>();
        int firstImage = (pageIndex - 1) * pageSize + 1;
        int lastImage = pageIndex * pageSize;
        //sql statement
        String sql = "Select *\n"
                + " FROM (Select *,ROW_NUMBER() OVER (Order by ID ASC ) as rownum\n"
                + " FROM ImageInGallery\n"
                + " where GalleryID = ?) Ga\n"
                + " where rownum >= ? and rownum <= ?";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            //adding search materials to sql statement
            ps.setInt(1, galleryID);
            ps.setInt(2, firstImage);
            ps.setInt(3, lastImage);
            rs = ps.executeQuery();
            //get the searched news out from databse
            while (rs.next()) {
                listImages.add(contextPath.getImage() + rs.getString("Image"));
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return listImages;
    }
//get Gallery by ID

    public Gallery getGalleryByID(int galleryID, int pageIndex, int pageSize) throws Exception {
        ContextPath contextPath = new ContextPath();
        DBContext db = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //sql statement
        Gallery gallery = new Gallery();
        String sql = "SELECT [ID]\n"
                + "      ,[Name]\n"
                + "      ,[Description]\n"
                + "      ,[Image]\n"
                + "  FROM [Photographer].[dbo].[Gallery]\n"
                + "  where [ID] = ?";
        try {
            //trying connect to database
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, galleryID);
            rs = ps.executeQuery();
            //get the gallery by ID
            if (rs.next()) {
                gallery.setId(rs.getInt("ID"));
                gallery.setName(rs.getString("Name"));
                gallery.setDescription(rs.getString("Description"));
                gallery.setImage(rs.getString("Image"));
                gallery.setImageList(pagingImage(galleryID, pageIndex, pageSize));
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            //close all connection
            db.closeConnection(rs, ps, con);
        }
        return gallery;
    }
}
