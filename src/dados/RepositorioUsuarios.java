package dados;

import java.util.ArrayList;
import negocio.Usuario;

public class RepositorioUsuarios {
		
	private ArrayList<Usuario> usuarios;
	
	public RepositorioUsuarios () {
		this.usuarios = new ArrayList<>();
	}
	
    public boolean addUsuario(Usuario usuario) {
        boolean resultado = false;
        if (usuario != null) {
            String cpf = usuario.getCpf();
            boolean existeUsuarioComCpfIgual = false;
            for (Usuario interna : usuarios) {
                if (interna.getCpf().equals(cpf)) {
                	existeUsuarioComCpfIgual = true;
                }
            }
            if (!existeUsuarioComCpfIgual) {
                this.usuarios.add(usuario);
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean removerUsuario(String cpf) {
        boolean cpfExiste = false;
        int i;
        for (i = 0; i < this.usuarios.size() && !cpfExiste; i++) {
            Usuario usuario = this.usuarios.get(i);
            if (usuario.getCpf().equals(cpf)) {
            	cpfExiste = true;
            }
        }
        if (cpfExiste) {
            this.usuarios.remove(i-1);
        }
        return cpfExiste;
    }
    
    public Usuario procurarUsuario(String cpf) {
    	//int i = 0;
    	//boolean achou = false;
    	//while (!achou) { 
    	//}
    	Usuario resultado = null;
    	return resultado;
    }
    
    public String toString() { 
        String resultado = "";
        for (Usuario usuario : this.usuarios) {
            resultado = resultado + usuario.getNome() + "  |  Cpf: " 
                            + usuario.getCpf() + "\n";
        }
        return resultado;
    }
    
}