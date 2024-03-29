package domain.correlativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
    public boolean aproboMateria(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

}
