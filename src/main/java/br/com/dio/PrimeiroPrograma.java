package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        /*vou na aba VCS do inteliJ, selecione a opção enable version control integration e selecione Git,
        * vai de novo em VCS que a pós o repositório criado nome pode mudar para Git, e vocẽ pode selecionar a opção commit ou
        * pressionar ctrl + K.
        * E na parte de commit message coloque a mensagem do seu commit,
        * e clique em Commit and Push*/

        //Para refatorar o código, colocá-lo na indentação correta pressione ctrl + Alt + L
        //Para apagar a linha usamos ctrl + Y

        //Para refatora o nome da classe clique sobre ela
        // e pressione Shift + f6

        //Para colocar só o editor de texto amostra pressione Shift + F12

        //Para comentar um bloco selecione o bloco e pressione ctrl + Shift + /


        //Ou podemos selecionar o bloco de código ctrl + / para comentar as linhas
        // desse código com // em cada linha
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}// fim da classe Primeiroprograma

class Livro{

    private String nome;
    private Integer numPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}