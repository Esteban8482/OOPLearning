package herency1;

class Smartphone extends Producto {
    int capacidadBateria;  // en mAh
    String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, int capacidadBateria, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.capacidadBateria = capacidadBateria;
        this.sistemaOperativo = sistemaOperativo;
    }
}