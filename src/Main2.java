public class Main2 {
    public static void main(String[] args){
        Empleado empl1 = new Empleado("David",210);
        Gerente ger1 = new Gerente("Alexis",210.2,50.25);
        Desarrollador desa1 = new Desarrollador("Fernando",260.80,15);
        empl1.calcularSalario();
        ger1.calcularSalario();
        desa1.calcularSalario();

    }
}
