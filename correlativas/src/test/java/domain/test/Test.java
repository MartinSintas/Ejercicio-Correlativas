package domain.test;

import domain.correlativas.Alumno;
import domain.correlativas.Inscripcion;
import domain.correlativas.Materia;

import static junit.framework.Assert.assertTrue;

public class Test {
    //@Test
    public void testInscripcionAprobada() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        paradigmas.agregarCorrelativa(algoritmos);
        Materia diseno = new Materia("Diseño de Sistemas");
        diseno.agregarCorrelativa(paradigmas);

        Alumno juan = new Alumno("Juan");
        juan.aprobarMateria(algoritmos);
        juan.aprobarMateria(paradigmas);

        Inscripcion inscripcion = new Inscripcion(juan, diseno);
        assertTrue(inscripcion.aprobada());
    }

}
