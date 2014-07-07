/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.AsdfDAO;
import model.pojo.Asdf;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Karel Hala
 */
public class AsdfController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("users");
        try {
            List<Asdf> lst = AsdfDAO.layDS();
            mv.addObject("users",lst);
        } catch (Exception e) {
        }
        return mv;
    }

}
