package dados;

import java.util.ArrayList;

import negocio.bean.Evento;

public class RepositorioEventos {
	
	private ArrayList<Evento> eventos;
	//private int proxima;
	
	public RepositorioEventos() {
		this.eventos = new ArrayList<>();
	//	this.proxima = 0;
	}
	
    public boolean addEvento(Evento evento) {
        boolean resultado = false;
        if (evento != null) {
            String id = evento.getId();
            boolean existeEventoComIdIgual = false;
            for (Evento interna : eventos) {
                if (interna.getId().equals(id)) {
                	existeEventoComIdIgual = true;
                }
            }
            if (!existeEventoComIdIgual) {
                this.eventos.add(evento);
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean removerEvento(String id) {
        boolean idExiste = false;
        int i;
        for (i = 0; i < this.eventos.size() && !idExiste; i++) {
            Evento evento = this.eventos.get(i);
            if (evento.getId().equals(id)) {
            	idExiste = true;
            }
        }
        if (idExiste) {
            this.eventos.remove(i-1);
        }
        return idExiste;
    }
    
    public Evento procurarEvento(String id) {
    	//int i = 0;
    	//boolean achou = false;
    	//while (!achou) { 
    	//}
    	Evento resultado = null;
    	return resultado;
    }
    
    public String toString() {
    	String resultado = "";
        for (Evento evento : this.eventos) {
            resultado = resultado + evento.getId() + "  |  Comentario: "
                			+ "\n";
        }
        return resultado;
    }
    
    
    
}