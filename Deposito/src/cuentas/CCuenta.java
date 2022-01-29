package cuentas;
/**
 * 
 * @author RUBEN
 * @see Clase que permite crear una cuenta y establece métodos para obtener y modificar sus atributos y realizar ingresos y retiradas a una cuenta.
 */
public class CCuenta {

    private String nombre;
    /**
     * @see Obtener nombre del propietario
     * @return String
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * @see Establecer el nombre del propietario
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @see Obtener IBAN
	 * @return String
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * @see Establecer IBAN
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @see Obtener saldo
	 * @return double
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @see Establecer saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @see Obtener tipo de interes
	 * @return double
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * @see Establecer tipo de interes
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * @see Constructor por defecto
     */
    public CCuenta()
    {
    }
    /**
     * @see Constructor estableciendo el nombre del propietario, el IBAN, el saldo y el tipo de interes.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * @see Obtener el saldo
     * @return double
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * @see Método para ingresar saldo
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * @see Método para retirar saldo
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
