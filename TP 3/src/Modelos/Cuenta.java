package Modelos;

public class Cuenta {
    private int idCuenta;
    private double balance;
    private Cliente miCLiente;
    private double saldoDeudor;
    private double posibleDeudaRestante;

    public Cuenta(int idCuenta, double balance, Cliente miCLiente, double saldoDeudor) {
        this.idCuenta = idCuenta;
        this.balance = balance;
        this.miCLiente = miCLiente;
        this.saldoDeudor = saldoDeudor;
        this.posibleDeudaRestante=2000;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public Cliente getMiCLiente() {
        return miCLiente;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "idCuenta=" + idCuenta +
                ", balance=" + balance +
                ", miCLiente=" + miCLiente +
                '}';
    }
    public void depositar(double dineroADepositar)
    {
        this.balance+=dineroADepositar;
    }
    public boolean retirar(double dineroARetirar)
    {
        boolean rta=false;
        if(this.balance>=dineroARetirar)
        {
            this.balance-=dineroARetirar;
            rta=true;
        }
        else if (dineroARetirar>=balance && dineroARetirar<=balance+posibleDeudaRestante)
        {
            dineroARetirar-=balance;
            balance=0;
            posibleDeudaRestante-=dineroARetirar;
            saldoDeudor+=dineroARetirar;
            rta=true;
        }
        return rta;
    }
}
