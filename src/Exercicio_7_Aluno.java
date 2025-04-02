public class Exercicio_7_Aluno {
    String nome;
    int matricula;
    int nota1;
    int nota2;
    int nota3;

    public Exercicio_7_Aluno(String nome, int matricula, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private int calcularMedia(){

        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao(){
       double media = calcularMedia();

       if(media <= 7){
           return "Reprovado";

       }else {
           return "Aprovado";
       }
    }
}
