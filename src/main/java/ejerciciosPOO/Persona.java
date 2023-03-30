package ejerciciosPOO;

public class Persona {
    public String nombre;
    public String apellidos;
    public String dni;
    public int anyoNacimiento;
    private String apodo;

    public Persona(String nombre, String apellidos, String dni, int anyoNacimiento, String apodo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.anyoNacimiento = anyoNacimiento;
        this.apodo = apodo;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.apellidos = p.apellidos;
        this.dni = p.dni;
        this.anyoNacimiento = p.anyoNacimiento;
        this.apodo = p.apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getApodo() {
        return apodo;
    }

    @Override
    public String toString() {
        return "Persona:" +
                "nombre='" + nombre + '\'' +
                "apellidos='" + apellidos + '\'' +
                "dni='" + dni + '\'' +
                "anyoNacimiento=" + anyoNacimiento + '\'' +
                "apodo='" + apodo;
    }

    @Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.anyoNacimiento == p.anyoNacimiento
				&& this.apodo == p.apodo)
			return true;
		else
			return false;
	}


    @Override
	public Object clone() throws CloneNotSupportedException {
		Persona p = new Persona(this.nombre, this.apellidos, this.dni, this.anyoNacimiento, this.apodo);
		return p;
	}
    
    
}
