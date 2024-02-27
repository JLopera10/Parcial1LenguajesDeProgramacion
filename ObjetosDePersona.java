public class ObjetosDePersona {
    public static void main(String[] args) {
        //CREACION DE OBJETOS (ABSTRACCION)
        Persona dude1 = new Persona("Juan", 18, 1022144846, "jmloperas@eafit.edu.co", "Docente" );
        Persona dude2 = new Persona("Mateo", 20, 1422626579, "teovasquez@gmail.com");
        Persona dude3 = new Persona("Isabela", 18, 1131552941, "isamendoza@eafit.edu.co", "Administrativo" );
        Persona dude4 = new Persona("Luis", 19, 1221256742, "luisanerio@eafit.edu.co", "Estudiante" );

        // IMPRESION DE LA INFORMACION DE CADA PERSONA
        System.out.println(" --------------- ");
        System.out.println("INFORMACION");
        dude1.imprimirInformacion();
        dude2.imprimirInformacion();
        dude3.imprimirInformacion();
        dude4.imprimirInformacion();
        System.out.println(" ");

        // CADA PERSONA REALIZA SU FUNCION
        System.out.println(" --------------- ");
        System.out.println("ACCIONES");
        dude2.realizarFuncion();
        dude3.realizarFuncion();
        dude1.realizarFuncion();
        dude4.realizarFuncion();
        System.out.println(" ");

        //LAS PERSONAS SE GOLPEAN ENTRE SI
        System.out.println(" --------------- ");
        System.out.println("GOLPES");
        dude2.golpearPersona(dude4);
        dude3.golpearPersona(dude1);
        dude4.golpearPersona(dude3);
        dude1.golpearPersona(dude2);
        System.out.println(" ");
    }
}
