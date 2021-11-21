package view;
import com.deniza.utils.ListaEncadeadaInt.ListaEncadeadaInt;
import javax.swing.JOptionPane;
import controller.ListaEncadeada;

public class Main {
	
	public static void main(String[] args) {
		ListaEncadeadaInt l = new ListaEncadeadaInt();
		ListaEncadeada opCont = new ListaEncadeada();
		
		int opc = 0;
		while(opc != 9) {
			String opcao = JOptionPane.showInputDialog(null, menu());
			opc = Integer.parseInt(opcao);
			switch(opc) {
			case 0:
				int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
				opCont.insere(numero, l);
				break;
			case 1:
				try {
					if(!opCont.verificaOrdem(l)) {
						System.out.println("Os números da lista não estão em ordem crescente.");
					} else {
						System.out.println("Os números da lista estão em ordem crescente.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
				try {
					if(!opCont.buscaIterativa(numero, l)) {
						System.out.println("O "+numero+" não está na lista.");
					} else {
						System.out.println("O "+numero+" está na lista.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
				try {
					if(!opCont.buscaRecursiva(numero, l)) {
						System.out.println("O "+numero+" não está na lista.");
					} else {
						System.out.println("O "+numero+" está na lista.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida", "ERRO", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
	}
	
	private static String menu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Digite uma opção:\n");
		buffer.append("0 - Inserir um número à lista\n");
		buffer.append("1 - Verificar a ordem da lista\n");
		buffer.append("2 - Buscar um valor na lista de modo iterativo\n");
		buffer.append("3 - Buscar um valor na lista de modo recursivo\n");
		buffer.append("9 - Encerra a aplicação\n");

		return buffer.toString();
	}


}
