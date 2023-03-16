package cuentas;

/**
 * Clase java para la simulación de una cuenta bancaria.
 *  Tarea de Entornos de desarrollo Tema 4.
 * @author Manuel Gómez Suárez
 * @version 1.0
 * @since Marzo de 2023.
 */


public class CCuenta {

    /**
     * Atributos o propiedades de una cuenta
     */    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom String. Nombre del titular de la cuenta
     * @param cue String. Número de cuenta
     * @param sal double. Saldo actual de la cuenta.
     * @param tipo double. Tipo de interes sujeto a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método para asignar un nombre a la cuenta
     * @param nom String. Nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método para devolver el nombre del titular de la cuenta.
     * @return Titular de la cuenta.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para devolver el saldo de una cuenta
     * @return Cantidad de saldo actual en la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar dinero en una cuenta.
     * @param cantidad double. Cantidad a ingresar.
     * @throws Exception Devuelve error si se ingresa un importe negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método para retirar dinero.
     * @param cantidad double. Cantidad a retirar de la cuenta.
     * @throws Exception Devuelve error si se retira 0 o una cantidad negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    
    /**
     * Método para obtener el número de cuenta.
     * @return Número de cuenta.
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
     * Método para obtener el titular de la cuenta.
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el titular a una cuenta.
     * @param nombre String. Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el tipo de interés asociado a la cuenta.
     * @return double. Interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para asignar un tipo de interés a una cuenta.
     * @param tipoInterés double. Valor del tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método para obtener el número de la cuenta.
     * @return String. Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Método para asignar un número de cuenta.
     * @param cuenta String. Numero de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo de una cuenta.
     * @return double. Saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método para asignar el aldo a una cuenta.
     * @param saldo double. Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
