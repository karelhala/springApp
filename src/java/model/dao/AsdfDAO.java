/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import model.util.HibernateUtil;
import java.util.List;
import model.pojo.Asdf;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Karel Hala
 */
public class AsdfDAO {
    public static List<Asdf> layDS(){
        List<Asdf> lst = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Asdf";
            Query query = session.createQuery(hql);
            
            lst = query.list();
            session.close();
        } catch (Exception e) {
        }
        return lst;
    }
}
