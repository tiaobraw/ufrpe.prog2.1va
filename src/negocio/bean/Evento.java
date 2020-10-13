package negocio.bean;

import java.util.Date;

public class Evento {
	
	private String id;
	private Pessoa owner;
	private Date data;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Pessoa getOwner() {
		return owner;
	}

	public void setOwner(Pessoa owner) {
		this.owner = owner;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
