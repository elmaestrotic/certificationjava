/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;



public class Empleado {
  private String nombre = "";

  private String apellido = "";

  private String cedula = "";

  private String telefono = "";

  private String salario = "";

  private String tipoContrato = "";

  private String estado = "";

  private boolean valido = true;
  
  private String queMalo = "";

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @param apellido the apellido to set
   */
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  /**
   * @return the cedula
   */
  public String getCedula() {
    return cedula;
  }

  /**
   * @param cedula the cedula to set
   */
  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  /**
   * @return the telefono
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * @param telefono the telefono to set
   */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * @return the salario
   */
  public String getSalario() {
    return salario;
  }

  /**
   * @param salario the salario to set
   */
  public void setSalario(String salario) {
    this.salario = salario;
  }

  /**
   * @return the tipoContrato
   */
  public String getTipoContrato() {
    return tipoContrato;
  }

  /**
   * @param tipoContrato the tipoContrato to set
   */
  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  /**
   * @return the estado
   */
  public String getEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   * @return the valido
   */
  public boolean isValido() {
    return valido;
  }

  /**
   * @param valido the valido to set
   */
  public void setValido(boolean valido) {
    this.valido = valido;
  }

  /**
   * @return the queMalo
   */
  public String getQueMalo() {
    return queMalo;
  }

  /**
   * @param queMalo the queMalo to set
   */
  public void setQueMalo(String queMalo) {
    this.queMalo = queMalo;
  }

  @Override
  /*public String toString() {
    return String.format("Nombre: %s, Apellido: %s, Cedula: %s, Teléfono: %s, Salario: %s, Tipo Contrato: %s, Estado: %s" + (valido ? "" : " (*) " + queMalo), nombre,
        apellido, cedula, telefono, salario, tipoContrato, estado);
  }*/
  
  public String toString() {
    return String.format("Nombre: %s \n Apellido: %s\nCedula: %s\n Teléfono: %s\n Salario: %s\nTipo Contrato: %s\n Estado: %s" + (valido ? "" : " (*) " + queMalo), nombre,
        apellido, cedula, telefono, salario, tipoContrato, estado);
   
  }
}
