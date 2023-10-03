package herency2;

public class TestEmpleados {
    public static void main(String[] args) {
        // Crear un empleado de tiempo completo de prueba
        EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto("Juan", "Finanzas", "123-4567", "911", 5000.0, "Contabilidad", 40, "Seguro médico, Seguro de vida");
        empleadoTC.generarInforme();
        System.out.println("----------------------");  // Esto es solo para separar los informes

        // Crear un empleado de medio tiempo de prueba
        EmpleadoMedioTiempo empleadoMT = new EmpleadoMedioTiempo("Ana", "Marketing", "234-5678", "911", 2500.0, "Publicidad", 20);
        empleadoMT.generarInforme();
        System.out.println("----------------------");  // Esto es solo para separar los informes

        // Crear un empleado temporal de prueba
        EmpleadoTemporal empleadoTemp = new EmpleadoTemporal("Pedro", "Logística", "345-6789", "911", 15.0, 25);
        empleadoTemp.generarInforme();
    }
}