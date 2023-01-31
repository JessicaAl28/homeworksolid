package modelo;

public class Estudiante {

    private String nombre;
    private String materias;
    
    public String getMaterias(){
        return materias;
    }

    public Estudiante(String nombre, String materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
