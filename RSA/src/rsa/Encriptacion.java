package rsa;


public class Encriptacion extends abs {
        
    int fi;
    int z;
    int s;

    public Encriptacion() {
                
    }    
    @Override
    public int FI(int p,int q){
       this.fi=((p-1)*(q-1));
        
        return fi;
    }    
    @Override
    public int Z(int p, int q){        
        z=(p*q);
        
        return z;
        
    }    
    @Override
    public int S(int n){ 
        s=0;
        for (int x=0; x<=1000;x++){
            if (((n*x)% fi)==1){
            s=x;
            }
        }
        
        return s;   
    }
    @Override
    public int encriptar(int c){
        int resultado = 1;
	for( int i = 1 ; i<=n ; i++) {
            resultado = (resultado*(c%z))%z;
	}
		
	return resultado;	
    }
    @Override
    public int desencriptar(int c){
		
	int resultado = 1;
	for( int i = 1 ; i<=s ; i++) {
        	resultado = (resultado*(c%z))%z;
	}		
	return resultado;	
    }

    
}

    

