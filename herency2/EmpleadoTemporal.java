package herency2;

class EmpleadoTemporal extends Empleado {
    double salarioPorHora;
    int horasTrabajo;
    
    public EmpleadoTemporal(String nombre, String area, String telefonoContacto, 
                            String telefonoEmergencia, double salarioPorHora, int horasTrabajo) {
        super(nombre, area, telefonoContacto, telefonoEmergencia);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajo = horasTrabajo;
    }
    
    public void generarInforme() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + area);
        System.out.println("Telefono de contacto: " + telefonoContacto);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
        System.out.println("Salario por hora: " + salarioPorHora);
        System.out.println("Horas de trabajo: " + horasTrabajo);
    }
}