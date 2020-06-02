public class Main
{
    public static void main(String[] args) {
   	 Number n1 = new Number(3,1,2);
   	 Number n2 = new Number(3,2,1);
   	 Number n3 = somar(n1, n2);
   	 System.out.println(n3);
   	 n3 = subtrair(n1, n2);
   	 System.out.println(n3);
    }
    public static Number somar(Number n1,Number n2){
    	Number n3 = new Number(0,0,0);
    	int temp = n1.und + n2.und;
    	n3.und = temp%10;
    	temp /= 10;
    	temp = n1.dzn + n2.dzn + temp;
    	n3.dzn = temp%10;
    	temp /=10;
    	temp = n1.cnt+n2.cnt+temp;
    	n3.cnt = temp%10;
    	if(temp>9){
        	System.out.println("A soma é um número de 4 dígitos.");
        	temp /= 10;
        	Number n4 = new Number (temp,n3.cnt,n3.dzn,n3.und);
        	return n4;
    	}
    	return n3;
	}
    
	public static Number subtrair(Number n1,Number n2){
    	Number n3 = new Number(0,0,0);
    	Number maior, menor;
    	if(n1.cnt>n2.cnt){
        	maior = n1;
        	menor = n2;
    	}
    	if(n2.cnt>n1.cnt){
        	maior = n2;
        	menor = n1;
       	 
    	}else{
        	if(n1.dzn>n2.dzn){
            	maior = n1;
            	menor = n2;
        	}
        	if(n2.dzn>n1.dzn){
            	maior = n2;
            	menor = n1;
           	 
        	}else{
            	if(n1.und>n2.und){
                	maior = n1;
                	menor = n2;
            	}
            	if(n2.und>n1.und){
                	maior = n2;
                	menor = n1;
               	 
            	}else{
                	return n3;    
            	}
        	}
    	}
    	int temp = maior.und - menor.und;
    	if(temp>=0){
        	n3.und = temp;
    	}else{
        	maior.dzn--;
        	n3.und= (maior.und+10) - menor.und;
    	}
   	 
    	temp = maior.dzn - menor.dzn;
    	if(temp>=0){
        	n3.dzn = temp;
    	}else{
        	maior.cnt--;
        	n3.dzn= (maior.dzn+10) - menor.dzn;
    	}
    	n3.cnt = maior.cnt - menor.cnt;
    	return n3;
	}
    
    
}
