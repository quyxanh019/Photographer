
package controller;

import dal.GalleryDAO;
import dal.InformationDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Gallery;
import model.Information;

public class HomeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {

            InformationDAO informationDAO = new InformationDAO();
            GalleryDAO galleryDAO = new GalleryDAO();
            int curentPage = 0;
            String error = null;

            //get top 3 gallery
            ArrayList<Gallery> top3Galleries = new ArrayList<>();
            top3Galleries = galleryDAO.getTop3Galleries();
            
            
            
            Information information = new Information();
            information = informationDAO.getinformation();

            // Get current page position
            String index_raw = request.getParameter("pageIndex");
            // Check if page index is existed or not
            if (index_raw == null) {
                //else pageindex will automatically be the first page
                index_raw = "1";
            }

            //get the number of gallery querried
            int totalGalerries = galleryDAO.countGallery();
            int pageSize = 3;

            // calculate Number of pages
            //check if check if totoal pageSize are divive by totalGalerries or not 
            //if yes, Num of page = the result else Num of page = the result + 1
            int numOfPage = (totalGalerries % pageSize == 0) ? (totalGalerries / pageSize) : (totalGalerries / pageSize + 1);

            //Check entered page number is fit or not
            try {
                //try parsing to Integer
                curentPage = Integer.parseInt(index_raw);
                //check of pageNumbe is fited or not
                if (curentPage > numOfPage || curentPage < 1) {
                    error = "Page not found";
                }
            } catch (NumberFormatException ex) {
                error = "Page not found";
            }

            //get list Gallery that paged by page number
            ArrayList<Gallery> pagingGallery = new ArrayList<>();
            pagingGallery = galleryDAO.pagingGallery(curentPage, pageSize);

            //send to Front site
            request.setAttribute("top3Galleries", top3Galleries);
            request.setAttribute("information", information);
            request.setAttribute("pagingGallery", pagingGallery);
            request.setAttribute("numOfPage", numOfPage);
            request.setAttribute("curentPage", curentPage);
            request.setAttribute("error", error);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
