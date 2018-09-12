<<<<<<< HEAD

package cronometro;


public class Tiempo {
    int hora =0,minuto=0,segundo=0,decima=0,centesima=0,milesima=0, diezmilesima;
    
    public void Iniciar()throws InterruptedException{
        long start = System.currentTimeMillis();
        while(diezmilesima>-1){
        if(diezmilesima==9 ){
            Thread.sleep(2);
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author Rapter
 */
public class Tiempo {
    int hora =0,minuto=0,segundo=0,decima=0,centesima=0,milesima=0, diezmilesima;
    
    public void Iniciar(){
        while(diezmilesima>-1){
        if(diezmilesima==9 ){
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
            diezmilesima=0;
            milesima++;        
            if(milesima==9 ){
                milesima=0;
                centesima++;
                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                if(centesima==9){                    
                    centesima=0;
                    decima++;
                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                    if(decima==9){                    
                        decima=0;
                        segundo++;
                        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                        if(segundo==59){                    
                            segundo=0;
                            minuto++;
                            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                            if(minuto==59){                    
                                minuto=0;
                                hora++;
                                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                                if(hora==24){                    
                                    hora=0;
                                    milesima++;
                                    
                                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);

                                }
                            }
                        }
                    }
                }
            }
            }
            diezmilesima ++;
            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
        }    
    }
    public void Pausar(){
        
    }
<<<<<<< HEAD
    
    public void Reanudar(int h, int m, int s)throws InterruptedException {
        hora=0;
        minuto=0;
        segundo=0; 
        decima=0;
        centesima=0;
        milesima=0;
        diezmilesima=0;
        long start = System.currentTimeMillis();
        while(hora!=h&&minuto!=m&&segundo!=s){
        if(diezmilesima==9 ){
            Thread.sleep(2);
            diezmilesima=0;
            milesima++;        
            if(milesima==9 ){
                milesima=0;
                centesima++;
                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                if(centesima==9){                    
                    centesima=0;
                    decima++;
                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                    if(decima==9){                    
                        decima=0;
                        segundo++;
                        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                        if(segundo==59){                    
                            segundo=0;
                            minuto++;
                            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                            if(minuto==60){                    
                                minuto=0;
                                hora++;
                                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                                if(hora==24){                    
                                    hora=0;
                                    milesima++;                                    
                                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                                }
                            }
                        }
                    }
                }
            }
            }
            diezmilesima ++;
            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
        } 
        if(hora==h&&minuto==m&&segundo==s)
        {
            while(hora!=0&&minuto!=0&&segundo!=0);
        {
                if(hora==0)
		{
			hora=23;
			minuto=59;
			segundo=59;
                        decima=9;
                        centesima=9;
                        milesima=9;
                        diezmilesima=9;
		}
		
                Thread.sleep(0,1);
                diezmilesima--;
                if(diezmilesima==0)
		{
			milesima--;
			diezmilesima=9;	
		}	
                if(milesima==0)
		{
			centesima--;
			milesima=9;	
		}	
                if(centesima==0)
		{
			decima--;
			centesima=9;	
		}	
                if(decima==0)
		{
			segundo--;
			decima=9;	
		}	


		if(segundo==0)
		{
			minuto=minuto-1;
			segundo=59;	
		}	
		if(minuto==0)
		{
			hora=hora-1;
			minuto=59;
		}
		
                
            System.out.println(hora+":"+minuto+":"+segundo+":"+":"+decima+":"+centesima+":"+milesima+":"+diezmilesima);

        }
        }
    }
    
    public void Reanudar2()throws InterruptedException{
=======
    public void Reanudar(){
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
        hora =hora;
        minuto=minuto;
        segundo=segundo;
        decima=decima;
        centesima=centesima;
        milesima=milesima; 
        diezmilesima=diezmilesima;
<<<<<<< HEAD
        long start = System.currentTimeMillis();
        while(diezmilesima>-1){
        if(diezmilesima==9 ){
            Thread.sleep(2);
=======
        
        while(diezmilesima>-1){
        if(diezmilesima==9 ){
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
            diezmilesima=0;
            milesima++;        
            if(milesima==9 ){
                milesima=0;
                centesima++;
                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                if(centesima==9){                    
                    centesima=0;
                    decima++;
                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                    if(decima==9){                    
                        decima=0;
                        segundo++;
                        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                        if(segundo==59){                    
                            segundo=0;
                            minuto++;
                            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                            if(minuto==59){                    
                                minuto=0;
                                hora++;
                                System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
                                if(hora==24){                    
                                    hora=0;
                                    milesima++;
                                    
                                    System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);

                                }
                            }
                        }
                    }
                }
            }
            }
            diezmilesima ++;
            System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);
        }    
    }
    public void Reiniciar(){
        hora =0;
        minuto=0;
        segundo=0;
        decima=0;
        centesima=0;
        milesima=0; 
        diezmilesima=0;
        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);      
    }
    public void Guardar(){
        
        
    }
    public void Detener(){
<<<<<<< HEAD
        System.out.println(hora+":"+minuto+":"+segundo+":"+":"+decima+":"+centesima+":"+milesima+":"+diezmilesima);        
    }
    public void Reversa() throws InterruptedException
    {
        long start = System.currentTimeMillis();
        while(true)
        {
                if(hora==0)
		{
			hora=23;
			minuto=59;
			segundo=59;
                        decima=9;
                        centesima=9;
                        milesima=9;
                        diezmilesima=9;
		}
		
                Thread.sleep(0,1);
                diezmilesima--;
                if(diezmilesima==0)
		{
			milesima--;
			diezmilesima=9;	
		}	
                if(milesima==0)
		{
			centesima--;
			milesima=9;	
		}	
                if(centesima==0)
		{
			decima--;
			centesima=9;	
		}	
                if(decima==0)
		{
			segundo--;
			decima=9;	
		}	


		if(segundo==0)
		{
			minuto=minuto-1;
			segundo=59;	
		}	
		if(minuto==0)
		{
			hora=hora-1;
			minuto=59;
		}
		
                
            System.out.println(hora+":"+minuto+":"+segundo+":"+":"+decima+":"+centesima+":"+milesima+":"+diezmilesima);

        }
=======
        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);        
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
    }
}
