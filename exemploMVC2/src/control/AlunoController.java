package control;
import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
private ArrayList<Aluno> listaAl; 
public AlunoController()
{
listaAl = new ArrayList<>();
}
public void cadastrar (int ra, String nome)
{
    Aluno a1 = new Aluno (ra, nome);
    listaAl.add(a1);
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
}
