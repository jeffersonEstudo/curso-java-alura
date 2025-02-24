package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {


    public boolean verificarPrimalidade(int n){

        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }
    public List<Integer> listarPrimos(int limite) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
