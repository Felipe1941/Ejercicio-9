public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.edad = 18;
        miCliente.nombre= "Shaiel";
        miCliente.telefono= 322441241;
        miCliente.credito = 400*0.5;
        System.out.println("persona: " + miCliente.nombre);
        System.out.println(miCliente.edad);
        System.out.println(miCliente.telefono);
        System.out.println(miCliente.credito);
        System.out.println("  ");


        Trabajador miTrabajador = new Trabajador();
        miTrabajador.edad= 25;
        miTrabajador.nombre= "Felipe";
        miTrabajador.telefono= 332424554;
        miTrabajador.Salario= 1000;
        System.out.println("Trabajador: " + miTrabajador.nombre);
        System.out.println(miTrabajador.edad);
        System.out.println(miTrabajador.telefono);
        System.out.println(miTrabajador.Salario + " "+ "euros");
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    int Salario;

    public void setSalario(int salario) {
        this.Salario = salario;
    }
}