package PraticandoCurso2modulo2;


public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void desconto(){
        if(nome == "Amaciante"){
            double desconto = preco * 0.3 ;
            double total = preco - desconto;
            System.out.println("Nome do produto: ");
            System.out.println(nome);
            System.out.println("Desconto de 30%: ");
            System.out.println(desconto);
            System.out.println("Preço a pagar: " + total);
        }else {
            System.out.println("Nome do produto: ");
            System.out.println(nome);
            System.out.println("Preço a pagar: " + preco);
        }
    }
}
