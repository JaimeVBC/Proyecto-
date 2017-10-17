import java.util.Scanner;
public class proyeXto{
  
//Comprueba que la hora est� entre 0-24 y los minutos entre 0-60
public static boolean horaValida(int hora, int minutos){
  if (hora>=0 && hora<24 && minutos>=0 && minutos<60){
    return false;
  } else {
    System.out.println("Error");
    return true;
  }
}

//Compara hora/minutos con el horario (10-14:30 y 17:30-21 en este ejemplo)
public static boolean horarioApertura(int hora, int minutos){
  if (hora<10 || hora>21 || (hora>15 && hora<17)){
    return false;
  } else if (hora==14){
    if (minutos>30){
      return false;
    } else {
      return true;
    }
  } else if (hora==17){
    if (minutos<30){
      return false;
    } else {
      return true;
    }
  } else {
    return true;
  }
}    

  public static void main (String[]args){
//Este scanner fuera de la funcion para que despues de comprobar si la hora/minutos son validos usemos los valores para comparar con el horario.
    int hora, minutos;
    Scanner dj=new Scanner(System.in);
//Lee hora y minutos y llama a la funci�n haste que tenga un valor valido  
    do {
      System.out.println("Introduce la hora");
      hora = dj.nextInt();
      System.out.println("Introduce los minutos");
      minutos = dj.nextInt();
    } while (horaValida(hora, minutos));
//Abierta/cerrada
    if (horarioApertura(hora, minutos)){
      System.out.println("�Qu� bien! La librer�a est� abierta");
    } else {
      System.out.println("Lo siento, la librer�a est� cerrada...FeelsBadMan");
    }
 }
}

    
    
    


  