import java.util.*;
public class Main
{
    public static void main(String[] args) {
   	 Funcionario f1 = new Funcionario();
   	 Scanner s1 = new Scanner(System.in);
   	 Scanner s2 = new Scanner(System.in);
   	 Scanner s3 = new Scanner(System.in);
   	 System.out.println("Digite o nome, identificador e salário do gerente dessa filial:");
   	 f1.nome = s1.nextLine();
   	 f1.setCpf(s1.nextLine());
   	 f1.setSalario(s2.nextDouble());
   	 
   	 System.out.println("Agora digite o estoque máximo da filial:");
   	 int maxp = s3.nextInt();
   	 Loja l1 = new Loja(f1,maxp);
   	 Produtos p1[] = new Produtos[maxp];
   	 double somapreco = 0;
   	 for(int i = 0; i<maxp ; i++)
   	 {
   	 	System.out.println("Digite o nome, código identificador, quantidade e preco do produto que deseja adicionar ao estoque da loja:");
   	 	p1[i] = new Produtos();
   	 	p1[i].nome = s1.nextLine();
   	 	p1[i].setCodigo(s3.nextInt());
   	 	p1[i].setQtd(s3.nextInt());
   	 	p1[i].setPreco(s2.nextDouble());
   	 	somapreco += p1[i].getPreco()*p1[i].getQtd();
   	 }
   	 l1.setEstoque(p1);
   	 
   	 System.out.println("Estoque cheio. Agora vamos adicionar vendedores. Quantos funcionarios a loja terá (excluindo o gerente)?");
   	 int maxf = s3.nextInt();
   	 Funcionario f2[] = new Funcionario[maxf];
   	 double somasal = 0;
   	 for(int i = 0 ; i<maxf ; i++)
   	 {
   	 	System.out.println("Digite o nome, cpf e salário do "+(i+1)+"º funcionario:");
   	 	f2[i] = new Funcionario();
   	 	f2[i].nome = s1.nextLine();
   	 	f2[i].setCpf(s1.nextLine());
   	 	f2[i].setSalario(s2.nextDouble());
   	 	somasal += f2[i].getSalario();
   	 }
   	 l1.setEquipe(f2);
   	 
   	 System.out.println("Caso a empresa, vendesse o estoque completo em um mês ela teria em torno de R$"+(somapreco-somasal)+" de lucro.");
   	 s1.close();
   	 s2.close();
   	 s3.close();
    }
}
