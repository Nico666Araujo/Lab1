
package entidades;

/**
 *
 * @author VIB
 */
public class Robot {

    private String modelo;
    private Bateria bateria ;
    private boolean dormido = false;

    public Robot(String modelo) {
        this.modelo = modelo;
        this.bateria = new Bateria();
    }

   /* public String getModelo() {
        return modelo;
    }
    */

public void avanzar(double cantidad) {
     double energiaGastada=0;
     if (dormido){
         System.out.println("El robot duerme no puede avanzar");
     }else{
         
         if ((cantidad/10) >= energiaActual()){
             System.out.println("No hay suficiente energia");
        } else {
                energiaGastada = (bateria.getCarga() - (cantidad/10));
                
             System.out.println("Avanzo "+cantidad+" pasos y gasto "+(cantidad/10)+" "
                     + "le queda "+energiaGastada+ " de carga"  );
                     bateria.setCarga(energiaActual()- (cantidad/10));
             }
     }
     System.out.println(bateria.getCarga());
}     
        
    
    
    public void retroceder(double cantidad) {
        double energiaGastada=0;
     if (dormido){
         System.out.println("El robot duerme no puede retroceder");
     }else{
         
         if ((cantidad/10) >= energiaActual()){
             System.out.println("No hay suficiente energia");
        } else {
                energiaGastada = (bateria.getCarga() - (cantidad/10));
                
             System.out.println("Retrocedio "+cantidad+" pasos y gasto "+(cantidad/10)+" "
                     + "le queda "+energiaGastada+ " de carga"  );
                     bateria.setCarga(energiaActual()- (cantidad/10));
             }
     }
     System.out.println(bateria.getCarga());
     
    }
    
    public void dormir() {
        
        dormido=true;
        System.out.println("El robot esta dormido");
    }
    
    public void despertar() {
        
        dormido=false;
        System.out.println("El robot esta despierto ");
    }
    
    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("la bateria esta llena");
    }
    
    
    public boolean bateriaLlena() {      
         return bateria.getCarga() ==1000;
    }
    
    public boolean bateriaVacia() {

        return bateria.getCarga() ==0;
    }
    
    public double  energiaActual() {
        return bateria.getCarga();
    }
}