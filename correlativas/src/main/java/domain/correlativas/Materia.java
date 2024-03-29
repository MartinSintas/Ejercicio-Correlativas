package domain.correlativas;

import java.util.ArrayList;
import java.util.List;
public class Materia {
        private String nombre;
        private List<Materia> correlativas;

        public Materia(String nombre) {
            this.nombre = nombre;
            this.correlativas = new ArrayList<>();
        }

        public void agregarCorrelativa(Materia materia) {
            this.correlativas.add(materia);
        }

        public List<Materia> getCorrelativas() {
            return this.correlativas;
        }

        public String getNombre() {
            return this.nombre;
        }
    }

