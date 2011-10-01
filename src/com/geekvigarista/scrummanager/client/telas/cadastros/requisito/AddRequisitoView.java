package com.geekvigarista.scrummanager.client.telas.cadastros.requisito;

import java.util.List;

import com.geekvigarista.scrummanager.shared.vos.Requisito;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SingleSelectionModel;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.RichTextArea;

public class AddRequisitoView extends ViewImpl implements AddRequisitoPresenter.AddRequisitoView
{
	/*
	 * Inner classes/interfaces/factorys
	 */
	interface AddRequisitoViewUiBinder extends UiBinder<Widget, AddRequisitoView>
	{
	}
	
	/*
	 * atributos
	 */
	private static AddRequisitoViewUiBinder uiBinder = GWT.create(AddRequisitoViewUiBinder.class);
	
	@UiField
	HTMLPanel conteudo;
	
	@UiField
	TextBox titulo;
	
	@UiField
	IntegerBox tempoEstimado;
	
	@UiField
	ListBox prioridade;
	
	@UiField
	Button btSalvar;
	
	@UiField
	Anchor btCancelar;
	
	@UiField
	CellList<Requisito> requisitos;
	
	@UiField
	Label labelHorasTotais;
	
	@UiField
	Button btAdd;
	
	@UiField
	Button btRm;
	
	@UiField
	RichTextArea descricao;
	
	private RequisitoItemsFactory requisitosFactory = null;
	
	@UiFactory
	CellList<Requisito> buildRequisitos()
	{
		requisitosFactory = new RequisitoItemsFactory();
		return requisitosFactory.getRequisitos();
	}
	
	/*
	 * Construtor..
	 */
	public AddRequisitoView()
	{
		uiBinder.createAndBindUi(this);
	}
	
	@Override
	public Widget asWidget()
	{
		return conteudo;
	}
	
	@Override
	public SingleSelectionModel<Requisito> selectionModel()
	{
		return requisitosFactory.getSelectionModel();
	}
	
	@Override
	public HasClickHandlers getBtCancelar()
	{
		return btCancelar;
	}
	
	@Override
	public HasClickHandlers getBtSalvar()
	{
		return btSalvar;
	}
	
	@Override
	public IntegerBox tempoEstimado()
	{
		return tempoEstimado;
	}
	
	@Override
	public TextBox titulo()
	{
		return titulo;
	}
	
	@Override
	public ListBox prioridade()
	{
		return prioridade;
	}
	
	@Override
	public void setData(List<Requisito> reqs)
	{
		requisitosFactory.getDataProvider().setList(reqs);
	}
	
	@Override
	public Label labelHorasTotais()
	{
		return labelHorasTotais;
	}
	
	@Override
	public Button btAdd()
	{
		return btAdd;
	}
	
	@Override
	public Button btRm()
	{
		return btRm;
	}
	
	@Override
	public RichTextArea descricao()
	{
		return descricao;
	}
}
