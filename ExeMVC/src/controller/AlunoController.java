/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author professor
 */
public class AlunoController {
    
    private ArrayList<Aluno> lista;

    
    public AlunoController() {
        lista = new ArrayList();
    }
    
    public void cadastrar(int ra, String nome)
    {
        Aluno al = new Aluno (ra, nome);
        //lista.add(al);
        AlunoDAO alDao = new AlunoDAO();
        try {
            alDao.inserirAluno(al);
        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(al.getRa() + "  " + al.getNome());
    }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }
    
    public void excluir (int ra)
    {
       for(Aluno a: lista)
       {
           if(a.getRa()==ra)
           {
               lista.remove(a);
               break;
           }
       }
    }
}
