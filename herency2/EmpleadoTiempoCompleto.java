package herency2;

class EmpleadoTiempoCompleto extends Empleado {
    double salario;
    String departamento;
    int horasTrabajo;
    String beneficios;
    
    public EmpleadoTiempoCompleto(String nombre, String area, String telefonoContacto, 
                                  String telefonoEmergencia, double salario, String departamento, 
                                  int horasTrabajo, String beneficios) {
        super(nombre, area, telefonoContacto, telefonoEmergencia);
        this.salario = salario;
        this.departamento = departamento;
        this.horasTrabajo = horasTrabajo;
        this.beneficios = beneficios;
    }
    
    public void generarInforme() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + area);
        System.out.println("Telefono de contacto: " + telefonoContacto);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas de trabajo: " + horasTrabajo);
        System.out.println("Beneficios: " + beneficios);
    }
}
