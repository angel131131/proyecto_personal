import java.util.Scanner;
public class preguntas{
    public static int preguntaGeografia() {
        Scanner tecl = new Scanner (System.in);
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
        
        int orden=(int)Math.floor(Math.random()*4+1);
        int escojerPregunta=(int)Math.floor(Math.random()*5+1);
        if (orden==1){
            System.out.println("1. "+geografia[escojerPregunta][1]);
            System.out.println("2. "+geografia[escojerPregunta][2]);
            System.out.println("3. "+geografia[escojerPregunta][3]);
            System.out.println("4. "+geografia[escojerPregunta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }

        else if (orden==2){
            System.out.println("1. "+geografia[escojerPregunta][4]);
            System.out.println("2. "+geografia[escojerPregunta][3]);
            System.out.println("3. "+geografia[escojerPregunta][2]);
            System.out.println("4. "+geografia[escojerPregunta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }
        
        else if (orden==3){
            System.out.println("1. "+geografia[escojerPregunta][1]);
            System.out.println("2. "+geografia[escojerPregunta][3]);
            System.out.println("3. "+geografia[escojerPregunta][2]);
            System.out.println("4. "+geografia[escojerPregunta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }

        else if (orden==4){
            System.out.println("1. "+geografia[escojerPregunta][2]);
            System.out.println("2. "+geografia[escojerPregunta][3]);
            System.out.println("3. "+geografia[escojerPregunta][4]);
            System.out.println("4. "+geografia[escojerPregunta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }
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

        int orden=(int)Math.floor(Math.random()*4+1);
        int escojerPregunta=(int)Math.floor(Math.random()*5+1);
        if (orden==1){
            System.out.println("1. "+historia[escojerPregunta][1]);
            System.out.println("2. "+historia[escojerPregunta][2]);
            System.out.println("3. "+historia[escojerPregunta][3]);
            System.out.println("4. "+historia[escojerPregunta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }

        else if (orden==2){
            System.out.println("1. "+historia[escojerPregunta][4]);
            System.out.println("2. "+historia[escojerPregunta][3]);
            System.out.println("3. "+historia[escojerPregunta][2]);
            System.out.println("4. "+historia[escojerPregunta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }
        
        else if (orden==3){
            System.out.println("1. "+historia[escojerPregunta][1]);
            System.out.println("2. "+historia[escojerPregunta][3]);
            System.out.println("3. "+historia[escojerPregunta][2]);
            System.out.println("4. "+historia[escojerPregunta][4]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==1){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }

        else if (orden==4){
            System.out.println("1. "+historia[escojerPregunta][2]);
            System.out.println("2. "+historia[escojerPregunta][3]);
            System.out.println("3. "+historia[escojerPregunta][4]);
            System.out.println("4. "+historia[escojerPregunta][1]);
            System.out.println("Respuesta correcta por numero: ");
            int respuestaCorrecta=tecl.nextInt();
            if (respuestaCorrecta==4){
                System.out.println("Respuesta correcta");
                return 1;
            }
            return 0;
        }
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

             int orden=(int)Math.floor(Math.random()*4+1);
             int escojerPregunta=(int)Math.floor(Math.random()*5+1);
             if (orden==1){
                 System.out.println("1. "+deporte[escojerPregunta][1]);
                 System.out.println("2. "+deporte[escojerPregunta][2]);
                 System.out.println("3. "+deporte[escojerPregunta][3]);
                 System.out.println("4. "+deporte[escojerPregunta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
     
             else if (orden==2){
                 System.out.println("1. "+deporte[escojerPregunta][4]);
                 System.out.println("2. "+deporte[escojerPregunta][3]);
                 System.out.println("3. "+deporte[escojerPregunta][2]);
                 System.out.println("4. "+deporte[escojerPregunta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
             
             else if (orden==3){
                 System.out.println("1. "+deporte[escojerPregunta][1]);
                 System.out.println("2. "+deporte[escojerPregunta][3]);
                 System.out.println("3. "+deporte[escojerPregunta][2]);
                 System.out.println("4. "+deporte[escojerPregunta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
     
             else if (orden==4){
                 System.out.println("1. "+deporte[escojerPregunta][2]);
                 System.out.println("2. "+deporte[escojerPregunta][3]);
                 System.out.println("3. "+deporte[escojerPregunta][4]);
                 System.out.println("4. "+deporte[escojerPregunta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
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
             int orden=(int)Math.floor(Math.random()*4+1);
             int escojerPregunta=(int)Math.floor(Math.random()*5+1);
             if (orden==1){
                 System.out.println("1. "+informatica[escojerPregunta][1]);
                 System.out.println("2. "+informatica[escojerPregunta][2]);
                 System.out.println("3. "+informatica[escojerPregunta][3]);
                 System.out.println("4. "+informatica[escojerPregunta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
     
             else if (orden==2){
                 System.out.println("1. "+informatica[escojerPregunta][4]);
                 System.out.println("2. "+informatica[escojerPregunta][3]);
                 System.out.println("3. "+informatica[escojerPregunta][2]);
                 System.out.println("4. "+informatica[escojerPregunta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
             
             else if (orden==3){
                 System.out.println("1. "+informatica[escojerPregunta][1]);
                 System.out.println("2. "+informatica[escojerPregunta][3]);
                 System.out.println("3. "+informatica[escojerPregunta][2]);
                 System.out.println("4. "+informatica[escojerPregunta][4]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==1){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
     
             else if (orden==4){
                 System.out.println("1. "+informatica[escojerPregunta][2]);
                 System.out.println("2. "+informatica[escojerPregunta][3]);
                 System.out.println("3. "+informatica[escojerPregunta][4]);
                 System.out.println("4. "+informatica[escojerPregunta][1]);
                 System.out.println("Respuesta correcta por numero: ");
                 int respuestaCorrecta=tecl.nextInt();
                 if (respuestaCorrecta==4){
                     System.out.println("Respuesta correcta");
                     return 1;
                 }
                 return 0;
             }
    }

    public static int preguntaQuesitoGeografia(){
        Scanner tecl = new Scanner(System.in);
        String quesitoGeogra [] [] = {
            {"Cuales son provincias de Cataluña?","BARCELONA, GIRONA, TARRAGONA Y LLEIDA","Cataluña es un pais","Barcelona y Girona","Lleida"},
            {"Capital de Francia?","PARIS","Normandia","Lleida","Murcia"}};
            int orden=(int)Math.floor(Math.random()*2+1);
            int escojerPregunta=(int)Math.floor(Math.random()*2+1);
            if (orden==1){
                System.out.println(quesitoGeogra[escojerPregunta][0]);
                System.out.println("1. "+quesitoGeogra[escojerPregunta][1]);
                System.out.println("2. "+quesitoGeogra[escojerPregunta][2]);
                System.out.println("3. "+quesitoGeogra[escojerPregunta][3]);
                System.out.println("4. "+quesitoGeogra[escojerPregunta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            else if (orden==2){
                System.out.println(quesitoGeogra[escojerPregunta][0]);
                System.out.println("1. "+quesitoGeogra[escojerPregunta][4]);
                System.out.println("2. "+quesitoGeogra[escojerPregunta][3]);
                System.out.println("3. "+quesitoGeogra[escojerPregunta][2]);
                System.out.println("4. "+quesitoGeogra[escojerPregunta][1]);
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
            int escojerPregunta=(int)Math.floor(Math.random()*2+1);
            if (orden==1){
                System.out.println(quesitoDeporte[escojerPregunta][0]);
                System.out.println("1. "+quesitoDeporte[escojerPregunta][1]);
                System.out.println("2. "+quesitoDeporte[escojerPregunta][2]);
                System.out.println("3. "+quesitoDeporte[escojerPregunta][3]);
                System.out.println("4. "+quesitoDeporte[escojerPregunta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            else if (orden==2){
                System.out.println(quesitoDeporte[escojerPregunta][0]);
                System.out.println("1. "+quesitoDeporte[escojerPregunta][4]);
                System.out.println("2. "+quesitoDeporte[escojerPregunta][3]);
                System.out.println("3. "+quesitoDeporte[escojerPregunta][2]);
                System.out.println("4. "+quesitoDeporte[escojerPregunta][1]);
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
            int escojerPregunta=(int)Math.floor(Math.random()*2+1);
            if (orden==1){
                System.out.println(quesitoHistoria[escojerPregunta][0]);
                System.out.println("1. "+quesitoHistoria[escojerPregunta][1]);
                System.out.println("2. "+quesitoHistoria[escojerPregunta][2]);
                System.out.println("3. "+quesitoHistoria[escojerPregunta][3]);
                System.out.println("4. "+quesitoHistoria[escojerPregunta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            else if (orden==2){
                System.out.println(quesitoHistoria[escojerPregunta][0]);
                System.out.println("1. "+quesitoHistoria[escojerPregunta][4]);
                System.out.println("2. "+quesitoHistoria[escojerPregunta][3]);
                System.out.println("3. "+quesitoHistoria[escojerPregunta][2]);
                System.out.println("4. "+quesitoHistoria[escojerPregunta][1]);
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
            int escojerPregunta=(int)Math.floor(Math.random()*2+1);
            if (orden==1){
                System.out.println(quesitoInformatica[escojerPregunta][0]);
                System.out.println("1. "+quesitoInformatica[escojerPregunta][1]);
                System.out.println("2. "+quesitoInformatica[escojerPregunta][2]);
                System.out.println("3. "+quesitoInformatica[escojerPregunta][3]);
                System.out.println("4. "+quesitoInformatica[escojerPregunta][4]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==1){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            else if (orden==2){
                System.out.println(quesitoInformatica[escojerPregunta][0]);
                System.out.println("1. "+quesitoInformatica[escojerPregunta][4]);
                System.out.println("2. "+quesitoInformatica[escojerPregunta][3]);
                System.out.println("3. "+quesitoInformatica[escojerPregunta][2]);
                System.out.println("4. "+quesitoInformatica[escojerPregunta][1]);
                System.out.print("Que respuesta es en numero: ");
                int respuestaCorrecta=tecl.nextInt();
                if (respuestaCorrecta==4){
                    System.out.println("Respuesta correcta");
                    return 1;
                }
            }
            return 0;
    }


    public static void main(String[] args) {
        
    }
}