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
    public void Reanudar(){
        hora =hora;
        minuto=minuto;
        segundo=segundo;
        decima=decima;
        centesima=centesima;
        milesima=milesima; 
        diezmilesima=diezmilesima;
        
        while(diezmilesima>-1){
        if(diezmilesima==9 ){
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
        System.out.println(hora+":"+minuto+":"+segundo+":"+""+decima+""+centesima+""+milesima+""+diezmilesima);        
    }
}
