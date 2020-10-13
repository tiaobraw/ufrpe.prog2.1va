package dados;

import java.util.ArrayList;

import negocio.bean.Pessoa;

public class RepositorioUsuarios {
		
	private ArrayList<Pessoa> usuarios;
	
	public RepositorioUsuarios () {
		this.usuarios = new ArrayList<>();
	}
	
    public boolean addUsuario(Pessoa usuario) {
        boolean resultado = false;
        if (usuario != null) {
            String cpf = usuario.getCpf();
            boolean existeUsuarioComCpfIgual = false;
            for (Pessoa interna : usuarios) {
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
            Pessoa usuario = this.usuarios.get(i);
            if (usuario.getCpf().equals(cpf)) {
            	cpfExiste = true;
            }
        }
        if (cpfExiste) {
            this.usuarios.remove(i-1);
        }
        return cpfExiste;
    }
    
    public Pessoa procurarUsuario(String cpf) {
    	//int i = 0;
    	//boolean achou = false;
    	//while (!achou) { 
    	//}
    	Pessoa resultado = null;
    	return resultado;
    }
    
    public String toString() { 
        String resultado = "";
        for (Pessoa usuario : this.usuarios) {
            resultado = resultado + usuario.getNome() + "  |  Cpf: " 
                            + usuario.getCpf() + "\n";
        }
        return resultado;
    }
    
}