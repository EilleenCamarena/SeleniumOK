package modelo;

import java.time.LocalDate;

public class ListaTarea {
    private String nombre;
    private final LocalDate fechaCreacion;

    {
        fechaCreacion = LocalDate.now();
    }

    public ListaTarea(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
