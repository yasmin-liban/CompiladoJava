public class Produtos
{
	String nome;
	private int codigo, qtd;
	private double preco;
    
	public int getCodigo()
	{
    	return this.codigo;
	}
	public void setCodigo(int codigo)
	{
    	this.codigo = codigo;    
	}
    
	public int getQtd()
	{
    	return this.qtd;
	}
	public void setQtd(int qtd)
	{
    	this.qtd = qtd;    
	}
    
	public double getPreco()
	{
    	return this.preco;
	}
	public void setPreco(double preco)
	{
    	this.preco = preco;
	}
}


