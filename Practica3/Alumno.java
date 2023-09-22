public class Alumno {
    public String nombre, carrera;
    public int matrícula, grado;
    public char grupo;
    public Tutor tutor = new Tutor();

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setMatrícula(int matrícula){
        this.matrícula = matrícula;
    }
    public void setGrado(int grado){
        this.grado = grado;
    }
    public void setGrupo(char grupo){
        this.grupo = grupo;
    }
    public Tutor getTutor(){
        return tutor;
    }
}
