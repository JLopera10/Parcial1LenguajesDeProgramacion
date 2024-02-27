public class Persona {

//    PILARES DE LA PROGRAMACION ORIENTADA A OBJETOS

//    ABSTRACCION: Se puede evidenciar en la clase "ObjetosDePersona", en la que
//    creamos multiples objetos de la misma clase Persona pero con atributos diferentes}

//    ENCAPSULAMIENTO: Se puede evidenciar en el hecho de que cada objeto de la clase persona
//    tiene sus propios atributos, y muchos de los metodos funcionan de acuerdo al valor del
//    atributo asignado a esa instancia en especifico

//    HERENCIA: No se evidencia explicitamente en codigo, ya que no estamos usando ningun tipo
//    de extend para generar clases hijas, pero se podria decir que cada instancia hereda los
//    atributos y metodos de la clase Persona

//    POLIMORFISMO: Se evidencia en los constructores, los cuales se encargan de la creacion de
//    cada instancia dependiendo de los parametros enviados desde la clase " ObjetosDePersona ",
//    en este caso, hay 2 constructores diferentes, uno para cuando la persona haga parte de la
//    institucion, y otro para cuando no lo hagan

    //DEFINICION DE ATRIBUTOS
    private String name;
    private int age;
    private int citizen_id;
    private String email;
    private String role;


    public Persona(String name, int age, int citizen_id, String email, String role) {
        //CONSTRUCTOR EN CASO DE QUE LA PERSONA TENGA UN ROL EN LA INSTITUCION (POLIMORFISMO)
        this.name = name;
        this.age = age;
        this.citizen_id = citizen_id;
        this.email = email;
        this.role = role;
    }

    public Persona(String name, int age, int citizen_id, String email) {
        //CONSTRUCTOR EN CASO DE QUE LA PERSONA NO TENGA UN ROL EN LA INSTITUCION (POLIMORFISMO)
        this.name = name;
        this.age = age;
        this.citizen_id = citizen_id;
        this.email = email;
    }

    public void imprimirInformacion() {
        //ESTE METODO SE ENCARGA DE IMPRIMIR TODA LA INFORMACION DE UN OBJETO DE LA CLASE PERSONA
        System.out.println(" ");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Cedula: " + getCitizen_Id());
        System.out.println("Email: " + getEmail());
        if (!(this.role == null)) {
            System.out.println("Rol En La Institucion: " + getRole());
        } else {
            System.out.println("Esta persona no hace parte de la institucion");
        }
    }

    public void realizarFuncion() {
        //ESTE METODO SE ENCARGA DE REALIZAR LA FUNCION ASIGNADA AL CARGO DE CADA OBJETO DE LA CLASE PERSONA
        System.out.println(" ");
        if (!(this.role == null)) {
            if (this.role.equalsIgnoreCase("estudiante")) {
                System.out.println(getName() + " estudia*");
            } else if (this.role.equalsIgnoreCase("docente")) {
                System.out.println(getName() + " enseña*");
            } else if (this.role.equalsIgnoreCase("administrativo")) {
                System.out.println(getName() + " administra*");
            }
        } else {
            System.out.println(getName() + " no hace nada*");
        }
    }

    public void golpearPersona(Persona dude) {
        //ESTE METODO SE ENCARGA DE IMPRIMIR UN MENSAJE PARA MOSTRAR QUE UN OBJETO DE LA CLASE PERSONA HA GOLPEADO A OTRO OBJETO DE LA CLASE
        System.out.println(" ");
        System.out.println(getName() + " golpea a " + dude.getName());
    }


    //GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCitizen_Id() {
        return citizen_id;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
