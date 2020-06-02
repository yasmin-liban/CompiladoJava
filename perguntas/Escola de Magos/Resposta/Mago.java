public class Mago{
	String nome;
	Magia magias[] = new Magia[2];
	double mana, hp;

	public void lancarMagia(Magia m, Mago m1){
    	this.mana -= m.mana;
    	m1.hp -= m.efetividade;
    	if(this.mana <= 0){
        		System.out.println("O mago está esgotado!");
     	}
    	if(m1.hp <= 0){
        		System.out.println("O mago adversário caiu!");
    	}
   	 
	}
}

