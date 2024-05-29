package GrupalJSP.Grupal6JSP.modelos.entity;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;



	@Entity
	@Table(name = "visitaterreno")
	public class Visitaterreno {

	    @Id
	    @Column(name = "id")
	    private int id;
	    private int rutCliente;
	    private String dia;
	    
		   
	    private String hora;
	    
	    
	    private String lugar;
	    
	   
	    private String comentarios;


	    public Visitaterreno() {
    	super(); // Constructor vacío
    }
	  	
	    	
	 
	    public Visitaterreno(int id, int rutCliente, String dia, String hora, String lugar, String comentarios) {
			
			this.id = id;
			this.rutCliente = rutCliente;
			this.dia = dia;
			this.hora = hora;
			this.lugar = lugar;
			this.comentarios = comentarios;
		}



		public int getRutCliente() {
			return rutCliente;
		}



		public void setRutCliente(int rutCliente) {
			this.rutCliente = rutCliente;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getDia() {
			return dia;
		}



		public void setDia(String dia) {
			this.dia = dia;
		}



		public String getHora() {
			return hora;
		}



		public void setHora(String hora) {
			this.hora = hora;
		}



		public String getLugar() {
			return lugar;
		}



		public void setLugar(String lugar) {
			this.lugar = lugar;
		}



		public String getComentarios() {
			return comentarios;
		}



		public void setComentarios(String comentarios) {
			this.comentarios = comentarios;
		}

		
	       
	    
	}