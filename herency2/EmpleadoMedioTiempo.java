package herency2;

class EmpleadoMedioTiempo extends Empleado {
    double salario;
    String departamento;
    int horasTrabajo;
    
    public EmpleadoMedioTiempo(String nombre, String area, String telefonoContacto, 
                               String telefonoEmergencia, double salario, String departamento, 
                               int horasTrabajo) {
        super(nombre, area, telefonoContacto, telefonoEmergencia);
        this.salario = salario;
        this.departamento = departamento;
        this.horasTrabajo = horasTrabajo;
    }
    
    public void generarInforme() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + area);
        System.out.println("Telefono de contacto: " + telefonoContacto);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas de trabajo: " + horasTrabajo);
    }
}