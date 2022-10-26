package com.notebook;

import datasours.DataSourceFactory;
import datasours.INoteShopDataSource;
import datasours.Image;
import datasours.Netbook;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.naming.NamingException;
import java.io.IOException;

@WebServlet(name = "NotebookServlet", value = "/NotebookServlet")
public class NotebookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DataSourceFactory factory = new DataSourceFactory();
            INoteShopDataSource dataSource = factory.getDataSource();

            Netbook[] netbooks = dataSource.getAllPhones().toArray(new Netbook[0]);
            Image[] previewImages = new Image[netbooks.length];
            for (int i = 0; i < netbooks.length; i++) {
                previewImages[i] = dataSource.getPhonePreviewImage(netbooks[i].getId());
            }
            HttpSession session = request.getSession();
            session.setAttribute("netbook", netbooks);
            session.setAttribute("previews", previewImages);
            response.sendRedirect(request.getContextPath() + "/noteList.jsp");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DataSourceFactory factory = new DataSourceFactory();
            INoteShopDataSource dataSource = factory.getDataSource();

            int pk = Integer.parseInt(request.getParameter("pk"));
            Netbook netbook = dataSource.getPhoneById(pk);
            Image[] netbookImages = dataSource.getPhoneImages(pk).toArray(new Image[0]);

            HttpSession session = request.getSession();
            session.setAttribute("netbook", netbook);
            session.setAttribute("images", netbookImages);
            response.sendRedirect(request.getContextPath() + "/notesInfo.jsp");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}

