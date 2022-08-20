package control;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

public class AlunoController {
private ArrayList<Aluno> listaAl; 
public AlunoController()
{
listaAl = new ArrayList<>();
}
public void cadastrar (int ra, String nome) throws SQLException
{
    Aluno a1 = new Aluno (ra, nome);
    AlunoDAO aldao = new AlunoDAO();
    aldao.inserirAluno(a1);
}      
public ArrayList<Aluno> mostraTodos()
{
    return listaAl;
}
public Aluno mostrarEspecifico (int ra)
{
    for(Aluno a: listaAl)
    {
        if(a.getRa()== ra)
            return a;
    }
    return null;
}
    public void excluir (int ra){
        for(Aluno a: listaAl){
            if(a.getRa()==ra){
             listaAl.remove(a);
             break;
        }
    }
}
}
