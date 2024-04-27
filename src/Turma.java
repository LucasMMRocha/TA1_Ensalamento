import java.util.List;
import java.util.ArrayList;

class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void mostrarDetalhes() {
        System.out.println("\nProfessor: " + professor.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getCursoMatriculado() + ")");
        }
        System.out.println("\n");
    }
}