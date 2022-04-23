
package escuela;

public class Estudiante {
    private String id;
    private String nombre;
    private String curso;
    private String especialidad;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String curso, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.especialidad = especialidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Estudiante" + "id=" + id + ", nombre=" + nombre + ", curso=" + curso + ", especialidad=" + especialidad;
    }
    
}
