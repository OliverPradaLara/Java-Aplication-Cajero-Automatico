
package clases;

public class Deposito extends PrincipalPadre {
    
    @Override
    public void Transaccion(){
        System.out.println("Cuanto deseas depositar.");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("-----------------------------------");
        System.out.println("Depositaste: "+deposito);
        System.out.println("Tu saldo actual es : "+ getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
