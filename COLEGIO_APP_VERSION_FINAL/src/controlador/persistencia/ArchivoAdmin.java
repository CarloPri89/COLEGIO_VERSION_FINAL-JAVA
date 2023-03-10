/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Administrador;
import modelo.Asignatura;

/**
 *
 * @author Toshiba
 */
public class ArchivoAdmin {
     private String nombre;
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public ArchivoAdmin() {
        this.nombre = "administrativos.dat";
        file = new File(nombre);
        this.crearArchivo();
    }

    public boolean crearArchivo() {
        try {

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("El Archivo fue creado");
            } else {
                System.out.println("El Archivo ya existe");
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ArchivoAsignatura.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean existenciaArchivo(){
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminarArchivo() {
        if (file.exists()) {
            file.delete();
            System.out.println("El Archivo fue eliminado");
        } else {
            System.out.println("El Archivo no existe");
        }
        return true;
    }

  
    public boolean ingresarDato(Administrador administrador) {
        try {
            fos = new FileOutputStream(file,true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(administrador);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * eliminar todo
     */
    public void limpiarArchivo() {
        eliminarArchivo();
        crearArchivo();
    }

    /**
     * obtener todo
     *
     * @return
     */
    public ArrayList<Administrador> obtenerTodosLasAdministradoresForma1() {
        try {
            ArrayList<Administrador> administradores = new ArrayList<>();
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Administrador administrador = null;
            do {
                administrador = (Administrador) ois.readObject();
                if (administrador != null) {
                    administradores.add(administrador);
                    
                }else{
                    ois.close();
                    fis.close();
                }
            } while (administrador != null);
            
            return administradores;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Administrador> obtenerTodosLosAdministradoresForma2(){
        try{
            ArrayList<Administrador> administradores = new ArrayList<>();
            fis = new FileInputStream(file);
            Administrador administrador;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                administrador = (Administrador) ois.readObject();
                if (administrador != null) {
                    administradores.add(administrador);
                }
            }
            ois.close();
            fis.close();
            return administradores;
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException ex){
            Logger.getLogger(ArchivoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    public void eliminarAdmin(int a) {
        ArrayList <Administrador> admins = obtenerTodosLosAdministradoresForma2();
        admins.remove(a);
        limpiarArchivo();
        for(int x = 0 ; x < admins.size(); x++){
            ingresarDato(admins.get(x));
        }
    }

    public void guardarFecha(boolean activar) {
        
    }
}
