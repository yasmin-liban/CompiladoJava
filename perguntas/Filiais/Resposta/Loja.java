public class Loja
{
	private String endereco, id;
	String nome;
	private Produtos estoque[];
	private Funcionario equipe[];
	final Funcionario gerente;
	final int maxEstoque;
    
	public String getEndereco()
	{
    	return this.endereco;
	}
	public void setEndereco(String endereco, Funcionario gerente)
	{
    	this.endereco = endereco;
	}
    
    
    
	public String getId()
	{
    	return this.id;
	}
	public void setId(String id, Funcionario gerente)
	{
    	this.id = id;
	}
   
   
   
	public Produtos[] getEstoque()
	{
    	return this.estoque;
	}
	public void setEstoque(Produtos estoque[])
	{
    	if(estoque.length>maxEstoque)
    	{
        	System.out.println("Impossivel adicionar, excedendo limite máximo de produtos");
    	}
    	else
        	this.estoque = estoque;
	}
   
   
   
	public Funcionario[] getEquipe()
	{
    	return this.equipe;
	}
	public void setEquipe(Funcionario equipe[])
	{
    	this.equipe = equipe;
	}
   
   
   
	public Loja(Funcionario gerente,int maxEstoque)
	{
    	super();
    	this.gerente = gerente;
    	this.maxEstoque = maxEstoque;
	}
}

