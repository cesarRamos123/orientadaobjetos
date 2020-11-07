/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Javier Ramos
 */
public class Enrolamiento {
    private String identidad ;
    private String name ;
    private String residencia ;
    private String telefono ;
    private String tipodesangre;
public Enrolamiento() { 

}
public String getIndetidad (){
return identidad;
}
public String getName () {
return name;
}
public String getResidencia () {
    return residencia ;
}
public String getTelefono (){
    return telefono;
}
public String getTipoDesangre(){
    return tipodesangre ;
}

public void setIndentidad (String _identidad ){
    this.identidad=_identidad;
}

public void setName (String _name){
    this.name= _name;

}
public void setResidencia(String _residencia){
    this.residencia= _residencia;
}
public void setTelefono(String _telefono ){
    this.telefono=_telefono;
}
public void setTipoDeSangre (String _tipodesangre){
    this.tipodesangre=_tipodesangre;
}
}