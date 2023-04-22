package matricesdispersas;

import javax.swing.JOptionPane;
import Utilidades.Matriz;
import Utilidades.Validar;
import Utilidades.Menu;

public class MatricesDispersas {

    public static void main(String[] args) {
        Matriz n= new Matriz(),m = new Matriz(),m2=new Matriz();
        Forma1 F1= new Forma1(), F1A=new Forma1(), F1B=new Forma1();
        Forma2 F2;
        Forma2 F2A = new Forma2(m.getn(), m.getm());
        Validar Val = new Validar();
        int M[][],N[][], M2[][], op,d,d1,d2;
        Tripleta T, T2, T3;
        M = m.ConstruirRandom(0,0);
        JOptionPane.showMessageDialog(null, "Se creará una tripleta a partir de la siguiente matriz", "Crear Tripleta", 3);
        m.Mostrar(M);
        d = m.DatosDiferentesDeCero();
        T = new Tripleta(d);
        T.Construir(M, d);
        N = m.ConstruirRandom(T.getA(0, 0), T.getA(0, 1));
        d1 = m.DatosDiferentesDeCero();
        T2 = new Tripleta(d1);
        T2.Construir(N, d1);
        M2 = m.ConstruirRandom(T.getA(0, 1), 0);
        d2=m.DatosDiferentesDeCero();
        T3=new Tripleta(d2);
        T3.Construir(M2, d2);

        do
        {
            op = Val.Validar_int("""   
                                                Menú Matrices dispersas 
                                                                                                                                   
                                            1. Tripletas.
                                            2. Forma 1.
                                            3. Forma 2.
                                            4. Operaciones entre Formas
                                            0. Salir.
                                            """);
            switch (op)
            {
                case 1 ->
                {
                    
                    do
                    {

                        op = Val.Validar_int("""   
                                                Menú Tripletas 
                                                                                                                                                  
                                            1. Mostrar Tripleta
                                            2. Suma de filas.
                                            3. Suma de Columnas.
                                            4. Insertar un dato.
                                            5. Eliminar un dato.
                                            6. Ver matriz inicial
                                            7. Operaciones entre tripletas
                                            8. Volver al menú principal.
                                            """);
                        switch (op)
                        {

                            case 1 ->
                            {
                                T.Mostrar();
                            }
                            case 2->
                            {
                                T.SumarFilas();
                            }
                            case 3 ->
                            {
                                T.SumarColumnas();
                            }
                            case 4->
                            {
                               

                                T.Insertar(M);
                                m.Mostrar(M);
                                
                            }
                            case 5->
                            {
                                T.Eliminar(M);
                            }
                            case 6 ->
                            {
                                m.Mostrar(M);
                            }
                            case 7 ->
                            {
                                
                                do
                                {
                                    op = Val.Validar_int("""   
                                                Operaciones entre Tripletas 
                                                                                                                                   
                                            1. Suma.
                                            2. Multiplicación.
                                            3. Mostrar Tripletas con las que se operó.
                                            4. Salir
                                            
                                            """);
                                    switch (op)
                                    {
                                        case 1 ->
                                        {

                                            JOptionPane.showMessageDialog(null, """  
                                                                                Se realizará la suma con la siguiente tripleta
                                                                                """, "Operaciones con tripletas", 3);
                                            T2.Mostrar();
                                            
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Resultado de la tripleta suma
                                                                                """, "Resultado operaciones con tripletas", 3);
                                            T.Sumar(T2);
                                          
                                        }
                                        case 2 ->
                                        {
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Se realizará la multiplicación con la siguiente tripleta
                                                                                """, "Operaciones con tripletas", 3);
                                            T3.Mostrar();
                                            
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Resultado de la tripleta multiplicación
                                                                                """, "Resultado operaciones con tripletas", 3);
                                            T.Multiplicar(T3);
                                        }
                                        case 3 ->
                                        {
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Tripletas utilizadas para la suma.
                                                                                """, "Operaciones con tripletas", 3);
                                            T.Mostrar();
                                            T2.Mostrar();
                                            
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Tripletas utilizadas para la Multiplicación.
                                                                                """, "Operaciones con tripletas", 3);
                                            T.Mostrar();
                                            T3.Mostrar();
                                        }
                                        case 4 ->
                                        {}
                                        default->
                                        {
                                            JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                                        }
                                    }

                                } while (op != 4);
                                
                            }
                            case 8 ->
                            {

                            }

                            default ->
                            {
                                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                            }
                        }
                    } while (op != 8);
                }
                case 2 ->
                {
                    F1.Crear(M,M.length, M[0].length);
                    do
                    {

                        op = Val.Validar_int("""   
                                                Menú Tripletas Forma 1 
                                                                                                                                                  
                                            1. Mostrar Forma 1
                                            2. Suma de filas.
                                            3. Suma de Columnas.
                                            4. Insertar un dato.
                                            5. Eliminar un dato.
                                            6. Ver matriz inicial
                                            7. Operaciones Forma 1
                                            8. Volver al menú principal.
                                            """);
                        switch (op)
                        {

                            case 1 ->
                            {
                                F1.MostrarF1();
                            }
                            case 2->
                            {
                                F1.SumarFilas();
                            }
                            case 3 ->
                            {
                                F1.SumarColumnas();
                            }
                            case 4->
                            {
                                F1.Insertar(M);
                            }
                            case 5->
                            {
                                F1.Eliminar(M);
                            }
                            case 6 ->
                            {
                                m.Mostrar(M);
                            }
                            case 7->
                            {   
                                F1A.Crear(N,N.length, N[0].length);
                                F1B.Crear(M2,M2.length, M2[0].length);
                                   do
                                {
                                    op = Val.Validar_int("""   
                                                Operaciones entre Tripletas 
                                                                                                                                   
                                            1. Suma.
                                            2. Multiplicación.
                                            3. Mostrar Tripletas con las que se operó.
                                            4. Salir
                                            
                                            """);
                                    switch (op)
                                    {
                                        case 1 ->
                                        {

                                            JOptionPane.showMessageDialog(null, """  
                                                                                Se realizará la suma con la siguiente tripleta
                                                                                """, "Operaciones con tripletas", 3);
                                            F1A.MostrarF1();
                                            
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Resultado de la tripleta suma
                                                                                """, "Resultado operaciones con tripletas", 3);
                                            F1.SumarF1(F1A);
                                          
                                        }
                                        case 2 ->
                                        {
                                            JOptionPane.showMessageDialog(null, "Metodo no funcional", "Escoge otra opción", 2);
                                            
                                        }
                                        case 3 ->
                                        {
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Tripletas utilizadas para la suma.
                                                                                """, "Operaciones con tripletas", 3);
                                            F1.MostrarF1();
                                            F1A.MostrarF1();
                                          
                                           
                                        }
                                        case 4 ->
                                        {}
                                        default->
                                        {
                                            JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                                        }
                                    }

                                } while (op != 4);
                                
                            }
                            case 8 ->
                            {

                            }

                            default ->
                            {
                                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                            }
                        }
                    } while (op != 8);
                }
                case 3 ->
                {
                    F2=new Forma2(M.length, M[0].length);
                    F2.Crear(M);
                    do
                    {

                        op = Val.Validar_int("""   
                                                Menú Tripletas Forma 2 
                                                                                                                                                  
                                            1. Mostrar Forma 2
                                            2. Suma de filas.
                                            3. Suma de Columnas.
                                            4. Insertar un dato.
                                            5. Eliminar un dato.
                                            6. Ver matriz inicial
                                            7. Operaciones Forma 2
                                            8. Volver al menú principal.
                                            """);
                        switch (op)
                        {

                            case 1 ->
                            {
                                F2.MostrarF2();
                            }
                            case 2->
                            {
                                F2.SumarFilas();
                            }
                            case 3 ->
                            {
                                F2.SumarColumnas();
                            }
                            case 4->
                            {
                                F2.Insertar(M);
                            }
                            case 5->
                            {
                                F2.Eliminar(M);
                            }
                            case 6 ->
                            {
                                m.Mostrar(M);
                            }
                            case 7->
                            {  
                                F2A.Crear(N);
                                   do
                                {
                                    op = Val.Validar_int("""   
                                                Operaciones entre Tripletas 
                                                                                                                                   
                                            1. Suma.
                                            2. Multiplicación.
                                            3. Mostrar Tripletas con las que se operó.
                                            4. Salir
                                            
                                            """);
                                    switch (op)
                                    {
                                        case 1 ->
                                        {

                                            JOptionPane.showMessageDialog(null, """  
                                                                                Se realizará la suma con la siguiente tripleta
                                                                                """, "Operaciones con tripletas", 3);
                                            F2A.MostrarF2();
                                            
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Resultado de la tripleta suma
                                                                                """, "Resultado operaciones con tripletas", 3);
                                            F2.Sumar(F2A);
                                          
                                        }
                                        case 2 ->
                                        {
                                           
                                            JOptionPane.showMessageDialog(null, "Metodo no funcional", "Escoge otra opción", 2);
                                        }
                                        case 3 ->
                                        {
                                            JOptionPane.showMessageDialog(null, """  
                                                                                Tripletas utilizadas para la suma.
                                                                                """, "Operaciones con tripletas", 3);
                                            F2.MostrarF2();
                                            F2A.MostrarF2();
                                            
                                            
                                           
                                        }
                                        case 4 ->
                                        {}
                                        default->
                                        {
                                            JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                                        }
                                    }

                                } while (op != 4);
                            }
                            case 8 ->
                            {

                            }

                            default ->
                            {
                                JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                            }
                        }
                    } while (op != 8);
                    
                    
                        
                    
                }
                case 4->
                {
                    JOptionPane.showMessageDialog(null, "Metodo no funcional", "Escoge otra opción", 2);
                }

                case 0 ->
                {
                    JOptionPane.showMessageDialog(null, "Adiós", "Salir", 3);
                }
                default ->
                {
                    JOptionPane.showMessageDialog(null, "Opción incorrecta", "Escoge otra opción", 2);
                }
            }
        } while (op != 0);

    }

}
