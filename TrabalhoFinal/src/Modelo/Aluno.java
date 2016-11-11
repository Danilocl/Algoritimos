package Modelo;

public class Aluno extends Pesoa {
	private ItemInscricao[] listaInscricoes;
	public ItemInscricao[] getListaInscricoes() {
		return listaInscricoes;
	}
	public void setListaInscricoes(ItemInscricao[] listaInscricoes) {
		this.listaInscricoes = listaInscricoes;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	private Professor professor;
	private Disciplina disciplina;
}
