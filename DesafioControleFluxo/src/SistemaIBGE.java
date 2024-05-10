public class SistemaIBGE {
    public static void main(String[] args) {

        for (EsradoBrasileiro e : EsradoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EsradoBrasileiro eb = EsradoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome());
    }
}
