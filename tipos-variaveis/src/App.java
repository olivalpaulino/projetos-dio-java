public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Olival Paulino";
        byte idade = 28;
        final short ano_nascimento = 1993;
        int cep = 57603130;
        final long cpf = 00011122233L;
        float peso = 65F;
        float altura = 1.68F;
        double salario = 5280.00;

        System.out.println("O colaborador ".concat(nome).concat(" - Possui ").concat(Integer.toString(idade).concat(" anos, nascido em: ").concat(Short.toString((ano_nascimento)))));
        System.out.println("Mora na rua de cep: ".concat(Integer.toString(cep)).concat(". Pesando ").concat(Float.toString(peso)).concat(" kg e possui ").concat(Float.toString(altura)).concat(" de altura."));
        System.out.println("O salário desejado atualmente é: ".concat(Double.toString(salario)));
    }
}
