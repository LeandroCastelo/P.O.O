package p01_projetopraia_ads_noite;

public class P01_ProjetoPraia_ADS_Noite {

    public static void main(String[] args) {
//Criar um objeto da classe Crianca
        Crianca c1;
        c1 = new Crianca();
        c1.imprimirAtributos();
        c1.altura = 1.2;
        c1.corCabelo = "Ruivo";
        c1.corPele = "Branca";
        c1.idade = 4;
        c1.imprimirAtributos();
// Chamada dos métodos da classe Crianca:
        System.out.println("---------------");
        c1.nadar(1.1);
        c1.correr(0.9);
        c1.brincar();
        String sorriso = c1.sorrir();
        System.out.println(sorriso);
        System.out.println("---------------");
    } //Fim do main
} // Fim da classe
