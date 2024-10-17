package ConversaoTipoPrimitivo;

public class MainConversaoTipoPrimitivo {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a);

        float b = (float) 2.5687;
        System.out.println(b);

        float c = 3.1234F;
        System.out.println(c);

        // Para converter para tipos primitivos de unidade menor,
        // Precisa fazer de maneira explicita para o JAVA entender que você está ciente da possível perca de informação.


        int d = 256;

        byte e = (byte) d;
        System.out.println(e);

    }
}
