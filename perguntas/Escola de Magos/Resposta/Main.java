import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
   	 Mago rasmodeus = new Mago();
   	 Mago rasputin = new Mago();
   	 Scanner s1 = new Scanner(System.in);
   	 Scanner s2 = new Scanner(System.in);
   	 System.out.println("---------Para Mago1--------");
   	 System.out.println("Digite o nome da mago: ");
   	 rasmodeus.nome = s1.nextLine();
   	 System.out.println("Digite o hp da mago: ");
    	rasmodeus.hp = s2.nextDouble();
    	System.out.println("Digite o mp do mago: ");
   	 	rasmodeus.mana = s2.nextDouble();
   	 for(int i=0; i<2;i++){
   	 	rasmodeus.magias[i] = new Magia();
   	 	System.out.println("Digite o nome da magia: ");
   	 	rasmodeus.magias[i].nome = s1.nextLine();
   	 	System.out.println("Digite a efetividade da magia (o quanto de dano ela causa): ");
   	 	rasmodeus.magias[i].efetividade = s2.nextDouble();
   	 	System.out.println("Digite o consumo de mana da magia:");
   	 	rasmodeus.magias[i].mana = s2.nextDouble();
   	 }
   	 System.out.println("-----------Para Mago2-----------");
   	 System.out.println("Digite o nome da mago: ");
    	rasputin.nome = s1.nextLine();
    	System.out.println("Digite o hp da mago: ");
    	rasputin.hp = s2.nextDouble();
    	System.out.println("Digite o mp do mago: ");
    	rasputin.mana = s2.nextDouble();
   	 for(int i=0; i<2;i++){
   	 	rasputin.magias[i] = new Magia();
   	 	System.out.println("Digite o nome da magia: ");
   	 	rasputin.magias[i].nome = s1.nextLine();
   	 	System.out.println("Digite a efetividade da magia (o quanto de dano ela causa): ");
   	 	rasputin.magias[i].efetividade = s2.nextDouble();
   	 	System.out.println("Digite o consumo de mana da magia:");
   	 	rasputin.magias[i].mana = s2.nextDouble();
   	 }
   	 maisForte(rasmodeus,rasputin);
    }
    
    public static void maisForte(Mago m1, Mago m2){
    	double somae1 = 0,somae2 = 0,somam1 = 0,somam2 = 0;
    	for(int i=0; i<2;i++){
   	 	somae1 = m1.magias[i].efetividade;
   	 	somae2 = m2.magias[i].efetividade;
   	 	somam1 = m1.magias[i].mana;
   	 	somam2 = m2.magias[i].mana;
   	 }
   	 if(somae1 > somae2 && somam1 < somam2){
   	 	System.out.println("O mago "+m1.nome+" é mais forte!");
   	 }
   	 else{
   	 	if(somae1<somae2 && somam1>somam2){
   	     		System.out.println("O mago "+m2.nome+" é mais forte!");
   	 	}
   	 	else{
   	     		System.out.println("Não se pode calcular conclusivamente. Precisa-se de um duelo!");
   	 	}
   	 }
    }

}
