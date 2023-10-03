package herency1;

class Laptop extends Producto {
    int capacidadAlmacenamiento;

    public Laptop(String marca, String modelo, double precio, int capacidadAlmacenamiento) {
        super(marca, modelo, precio);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
}
