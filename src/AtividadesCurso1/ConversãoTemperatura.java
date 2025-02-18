package AtividadesCurso1;

public class ConversãoTemperatura {

    public static void main(String[] args){

        double tempCelsius = 37.3;
        double tempFahrenheit;
        int convertendo = (int) (tempCelsius * 1.8) + 32 ;
        tempFahrenheit = convertendo;
        String mensagem = String.format("A temperatura de %f celsius é equivalente a %f Fahrenheit",tempCelsius,tempFahrenheit);
        System.out.println(mensagem);

        int tempInteiraFahrenheit = (int) tempFahrenheit;
        System.out.println("A temperatura inteira em Fahrenheit é " + tempInteiraFahrenheit);
    }
}
