// SUPER CLASE;

public abstract class Persona{ // INICIO CLASE PERSONA;

    // ESTADO: ATRIBUTOS;
    protected String nombre;
    protected String apellido;
    protected String dni;

    // COMPORTAMIENTO: CONSTRUCTORES - GETTERS Y SETTERS - MÉTODOS;
    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni){
this.nombre = nombre;
this.apellido = apellido;
this.dni = dni;
    }

    // GETTERS Y SETTERS;
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDni(){
        return this.dni;
    }


} // FIN CLASE PERSONA;