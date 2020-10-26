import java.util.Scanner;
public class todoJunto {
 
    /* Funcion para generar un valor aleatorio en los dados */
    public static int randomDados() {
        /* Random para generar los numeros de ambos dados */
        int dado1 = (int) Math.floor(Math.random() * 6) + 1;
        int dado2 = (int) Math.floor(Math.random() * 6) + 1;
 
        /* Mostramos por pantalla que ha salido en los dados */
        System.out.println("El dado 1 ha sacado: " + dado1);
        System.out.println("El dado 2 ha sacado: " + dado2);
 
        /* Mostramos por pantalla la suma de los dados */
        int sumaDados = (dado1 + dado2);
        System.out.println("\nLa suma total es: " + sumaDados);
 
        /* Devolvemos la suma de los dados */
        return sumaDados;
    }
 
    public static void rellenarArrayA0(int matriz[][]) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                    matriz[x][y] = 0;
            }
        }
    }
    
    public static boolean mostrarInfoJugadores(int matriz[][], int jugador) {
        boolean ganador = false;
        System.out.println("Puntuacion del jugador "+ jugador);
        for (int y = 0; y<4; y++){
            if (y == 0){
                System.out.println();
                System.out.println("Tu puntuacion en informatica es: " + matriz[jugador][y]);
                //Salta a la funcion quesito si cumple la condicion
                if (matriz[jugador][y] == 4){
                    System.out.println("Quesito!");
                    preguntaQuesitoInformatica();
                }
            }
            else if (y == 1){
                System.out.println("Tu puntuacion historia es: " + matriz[jugador][y]);
                //Salta a la funcion quesito si cumple la condicion
                if (matriz[jugador][y] == 4){
                    System.out.println("Quesito!");
                    preguntaQuesitoHistoria();
                }
            }
            else if (y == 2){
                System.out.println("Tu puntuacion en geografia es: " + matriz[jugador][y]);
                //Salta a la funcion quesito si cumple la condicion
                if (matriz[jugador][y] == 4){
                    System.out.println("Quesito!");
                    preguntaQuesitoGeografia();
                }
            }
            else{
                System.out.println("Tu puntuacion en deportes es: " + matriz[jugador][y]);
                //Salta a la funcion quesito si cumple la condicion
                if (matriz[jugador][y] == 4){
                    System.out.println("Quesito!");
                    preguntaQuesitoDeporte();
                }
            }
            //Si el jugador tiene su fila a 5 todas. Gana y se acaba el programa.
            if(matriz[jugador][0] == 5 && matriz[jugador][1] == 5 && matriz[jugador][2] == 5 && matriz[jugador][3] == 5){
                System.out.println("Has ganado!");
                ganador = true;
            }
        }
        System.out.println();
        return ganador;
    }

    //Funcion de pregunta de los 4 temas. Devuelve un INT.
    public static int preguntaGeografia() {
        Scanner tecl = new Scanner(System.in);
        String geografia [] [] = {
            {"¿Que barrio de Nueva York acoge el teatro Apolo y da nombre al rio que separa el Bronx de Manhattan?","HARLEM",
            "Bronx","Broklin","Harvar"},
            {"¿Cual es el punto natural mas bajo de la Tierra?","EL ABISMO DE CHALLENGER","El valle de la muerte","el mar muerto",
            "Valle de los caidos"},
            {"¿Que tres provincias andaluzas lindan con el parque de Doñana?","SEVILLA, CADIZ Y HUELVA","Sevilla, Malaga y Granada",
            "Sevilla, Huelva y Malaga","Malaga, Jaen y Granada"},
            {"En que pais ciudad esta el centro comercial mas grande del mundo?","CHINA","Rusia","Estados Unidos","España"},
            {"Cual de las siete maravillas del mundo antiguo es la unica que perdura?","LAS PIRAMIDES DE GIZA","Faro de alejandria",
            "jardines flotantes","Coloso de rodas"}};
        //Random de las preguntas y el orden en que se muestran
        int orden=(int)Math.floor(Math.random()*5+1);
        int escogerPreguta=(int)Math.floor(Math.random()*4+1);
        if (orden==1){
            System.out.println(geografia[escogerPreguta][0]);
            System.out.println("1. "+geografia[escogerPreguta][1]);
            System.out.println("2. "+geografia[escogerPreguta][2]);
            System.out.println("3. "+geografia[escogerPreguta][3]);
            System.out.println("4. "+geografia[escogerPreguta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            //Si cumple la condicion devuelve un 1 para sumarse en la matriz del jugador
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
 
        else if (orden==2){
            System.out.println(geografia[escogerPreguta][0]);
            System.out.println("1. "+geografia[escogerPreguta][4]);
            System.out.println("2. "+geografia[escogerPreguta][3]);
            System.out.println("3. "+geografia[escogerPreguta][2]);
            System.out.println("4. "+geografia[escogerPreguta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
        
        else if (orden==3){
            System.out.println(geografia[escogerPreguta][0]);
            System.out.println("1. "+geografia[escogerPreguta][1]);
            System.out.println("2. "+geografia[escogerPreguta][3]);
            System.out.println("3. "+geografia[escogerPreguta][2]);
            System.out.println("4. "+geografia[escogerPreguta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
 
        else if (orden==4){
            System.out.println(geografia[escogerPreguta][0]);
            System.out.println("1. "+geografia[escogerPreguta][2]);
            System.out.println("2. "+geografia[escogerPreguta][3]);
            System.out.println("3. "+geografia[escogerPreguta][4]);
            System.out.println("4. "+geografia[escogerPreguta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
        //Si no acierta devuelve un 0
        return 0;
    }

    public static int preguntaHistoria(){
        Scanner tecl = new Scanner(System.in);
        String historia [] [] = {
            {"En que año se inicio la invasion arabe de la peninsula Iberica?","711","1492","930","1212"},
            {"En el año 2004 sucedio una de las mayores catastrofes naturales de la historia.Cual fue el fenomeo natural, y donde se produjo","TSUNAMI EN INDONESIA","Terremoto en España","erupcion en Hawaii",
             "Tornado en Filadelfia"},
            {"Que papa salio elegido tras el primer cónclave del tercer milenio?","BENEDICTO XVI","Pablo VI","Pio XI","Juan XIII"},
            {"A que físico, conocido por su teoría de la gravedad, homajeó la NASA enviando un trozo de su manzana al espacion en 2010?",
             "ISAAC NEWTON","Albert Einstein","Nikola Tesla","Werner Heisenberg"},
            {"En que siglo introdujo la imprenta de Guterberg el tipo movible, que hizo posible la comunicación de masas?","15","17","14","12"}};
 
        int orden=(int)Math.floor(Math.random()*5+1);
        int escogerPreguta=(int)Math.floor(Math.random()*4+1);
        if (orden==1){
            System.out.println(historia[escogerPreguta][0]);
            System.out.println("1. "+historia[escogerPreguta][1]);
            System.out.println("2. "+historia[escogerPreguta][2]);
            System.out.println("3. "+historia[escogerPreguta][3]);
            System.out.println("4. "+historia[escogerPreguta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
 
        else if (orden==2){
            System.out.println(historia[escogerPreguta][0]);
            System.out.println("1. "+historia[escogerPreguta][4]);
            System.out.println("2. "+historia[escogerPreguta][3]);
            System.out.println("3. "+historia[escogerPreguta][2]);
            System.out.println("4. "+historia[escogerPreguta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
        
        else if (orden==3){
            System.out.println(historia[escogerPreguta][0]);
            System.out.println("1. "+historia[escogerPreguta][1]);
            System.out.println("2. "+historia[escogerPreguta][3]);
            System.out.println("3. "+historia[escogerPreguta][2]);
            System.out.println("4. "+historia[escogerPreguta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
 
        else if (orden==4){
            System.out.println(historia[escogerPreguta][0]);
            System.out.println("1. "+historia[escogerPreguta][2]);
            System.out.println("2. "+historia[escogerPreguta][3]);
            System.out.println("3. "+historia[escogerPreguta][4]);
            System.out.println("4. "+historia[escogerPreguta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
        }
        return 0;
    }
 
 
    public static int preguntaDeporte(){
        Scanner tecl = new Scanner(System.in);
        String deporte [] [] = {
            {"Las 16 plumas de un volante de bádminton se cogen solamente del ala izquiera de un ganso?","SI","No solo de la derecha",
             "Mitad y mitad","Solo las que sean mas largas"},
            {"Qué profesión tenía el ganador de los primeros Juegos Olimpicos registrados, celebrados en el 776a.C en la Antigua Grecia","COCINERO"
             ,"Soldado","Actor","Pintor"},
            {"Que videojuego retiró de la App Store de IOS en 2014 su creador, Dong Nguyen, tras verse abrumado por su enorme exito?","Flappy Bird"
             ,"Clash of Clans","Pou","Angry Birds"},
            {"Que árbitro, considerado el mejor de la historia, apareció en la portada del videojuego Pro Evolution Soccer 3?","PIERLUIGI COLLINA",
             "Alberto Undiano","Antonio Mateu Lahoz","Manuel Diaz Vega"}};
 
             int orden=(int)Math.floor(Math.random()*5+1);
             int escogerPreguta=(int)Math.floor(Math.random()*4+1);
             if (orden==1){
                System.out.println(deporte[escogerPreguta][0]);
                 System.out.println("1. "+deporte[escogerPreguta][1]);
                 System.out.println("2. "+deporte[escogerPreguta][2]);
                 System.out.println("3. "+deporte[escogerPreguta][3]);
                 System.out.println("4. "+deporte[escogerPreguta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
     
             else if (orden==2){
                System.out.println(deporte[escogerPreguta][0]);
                 System.out.println("1. "+deporte[escogerPreguta][4]);
                 System.out.println("2. "+deporte[escogerPreguta][3]);
                 System.out.println("3. "+deporte[escogerPreguta][2]);
                 System.out.println("4. "+deporte[escogerPreguta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
             
             else if (orden==3){
                System.out.println(deporte[escogerPreguta][0]);
                 System.out.println("1. "+deporte[escogerPreguta][1]);
                 System.out.println("2. "+deporte[escogerPreguta][3]);
                 System.out.println("3. "+deporte[escogerPreguta][2]);
                 System.out.println("4. "+deporte[escogerPreguta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
     
             else if (orden==4){
                System.out.println(deporte[escogerPreguta][0]);
                 System.out.println("1. "+deporte[escogerPreguta][2]);
                 System.out.println("2. "+deporte[escogerPreguta][3]);
                 System.out.println("3. "+deporte[escogerPreguta][4]);
                 System.out.println("4. "+deporte[escogerPreguta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
             return 0;
    }
 
    public static int preguntaInformatica(){
        Scanner tecl = new Scanner(System.in);
        String informatica [] [] = {
            {"Quien diseño la arquitectura de los ordenadores actuales?","JOHN VON NEUMANN","Leonardo Da Vinci","Benjamin Franklin","Auguste Lumiere"},
            {"Que distribuidora de sistema operativo es gratis", "LINUX","Windows","MAC","Ninguna de las anteriores"},
            {"Que sistema opertaivo no es gratis","TODAS TIENEN UNA DE PAGO","Windows","MAC","Linux"},
            {"Quien invento el first personal computer?","HONRAD ZUSE","Steve Jobs", "Bill Gates","Charles Ranlett Flint"},
            {"Quien es el inventor de la marca calidad precio economica XAIOMI?","8 chinos","Saturo Tukoko","Tutose Mufuerte",
             "Dr. Tepalpa Podentro"}};
             int orden=(int)Math.floor(Math.random()*5+1);
             int escogerPreguta=(int)Math.floor(Math.random()*4+1);
             if (orden==1){
                System.out.println(informatica[escogerPreguta][0]);
                 System.out.println("1. "+informatica[escogerPreguta][1]);
                 System.out.println("2. "+informatica[escogerPreguta][2]);
                 System.out.println("3. "+informatica[escogerPreguta][3]);
                 System.out.println("4. "+informatica[escogerPreguta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
     
             else if (orden==2){
                System.out.println(informatica[escogerPreguta][0]);
                 System.out.println("1. "+informatica[escogerPreguta][4]);
                 System.out.println("2. "+informatica[escogerPreguta][3]);
                 System.out.println("3. "+informatica[escogerPreguta][2]);
                 System.out.println("4. "+informatica[escogerPreguta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
             
             else if (orden==3){
                System.out.println(informatica[escogerPreguta][0]);
                 System.out.println("1. "+informatica[escogerPreguta][1]);
                 System.out.println("2. "+informatica[escogerPreguta][3]);
                 System.out.println("3. "+informatica[escogerPreguta][2]);
                 System.out.println("4. "+informatica[escogerPreguta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
     
             else if (orden==4){
                System.out.println(informatica[escogerPreguta][0]);
                 System.out.println("1. "+informatica[escogerPreguta][2]);
                 System.out.println("2. "+informatica[escogerPreguta][3]);
                 System.out.println("3. "+informatica[escogerPreguta][4]);
                 System.out.println("4. "+informatica[escogerPreguta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
             }
             return 0;
    }

    //Funcion de la pregunta quesito de los 4 temas. Devuelve un INT.
    public static int preguntaQuesitoGeografia(){
        Scanner tecl = new Scanner(System.in);
        String quesitoGeogra [] [] = {
            {"Cuales son provincias de Cataluña?","BARCELONA, GIRONA, TARRAGONA Y LLEIDA","Cataluña es un pais","Barcelona y Girona","Lleida"},
            {"Capital de Francia?","PARIS","Normandia","Lleida","Murcia"}};

            //Random de la pregunta y el orden en que se mostraran
            int orden=(int)Math.floor(Math.random()*2+1);
            int escogerPreguta=(int)Math.floor(Math.random()*2+1);

            if (orden==1){
                System.out.println(quesitoGeogra[escogerPreguta][0]);
                System.out.println("1. "+quesitoGeogra[escogerPreguta][1]);
                System.out.println("2. "+quesitoGeogra[escogerPreguta][2]);
                System.out.println("3. "+quesitoGeogra[escogerPreguta][3]);
                System.out.println("4. "+quesitoGeogra[escogerPreguta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                //Si cumple la condicion devolvera un 1 a la matriz del jugador
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }

            else if (orden==2){
                System.out.println(quesitoGeogra[escogerPreguta][0]);
                System.out.println("1. "+quesitoGeogra[escogerPreguta][4]);
                System.out.println("2. "+quesitoGeogra[escogerPreguta][3]);
                System.out.println("3. "+quesitoGeogra[escogerPreguta][2]);
                System.out.println("4. "+quesitoGeogra[escogerPreguta][1]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==4){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            return 0;

    }

    public static int preguntaQuesitoDeporte(){
        Scanner tecl = new Scanner(System.in);
        String quesitoDeporte [] [] = {
            {"Quien marco el gol que dio a España su ultimo mundial? ","ANDRES INIESTA","David Villa","Iker Casillas","Gerard Pique"},
            {"En que año gano España su ultimo mundial? ","2010","2001","2007","Nunca a ganado"}};

            int orden=(int)Math.floor(Math.random()*2+1);
            int escogerPreguta=(int)Math.floor(Math.random()*2+1);

            if (orden==1){
                System.out.println(quesitoDeporte[escogerPreguta][0]);
                System.out.println("1. "+quesitoDeporte[escogerPreguta][1]);
                System.out.println("2. "+quesitoDeporte[escogerPreguta][2]);
                System.out.println("3. "+quesitoDeporte[escogerPreguta][3]);
                System.out.println("4. "+quesitoDeporte[escogerPreguta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }

            else if (orden==2){
                System.out.println(quesitoDeporte[escogerPreguta][0]);
                System.out.println("1. "+quesitoDeporte[escogerPreguta][4]);
                System.out.println("2. "+quesitoDeporte[escogerPreguta][3]);
                System.out.println("3. "+quesitoDeporte[escogerPreguta][2]);
                System.out.println("4. "+quesitoDeporte[escogerPreguta][1]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==4){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            return 0;

    }

    public static int preguntaQuesitoHistoria(){
        Scanner tecl = new Scanner(System.in);
        String quesitoHistoria [] [] = {
            {"En que año fue la reconquista de España? ","711","890","702","Segimos con ello"},
            {"Que lider atrabeso los pirineos con sus elefantes? ","ANIBAL","Galileo","Aristoteles","Julio Verne"}};

            int orden=(int)Math.floor(Math.random()*2+1);
            int escogerPreguta=(int)Math.floor(Math.random()*2+1);

            if (orden==1){
                System.out.println(quesitoHistoria[escogerPreguta][0]);
                System.out.println("1. "+quesitoHistoria[escogerPreguta][1]);
                System.out.println("2. "+quesitoHistoria[escogerPreguta][2]);
                System.out.println("3. "+quesitoHistoria[escogerPreguta][3]);
                System.out.println("4. "+quesitoHistoria[escogerPreguta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }

            else if (orden==2){
                System.out.println(quesitoHistoria[escogerPreguta][0]);
                System.out.println("1. "+quesitoHistoria[escogerPreguta][4]);
                System.out.println("2. "+quesitoHistoria[escogerPreguta][3]);
                System.out.println("3. "+quesitoHistoria[escogerPreguta][2]);
                System.out.println("4. "+quesitoHistoria[escogerPreguta][1]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==4){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            return 0;
    }

    public static int preguntaQuesitoInformatica(){
        Scanner tecl = new Scanner (System.in);
        String quesitoInformatica [] [] = {
            {"Que es la SGBD? ","SISTEMA GESTOR DE BASE DE DATOS","software grande base dada","Si grito beberas un dado","no significa nada"},
            {"Cual es el ultimo modelo de Iphone? ","11 PRO MAX","X Pro MAX","7Xs","9 Pro Ultra X"}};

            int orden=(int)Math.floor(Math.random()*2+1);
            int escogerPreguta=(int)Math.floor(Math.random()*2+1);

            if (orden==1){
                System.out.println(quesitoInformatica[escogerPreguta][0]);
                System.out.println("1. "+quesitoInformatica[escogerPreguta][1]);
                System.out.println("2. "+quesitoInformatica[escogerPreguta][2]);
                System.out.println("3. "+quesitoInformatica[escogerPreguta][3]);
                System.out.println("4. "+quesitoInformatica[escogerPreguta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            
            else if (orden==2){
                System.out.println(quesitoInformatica[escogerPreguta][0]);
                System.out.println("1. "+quesitoInformatica[escogerPreguta][4]);
                System.out.println("2. "+quesitoInformatica[escogerPreguta][3]);
                System.out.println("3. "+quesitoInformatica[escogerPreguta][2]);
                System.out.println("4. "+quesitoInformatica[escogerPreguta][1]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==4){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            return 0;
    }
 
    //Suma el resultado que devuelva la funcion de pregunta.//
    public static void sumarArrayResultado(int matriz[][], int jugador, int categoria) {
        if(categoria == 0){
            matriz[jugador][categoria] += preguntaInformatica();
        }
        else if(categoria == 1){
            matriz[jugador][categoria] += preguntaHistoria();
        }
        else if(categoria == 2){
            matriz[jugador][categoria] += preguntaGeografia();
        }
        else{
            matriz[jugador][categoria] += preguntaDeporte();
        }
    }
        
    //Inicio del juego//
    public static void main(String[] args) {
        int [][] infoPlayer = new int [4][4];
        int jugador = 0;
        boolean winner = false;
        rellenarArrayA0(infoPlayer);
        while (winner == false){
            int categoria=(int)Math.floor(Math.random()*4);
            sumarArrayResultado(infoPlayer, jugador, categoria);    
            mostrarInfoJugadores(infoPlayer, jugador);
            categoria++;    
            jugador++; 
            if(jugador == 4){
                jugador = 0;
            }
            if(categoria == 4){
                categoria = 0;
            }    
        }
 
    }
}
