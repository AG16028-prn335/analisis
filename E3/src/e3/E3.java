package e3;

import javax.swing.JOptionPane;

public class E3 {

    public static void main(String[] args) {
        int cifS, x = -5;
        double valorVerdadero, nivTolerancia, errorAprox=1000 , Resultado, iteracion, sumTaylor = 0;

        String result;
        //pidiendo cifras significativas
        cifS = Integer.parseInt(JOptionPane.showInputDialog("cuantas cifras sig?"));

        //calculando el valor verdadero de e^-5
        valorVerdadero = Math.exp(x);
        result = "" + valorVerdadero;
        JOptionPane.showMessageDialog(null, result);

        //calculando el nivel de tolerancia
        result = "";//no se a definido con cuantas cifras
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        result = "" + nivTolerancia;
        JOptionPane.showMessageDialog(null, nivTolerancia + "%");

        int i = 0;
        double t, s = 0, ant;
        while (Math.abs(errorAprox) > nivTolerancia) {

            System.out.println("iteracion  "+(i+1));
            t = Math.pow(x, i) / factorial(i);
            ant = s;
            s += t;
            System.out.println("actual    "+s);
            System.out.println("anterior    "+ant);
            //JOptionPane.showMessageDialog(null, "entro");2
                errorAprox= ((s-ant)/s)*100;
            //raíz final de taylor
            System.out.println("ERROR "+errorAprox);

          //  JOptionPane.showMessageDialog(null, "salio");
            i++;
        }
        //JOptionPane.showMessageDialog(null, "asdfghj" + s);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

}
