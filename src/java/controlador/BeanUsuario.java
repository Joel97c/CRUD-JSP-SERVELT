package controlador;
public class BeanUsuario {
 
 private String cedula;
  private String codigo;
   private String usuario;
    private String contraseña;
     private String direccion;
      private String fechain;
       private String id_cargo;
        private String id_horario;

 
    

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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechain
     */
    public String getFechain() {
        return fechain;
    }

    /**
     * @param fechain the fechain to set
     */
    public void setFechain(String fechain) {
        this.fechain = fechain;
    }
  

    /**
     * @return the id_cargo
     */
    public String getId_cargo() {
        return id_cargo;
    }

    /**
     * @param id_cargo the id_cargo to set
     */
    public void setId_cargo(String id_cargo) {
        this.id_cargo = id_cargo;
    }

    /**
     * @return the id_horario
     */
    public String getId_horario() {
        return id_horario;
    }

    /**
     * @param id_horario the id_horario to set
     */
    public void setId_horario(String id_horario) {
        this.id_horario = id_horario;
}

 
 public BeanUsuario(String codigo,String usuario, String contraseña, String cedula,
   String direccion,String fechain ,String id_cargo,String id_horario) {

  super();
    this.codigo = codigo;
    this.usuario = usuario;
    this.cedula=cedula;

  this.contraseña = contraseña;
  this.direccion = direccion;
  this.fechain = fechain;
  
this.id_horario=id_horario;
this.id_cargo=id_cargo;


    


 
}
    public BeanUsuario(String cedula, String usuario, String contraseña, String direccion) {
     this.cedula=cedula;
     this.usuario=usuario;
     this.contraseña=contraseña;
     this.direccion=direccion;
    }
}