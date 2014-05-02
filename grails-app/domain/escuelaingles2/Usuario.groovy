package escuelaingles2

class Usuario {

    String correoElectronico
    String password
    String nombre
    String apellidoPaterno
    String apellidoMaterno
    String telefono
    String tipoUsuario
    
    static constraints = {       
        correoElectronico blank:false, nullable:false, email:true,unique:true
        password size:5..15,blank:false, nullable:false,password:true
        nombre blank:false, nullable:false
        apellidoPaterno blank:false, nullable:false
        apellidoMaterno blank:false, nullable:false 
        telefono blank:true, nullable:false
        tipoUsuario blank:true
    }
}