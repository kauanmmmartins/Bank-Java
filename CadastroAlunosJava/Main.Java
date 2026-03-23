import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos vc quer fazer o cadastro?");
        int tamanho = sc.nextInt();
        sc.nextLine();

        Alunos[] aluno = new Alunos[tamanho];

        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = new Alunos();

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            aluno[i].setNome(nome);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            aluno[i].setIdade(idade);

            System.out.print("Digite a nota final: ");
            double notaFinal = sc.nextDouble();
            aluno[i].setNotaFinal(notaFinal);

            sc.nextLine(); 
        }

        Alunos melhor = aluno[0];
        for (int i = 1; i < aluno.length; i++) {
            if (aluno[i].getNotaFinal() > melhor.getNotaFinal()) {
                melhor = aluno[i];
            }
        }

        System.out.println("\nMelhor aluno: " + melhor.getNome());
        double soma = 0;
        for (int i = 0; i < aluno.length; i++) {
            soma += aluno[i].getNotaFinal();
        }

        double media = soma / aluno.length;
        System.out.println("Média da turma: " + media);
        
        System.out.println("\nLista de Alunos:");
        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Nome: " + aluno[i].getNome());
            System.out.println("Idade: " + aluno[i].getIdade());
            System.out.println("Nota: " + aluno[i].getNotaFinal());
        }

    }
}
