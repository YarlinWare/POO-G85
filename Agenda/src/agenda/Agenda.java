package agenda;

import datos.DBConexion;
import gui.FormAgenda;
import logica.Contacto;
import logica.DBContactos;
import logicacitas.Citas;
import logicacitas.DBCitas;

public class Agenda {
    
    
    public static void main(String[] args) {
        DBContactos dbcontactos = new DBContactos();
        Contacto[] contactos = dbcontactos.getContactos();
        
        DBCitas dbcitas = new DBCitas();
        
        Citas[] citas = dbcitas.getCitas();
        
        System.out.println("\n****** CONTACTOS ******\n");
        
        for (Contacto contacto : contactos){
            System.out.println("Nombre: " + contacto.getNombre() + " " + contacto.getApellido());
        }
        
        System.out.println("\n******** CITAS ********\n");
        
        for (Citas cita : citas){
            System.out.println("Cita "+cita.getId()+": ");
            System.out.println("Persona: " + cita.getNombre()+ "\tLugar: " + cita.getLugar()+ "\tFecha: " + cita.getFecha()+ "\tHora: " + cita.getHora()+ "\tDescripcion: " + cita.getDescripcion());
        }   
        System.out.println("\n\n");
    }
}

