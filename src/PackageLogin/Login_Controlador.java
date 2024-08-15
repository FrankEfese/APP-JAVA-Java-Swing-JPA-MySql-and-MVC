package PackageLogin;

import java.util.List;

public class Login_Controlador {

    //OBJETO DEL MODELO DEL LOGIN
    Login_JPAC_Modelo modeloLogin = new Login_JPAC_Modelo();

    //CONSTRUCTOR
    public Login_Controlador() {
    }

    //METODO PARA OBTENER TODOS LOS LOGIN (CONTROLADOR)
    public List<Login_Object> obtenerTodosLogin_C() {
        return modeloLogin.findLogin_ObjectEntities();
    }

    //METODO PARA COMBROBAR LOS CAMPOS DEL LOGIN Y COMPROBAR QUE EL USUARIO EXISTE
    public boolean comprobarCamposUsuario_C(String correo, String contraseña) {
        boolean comprobar = false;
        if ((!correo.isEmpty() && correo.length() < 26) && (!contraseña.isEmpty() && contraseña.length() < 26)) {
            for (Login_Object aux : obtenerTodosLogin_C()) {
                if (aux.getCorreo().equals(correo) && aux.getContraseña().equals(contraseña)) {
                    comprobar = true;
                    break;
                }
            }
            return comprobar;
        } else {
            return comprobar;
        }
    }

}
