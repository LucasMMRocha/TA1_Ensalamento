class Aluno extends Pessoa {
    private String cursoMatriculado;

    public Aluno(String nome, String cursoMatriculado) {
        super(nome);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }
}