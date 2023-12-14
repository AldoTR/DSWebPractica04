
package Interfaces;

import Modelo.Persona;
import java.util.List;

public interface CRUD {
    public List listar();
    public Persona list(String id);
    boolean add(Persona per);
    boolean edit(Persona per);
    boolean eliminar(String id);
}