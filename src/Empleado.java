public class Empleado {
    public String nombre;
    public double salarioBase;
    public Empleado(String nombre, double salarioBase){
        this. nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public void calcularSalario(){
        System.out.println("El salario base de: "+nombre+" es de: "+salarioBase);
    }
}
class Gerente extends Empleado{
    public double Bonogerente;
    public double Salariototal;
    public Gerente(String nombre, double salarioBase, double Bonogerente){
        super(nombre,salarioBase);
        this. Bonogerente = Bonogerente;

    }
    @Override
    public void calcularSalario(){
        Salariototal = salarioBase + Bonogerente;
        System.out.println("El salario total del gerente: "+nombre+" es de: "+Salariototal);
    }
}
class Desarrollador extends Empleado{
    public int horasextras;
    public double Salariototal;
    public double calculosueldohoras;
    public Desarrollador(String nombre, double salarioBase, int horasextras){
        super(nombre,salarioBase);
        this.horasextras = horasextras;
    }
    @Override
    public void calcularSalario(){
        calculosueldohoras = horasextras * 1.50;
        Salariototal = salarioBase + calculosueldohoras;
        System.out.println("El salario del Desarrollador: "+nombre+" es de: "+Salariototal);
    }
}
