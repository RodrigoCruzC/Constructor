/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class comida {
    
    int cantidad;
    String clase;
    String ingredientes ;
    char comer ;
    char cocinar;
    
    public void clase()
    {
        
    }
    public void sabor()
    {
        
    }
    public void tiempo()
    {
        
    }
    public void region()
    {
        
    }
    public void color()
    {
        
    }
    
    
    comida (int cantidad, String Clase)
    {
        this.cantidad = cantidad;
         this.clase = clase;
        
        
    }
    comida ()
    {
        
        
    }
    comida (int cantidad)
    {
        this.cantidad = cantidad;
        
        
        
    }
    comida (String Clase, String ingredientes)
    {
        this.clase = clase;
        this.ingredientes=ingredientes;
       
        
        
    }
    comida (String ingredientes)
    {
        this.ingredientes = ingredientes;
    
        
        
    }
    
    public void comer()
    {
        char comer='s' ;
    };
    
    public void cocinar()
    {
        char cocinar='s' ;
    };
    public void lugar()
    {
        String region="lugar" ;
    };
    
}
