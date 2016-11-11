package Modelo;

public class Professor extends Pesoa {
	private Disciplina[] listaDisciplinaHabilitado;
	private Professor[] listaProfessorHabilitados;
	public Disciplina[] getListaDisciplinaHabilitado() {
		return listaDisciplinaHabilitado;
	}
	public void setListaDisciplinaHabilitado(Disciplina[] listaDisciplinaHabilitado) {
		this.listaDisciplinaHabilitado = listaDisciplinaHabilitado;
	}
	public Professor[] getListaProfessorHabilitados() {
		return listaProfessorHabilitados;
	}
	public void setListaProfessorHabilitados(Professor[] listaProfessorHabilitados) {
		this.listaProfessorHabilitados = listaProfessorHabilitados;
	}

}
