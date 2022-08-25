import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int opcao = 0;
		Agenda operacao = new Agenda();
		
		while(true) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog
			("Agenda Telefônica"
		   + "\n"
		   + "\n1 - Adicionar Contato"
		   + "\n2 - Excluir Contato"
		   + "\n3 - Visualizar Contatos"
		   + "\n4 - Editar Contato"
		   + "\n5 - Sair"
		   + "\n"
		   + "\nNúmero da operação a ser realizada:"));
			
			switch(opcao) {
				case 1: operacao.adiciona(); break;
				case 2: operacao.excluir(); break;
				case 3: operacao.visualizar(); break;
				case 4: operacao.editar(); break;
				case 5: operacao.sair(); break;
					default: JOptionPane.showMessageDialog(null, "Operação Inválida, tente novamente."); break;
			}
		}
	}
	

}
