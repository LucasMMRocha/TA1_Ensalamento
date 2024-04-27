public class Ensalamento {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("POO do curso de TI");
        Professor mia = new Professor("Mia", "POO");
        Disciplina ed = new Disciplina("Estrutura de dados do curso de TI");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Disciplina bi = new Disciplina("Bi do curso de ADM");
        Professor paula = new Professor("Paula", "BI");

        // Adicionando alunos
        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno amelia = new Aluno("Amélia", "TI");
        Aluno ana = new Aluno("Ana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno capitu = new Aluno("Capitu", "TI");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno iracema = new Aluno("Iracema", "TI");
        Aluno joelmir = new Aluno("Joelmir", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno luciana = new Aluno("Luciana", "TI");
        Aluno majo = new Aluno("Majo", "ADM");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno norberto = new Aluno("Norberto", "TI");
        Aluno paulo = new Aluno("Paulo", "ADM");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno zoey = new Aluno("Zoey", "TI");


        Turma turmaPoo = new Turma(mia, poo);
        turmaPoo.adicionarAluno(alfredo);
        turmaPoo.adicionarAluno(amelia);
        turmaPoo.adicionarAluno(ana);
        turmaPoo.adicionarAluno(capitu);
        turmaPoo.adicionarAluno(debra);
        turmaPoo.adicionarAluno(zoey);

        Turma turmaED = new Turma(saulo, ed);
        turmaED.adicionarAluno(iracema);
        turmaED.adicionarAluno(luciana);
        turmaED.adicionarAluno(norberto);
        turmaED.adicionarAluno(wendel);
        turmaED.adicionarAluno(zoey);
        turmaED.adicionarAluno(bruno);


        Turma turmaBI = new Turma(paula, bi);
        turmaBI.adicionarAluno(ana);
        turmaBI.adicionarAluno(bentinho);
        turmaBI.adicionarAluno(ian);
        turmaBI.adicionarAluno(joelmir);
        turmaBI.adicionarAluno(luana);
        turmaBI.adicionarAluno(majo);
        turmaBI.adicionarAluno(maria);
        turmaBI.adicionarAluno(paulo);
        turmaBI.adicionarAluno(romeu);


        turmaED.mostrarDetalhes();
        turmaED.mostrarDetalhes();
        turmaBI.mostrarDetalhes();
    }
}