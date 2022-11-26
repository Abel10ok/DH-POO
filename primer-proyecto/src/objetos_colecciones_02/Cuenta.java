package objetos_colecciones_02;

import java.util.Objects;

public class Cuenta implements Comparable<Cuenta>{
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return numeroCuenta == cuenta.numeroCuenta && Double.compare(cuenta.saldo, saldo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta, saldo);
    }

    @Override
    public int compareTo(Cuenta o) {
        if(this.numeroCuenta> o.numeroCuenta){
            return 1;
        }else if(this.numeroCuenta < o.numeroCuenta){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
