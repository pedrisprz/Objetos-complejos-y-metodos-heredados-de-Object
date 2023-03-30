package ejerciciosPOO;

public class Empleado {
	public int idEmpleado;
	private String departamento;
	private Persona persona;
	
	
	public Empleado(int idEmpleado, String departamento, Persona persona) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
		this.persona = persona;
	}
	
	public Empleado(Empleado e) {
		this.idEmpleado = e.idEmpleado;
		this.departamento = e.departamento;
		this.persona = e.persona;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	@Override
	public String toString() {
		return "Empleado:" +
		"idEmpleado=" + idEmpleado + "\'" + 
		"departamento=" + departamento + "\'" + 
		"persona=" + persona;
	}
	@Override
	public boolean equals(Object obj) {
		Empleado e = (Empleado) obj;
		return(this.idEmpleado==e.idEmpleado && this.departamento == e.departamento && this.persona== e.persona);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Empleado e = new Empleado(this.idEmpleado,this.departamento,this.persona);
		return e;
	}
	
	
}
