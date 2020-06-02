public class Number{
	int  undMil, cnt, dzn, und;
    
	public Number(int cnt, int dzn, int und){
    	super(); //se der problema no objeto, olhar aqui
    	this.und = und;
    	this.dzn = dzn;
    	this.cnt = cnt;
    	this.undMil = 0;
	}
    
	public Number(int undMil,int cnt,int dzn,int und){
    	super(); //se der problema no objeto, olhar aqui
    	this.undMil = undMil;
    	this.und = und;
    	this.dzn = dzn;
    	this.cnt = cnt;
	}
	public String toString(){
    	if(this.undMil>0){
        	return this.undMil+""+this.cnt+""+this.dzn+""+this.und;
    	}else{
        	return this.cnt+""+this.dzn+""+this.und;
    	}
	}
    
}
