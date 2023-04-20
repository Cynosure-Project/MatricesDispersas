package matricesdispersas;

import javax.swing.JOptionPane;
import Utilidades.Nodo;

/**
 *
 *
 */
public class Forma1 {

    private Nodo Punta;

    public Forma1() {
        Punta = null;
    }

    public void Crear(int Mat[][], int f, int c) {
        int Mayor;

        if (f > c) {
            Mayor = f;
        } else {
            Mayor = c;
        }

        Paso1(Mayor, f, c);
        Paso2(Mat);
        Paso3();
    }

    public void Paso1(int Mayor, int f, int c) {
        Nodo x, P;
        Punta = new Nodo(0, f, c);
        P = Punta;

        for (int i = 0; i < Mayor; i++) {
            x = new Nodo(0, i, i);
            x.setLf(x);
            x.setLc(x);
            P.setLiga(x);
            P = x;

        }
        P.setLiga(Punta);
    }


    private void Paso2(int M[][]) {
        Nodo x, P, Q;
        P = Punta.getLiga();
        Q = P;

        for (int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[i].length; j++)
            {
                if (M[i][j] != 0)
                {

                    x = new Nodo(M[i][j], i, j);
                    Q.setLf(x);
                    Q = x;
                }
            }
            Q.setLf(P);
            P = P.getLiga();
            Q = P;
        }

    }

    public void Paso3() {
        Nodo RC= Punta.getLiga(), P=RC, Q = P.getLf(),A=RC;

        while (RC != Punta) {
            while (P != Punta) {
                while (Q != P) {
                    if (RC.getColumna() == Q.getColumna()) {
                        A.setLc(Q);
                        A = Q;
                    }
                    Q = Q.getLf();
                }
                P = P.getLiga();
                Q = P.getLf();
            }
            A.setLc(RC);
            RC = RC.getLiga();
            A = RC;
            P = Punta.getLiga();
            Q = P.getLf();
        }
    }
    
     public void SumarColumnas() {
        int[] vc = new int[Punta.getColumna()];
        Nodo P = Punta.getLiga();
        Nodo Q = P.getLc();
        String s = "";
        while (P != Punta)
        {

            while (Q != P)
            {
                vc[Q.getColumna()] += Q.getDato();
                Q = Q.getLc();

            }
            P = P.getLiga();
            Q = P.getLc();

        }
        for (int i = 0; i < vc.length; i++)
        {
            s = s + "Suma de columna " + (i + 1) + ": " + vc[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    public void SumarFilas() {
        int i = 0, vf[] = new int[Punta.getFila()];
        Nodo P = Punta.getLiga(), Q = P.getLf();
        String s = "";
        while (P != Punta)
        {
            while (Q != P)
            {
                vf[i] += Q.getDato();
                Q = Q.getLf();
            }

            i++;
            P = P.getLiga();
            Q = P.getLf();
        }
        for (i = 0; i < vf.length; i++)
        {
            s = s + "Suma de fila " + (i + 1) + ": " + vf[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, s);
    }

    public void MostrarF1() {
        Nodo P, Q;
        String s = "[" + Punta.getFila() + "][" + Punta.getColumna() + "]\n";
        boolean r = true;
        int i = 0;
        P = Punta.getLiga();
        Q = P.getLf();
        while (P != Punta)
        {

            while (Q != P)
            {
                if (r)
                {
                    s = s + "[" + P.getFila() + "][" + P.getColumna() + "]->" + "[" + Q.getFila() + "][" + Q.getColumna() + "][ " + Q.getDato() + " ]-->";
                    r = false;
                } else
                {
                    s = s + "[" + Q.getFila() + "][" + Q.getColumna() + "][ " + Q.getDato() + " ]-->";
                }
                i++;
                Q = Q.getLf();
            }
            if (i == 0)
            {
                s = s + "[" + P.getFila() + "][" + P.getColumna() + "]<-\n";

            } else
            {
                s = s + "\n";
            }
            i = 0;
            r = true;
            P = P.getLiga();
            Q = P.getLf();

        }
        JOptionPane.showMessageDialog(null, s, "Mostrar Tripleta Forma 1", 3);
    }

}
