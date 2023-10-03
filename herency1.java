// Clase padre
class Producto {
    String marca;
    String modelo;
    double precio;

    public Producto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
}

// Subclase Televisores
class Televisor extends Producto {
    double tamanoPantalla;

    public Televisor(String marca, String modelo, double precio, double tamanoPantalla) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
    }
}

// Subclase Laptops
class Laptop extends Producto {
    int capacidadAlmacenamiento;

    public Laptop(String marca, String modelo, double precio, int capacidadAlmacenamiento) {
        super(marca, modelo, precio);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
}

// Subclase Smartphones
class Smartphone extends Producto {
    int capacidadBateria;  // en mAh
    String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, int capacidadBateria, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.capacidadBateria = capacidadBateria;
        this.sistemaOperativo = sistemaOperativo;
    }
}
