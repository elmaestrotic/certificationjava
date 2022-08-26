/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification;

/**
 *
 * @author asus
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public void setDia(int dia) {
        //establecemos el valor par ala variable día a través del paso de parametro
        this.dia = dia;//this hace referencia al atributo dia como variable global a nivel de la clase
// aca el metodo setDia recibe un entero como parametro para el valor del día y luego se lo asigna a la variable global dia
    }

    public int getDia() {
//getDia envia el valor del atributo dia declarado como privado a los métodos que deseen consultar dicho valor por fuera de esta clase
        return dia;
    }


public void setMes(int mes){
this.mes=mes;

}

public int getMes(){
    return mes;
}

public void setAño(int anio){
this.año=anio;

}

public int getAño(){
    return año;
}


public  String toString(){
    
    return dia+"/"+mes+"/"+"año";
}

}