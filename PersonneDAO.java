/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Connexion.Connexion;
import java.sql.ResultSet;

/**
 *
 * @author margauxhery
 */
public class PersonneDAO extends DAO<Personne> {
  public PersonneDAO(Connexion conn) {
    super(conn);
  }

  public boolean create(Personne obj) {
    return false;
  }

  public boolean delete(Professeur obj) {
    return false;
  }

  public boolean update(Professeur obj) {
    return false;
  }
   
  public Personne find(int id) {
    Personne personne = new Personne();            
    try {
        ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE, 
        ResultSet.CONCUR_READ_ONLY
      ).executeQuery(
        "SELECT * FROM Personn "+
        "LEFT JOIN j_mat_prof ON jmp_prof_k = prof_id " + 
        "AND prof_id = "+ id +
        " INNER JOIN matiere ON jmp_mat_k = mat_id"
      );
      if(result.first()){
        personne = new Personne(id, result.getString("nom"), result.getString("prenom"));
        result.beforeFirst();
        MatiereDAO matDao = new MatiereDAO(this.connect);
            
        while(result.next())
          professeur.addMatiere(matDao.find(result.getInt("mat_id")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return professeur;
  }

  public boolean update(Professeur obj) {
    return false;
  }

    @Override
    public boolean delete(Personne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Personne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
