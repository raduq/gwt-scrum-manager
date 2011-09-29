package com.geekvigarista.scrummanager.shared.vos;

import java.io.Serializable;

public class Usuario implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String id;
	private String login;
	private String senha;
	private String nome;
	
	private boolean administrador;
	
	public Usuario()
	{
		
	}
	
	public Usuario(String id, String login, String senha, String nome, boolean administrador)
	{
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.administrador = administrador;
	}
	
	public Usuario(String login, String senha, String nome, boolean administrador)
	{
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.administrador = administrador;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getSenha()
	{
		return senha;
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public boolean isAdministrador()
	{
		return administrador;
	}

	public void setAdministrador(boolean administrador)
	{
		this.administrador = administrador;
	}
	
	
	
}
