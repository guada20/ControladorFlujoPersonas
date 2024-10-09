package clasesFlujo;

public class Oficina extends seccion {
    public Oficina() {
        super("Oficinas", 50);
    }
}

class SalaReunion extends seccion {
    public SalaReunion() {
        super("Salas de Reunión", 15);
    }
}

class Cafeteria extends seccion {
    public Cafeteria() {
        super("Cafetería", 20);
    }
}