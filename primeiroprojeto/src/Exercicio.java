public class Exercicio {
    public static void main(String[] args) {
        double temperatura = 26.0;
        double CelsiusParaFahren = (temperatura * 1.8) + 32;
        System.out.println(String.format("A temperatura de %f Celsius é equivalente a %f Fahranheit", temperatura, CelsiusParaFahren));
        int temperaturaFahrenheitInteira = (int) temperatura;
        System.out.println("A temperatura em Fahrenheite inteira é " + temperaturaFahrenheitInteira);
    }
}
