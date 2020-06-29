package ufv.dis.parcialfinal.pr29;

import java.util.ArrayList;

public class Lista {
	private  ArrayList<Usuario> listaUsuario;

	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public void lista() {
		this.listaUsuario = new ArrayList<Usuario>() ;
	}

	public void add_usuario(Usuario p) {
		this.listaUsuario.add(p);
	}

}
