package dados;

import java.util.ArrayList;
import negocio.Comentario;

public class RepositorioComentarios {
	
	private ArrayList<Comentario> comentarios;
	
	public RepositorioComentarios() {
		this.comentarios = new ArrayList<>();
	}
	
    public boolean addComentario(Comentario comentario) {
        boolean resultado = false;
        if (comentario != null) {
            String id = comentario.getId();
            boolean existeComentarioComIdIgual = false;
            for (Comentario interna : comentarios) {
                if (interna.getId().equals(id)) {
                	existeComentarioComIdIgual = true;
                }
            }
            if (!existeComentarioComIdIgual) {
                this.comentarios.add(comentario);
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean removerComentario(String id) {
        boolean idExiste = false;
        int i;
        for (i = 0; i < this.comentarios.size() && !idExiste; i++) {
            Comentario comentario = this.comentarios.get(i);
            if (comentario.getId().equals(id)) {
            	idExiste = true;
            }
        }
        if (idExiste) {
            this.comentarios.remove(i-1);
        }
        return idExiste;
    }
    
    public Comentario procurarComentarios(String id) {
    	//int i = 0;
    	//boolean achou = false;
    	//while (!achou) { 
    	//}
    	Comentario resultado = null;
    	return resultado;
    }
    
    public String toString() { 
        String resultado = "";
        for (Comentario comentario : this.comentarios) {
            resultado = resultado + comentario.getId() + "  |  Comentario: " 
                            + comentario.getComentario() + "  | Usuário: " 
                			+ comentario.getOwner().getNome() + "  | Data: "
        					+ comentario.getData() + "  | Data: "
                			+ "\n";
        }
        return resultado;
    }

}
