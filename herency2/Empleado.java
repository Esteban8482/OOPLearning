package herency2;

class Empleado {
    String nombre;
    String area;
    String telefonoContacto;
    String telefonoEmergencia;
    
    public Empleado(String nombre, String area, String telefonoContacto, String telefonoEmergencia) {
        this.nombre = nombre;
        this.area = area;
        this.telefonoContacto = telefonoContacto;
        this.telefonoEmergencia = telefonoEmergencia;
    }
    
    public void consultarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + area);
        System.out.println("Telefono de contacto: " + telefonoContacto);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
    }
}