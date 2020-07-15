
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Digite: Embarcar-(qtd), Abastecer-(qtd), Dirigir-(qtd):");

        while(true){

            String line = scanner.nextLine();
            String entrada[] = line.split(" ");

            if(entrada[0].equals("end")){
                break;
            }else if(entrada[0].equals("embarcar")){
                car.embarcar();
            }else if(entrada[0].equals("desembarcar")){
                car.desembarcar();
            }else if(entrada[0].equals("abastecer")){
                float combustivel = Float.parseFloat(entrada[1]);
                car.abastecer(combustivel);
            }else if(entrada[0].equals("dirigir")){
                float distancia = Float.parseFloat(entrada[1]);
                car.dirigir(distancia);
            }else{
                System.out.println("Comando invalido!");
            }
        }
        scanner.close();
    }
}