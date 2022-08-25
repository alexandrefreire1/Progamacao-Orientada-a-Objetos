import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agenda {

	static ArrayList<Contato> agenda = new ArrayList<>();
	static int x;
	static int sequencia=1;
	
	//ADICIONAR CONTATO
	public void adiciona() {
		int op = 1;
		int id;
		String nome;
		int tel;
		String email;
		
		while(op==1) {
			id=sequencia++;
			nome = JOptionPane.showInputDialog(null, "Nome do Contato:");
			do {
				x=0;
				tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Número:"));
				if(agenda.size()>0) {
					for(int i=0; i<agenda.size(); i++) {
						if(tel==agenda.get(i).getTel()) {
							x=1;
						}
					}
					if(x==1) {
						JOptionPane.showMessageDialog(null, "Número já adicionado.");
					}
				}
			}while(x==1);
			email = JOptionPane.showInputDialog(null, "Email:");
			
			agenda.add(new Contato(id, nome, tel, email));
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog
						(null, "Deseja adicionar mais um contato?"
							 + "\n"
						     + "\n1 - Sim: "
						     + "\n2 - Não: "));
				
			}while(op !=1 && op !=2);
			
			JOptionPane.showMessageDialog(null, "Contato adicionado.");
		}
	}
	
	//EXCLUIR CONTATO
	public void excluir() {
		int id, pos=0;
		
		if(agenda.size()>0) {
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID do contato que deseja excluir:"));
			
			for(int i=0; i<agenda.size(); i++) {
				if(id==agenda.get(i).getId()) {
					x=1;
					pos=i;
				}
			}
			if(x==1) {
				int confirma;
				confirma = JOptionPane.showConfirmDialog(null, "Confirme a exclusão do contato?");
				
				if(confirma==0) {
					agenda.remove(pos);
					JOptionPane.showMessageDialog(null, "Contato excluído.");
				}else {
					JOptionPane.showMessageDialog(null, "Contato já foi excluído ou não existe.");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Contato não encontrado.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum contato foi adicionado.");
		}
	}
	
	//VISUALIZAR CONTATOS
	public void visualizar() {
		if(agenda.size()==0) {
			JOptionPane.showMessageDialog(null, "A Agenda Telefônica está vazia.");
		} else {
			for(int i=0; i<agenda.size(); i++) {
				JOptionPane.showMessageDialog(null, "ID: " + agenda.get(i).getId()
												  + "\nNome: " + agenda.get(i).getNome()
												  + "\nTelefone: " + agenda.get(i).getTel()
												  + "\nE-mail: " + agenda.get(i).getEmail());
			}
		}
	}
	
	//EDITAR CONTATOS
	public void editar() {
		int id;
		String nome = null;
		int tel = 0;
		String email;
		int pos=0;
		
		if(agenda.size()>0) {
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID do contato que deseja editar:"));
			x = 0;
			for(int i=0; i<agenda.size(); i++) {
				if(id==agenda.get(i).getId()) {
					x=1;
					pos=i;
				}
			}
			if(x==1) {
				nome = JOptionPane.showInputDialog(null, "Novo nome: ");
				do {
					x=0;
					tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo telefone:"));
					if(agenda.size()>0) {
						for(int i=0; i<agenda.size(); i++) {
							if(tel==agenda.get(i).getTel()) x=1;
						}
					}
					if(x==1) {
						JOptionPane.showMessageDialog(null, "Telefone já existe.");
					}
				}while(x==1);
			}
			email = JOptionPane.showInputDialog(null, "Novo email:");
			
			agenda.set(pos, new Contato(id, nome, tel, email));
			
			JOptionPane.showMessageDialog(null, "Contato editado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum contato foi adicionado na Agenda.");
		}
	}
	
	public void sair() {
		JOptionPane.showMessageDialog(null, "Programa Finalizado.");
		System.exit(0);
	}

}