package herency1;

class Televisor extends Producto {
    double tamanoPantalla;

    public Televisor(String marca, String modelo, double precio, double tamanoPantalla) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
    }
}