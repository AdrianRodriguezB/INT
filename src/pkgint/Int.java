/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Int {

    static int fila = 0;

    int tabla(int columna) {

        int tl[][] = new int[19][16];
        
          tl[0][15] = 1;
        tl[1][15] = -1;
        tl[2][15] = -1;
        tl[3][15] = -1;
        tl[4][15] = 5;
        tl[5][15] = -1;
        tl[6][15] = -1;
        tl[7][15] = -1;
        tl[8][15] = -1;
        tl[9][15] = -1;
        tl[10][15] = -1;
        tl[11][15] = -1;
        tl[12][15] = -1;
        tl[13][15] = -1;
        tl[14][15] = -1;
        tl[15][15] = -1;
        tl[16][15] = -1;
        tl[17][15] = 5;
        tl[18][15] = -1;
        
        
        tl[0][0] = 1;
        tl[1][0] = -1;
        tl[2][0] = -1;
        tl[3][0] = -1;
        tl[4][0] = 5;
        tl[5][0] = -1;
        tl[6][0] = -1;
        tl[7][0] = -1;
        tl[8][0] = -1;
        tl[9][0] = -1;
        tl[10][0] = -1;
        tl[11][0] = -1;
        tl[12][0] = -1;
        tl[13][0] = -1;
        tl[14][0] = -1;
        tl[15][0] = -1;
        tl[16][0] = -1;
        tl[17][0] = 5;
        tl[18][0] = -1;


        tl[0][1] = -1;
        tl[1][1] = 2;
        tl[2][1] = -1;
        tl[3][1] = -1;
        tl[4][1] = 5;
        tl[5][1] = -1;
        tl[6][1] = -1;
        tl[7][1] = -1;
        tl[8][1] = -1;
        tl[9][1] = -1;
        tl[10][1] = -1;
        tl[11][1] = -1;
        tl[12][1] = -1;
        tl[13][1] = -1;
        tl[14][1] = -1;
        tl[15][1] = -1;
        tl[16][1] = -1;
        tl[17][1] = 5;
        tl[18][1] = -1;


        tl[0][2] = -1;
        tl[1][2] = -1;
        tl[2][2] = 3;
        tl[3][2] = -1;
        tl[4][2] = 5;
        tl[5][3] = -1;
        tl[6][2] = -1;
        tl[7][2] = -1;
        tl[8][2] = -1;
        tl[9][2] = -1;
        tl[10][2] = -1;
        tl[11][2] = 12;
        tl[12][2] = -1;
        tl[13][2] = -1;
        tl[14][2] = -1;
        tl[15][2] = -1;
        tl[16][2] = -1;
        tl[17][2] = 5;
        tl[18][2] = -1;

        tl[0][3] = -1;
        tl[1][3] = -1;
        tl[2][3] = -1;
        tl[3][3] = 4;
        tl[4][3] = -1;
        tl[5][3] = -1;
        tl[6][3] = -1;
        tl[7][3] = -1;
        tl[8][3] = -1;
        tl[9][3] = -1;
        tl[10][3] = -1;
        tl[11][3] = -1;
        tl[12][3] = 4;
        tl[13][3] = -1;
        tl[14][3] = -1;
        tl[15][3] = -1;
        tl[16][3] = 4;
        tl[17][3] = -1;
        tl[18][3] = -1;

        
        
        tl[0][4] = -1;
        tl[1][4] = -1;
        tl[2][4] = -1;
        tl[3][4] = -1;
        tl[4][4] = 5;
        tl[5][4] = -1;
        tl[6][4] = -1;
        tl[7][4] = -1;
        tl[8][4] = -1;
        tl[9][4] = -1;
        tl[10][4] = -1;
        tl[11][4] = -1;
        tl[12][4] = -1;
        tl[13][4] = -1;
        tl[14][4] = -1;
        tl[15][4] = -1;
        tl[16][4] = -1;
        tl[17][4] = 18;
        tl[18][4] = -1;


        tl[0][5] = -1;
        tl[1][5] = -1;
        tl[2][5] = -1;
        tl[3][5] = -1;
        tl[4][5] = -1;
        tl[5][5] = 6;
        tl[6][5] = -1;
        tl[7][5] = -1;
        tl[8][5] = -1;
        tl[9][5] = -1;
        tl[10][5] = -1;
        tl[11][5] = -1;
        tl[12][5] = -1;
        tl[13][5] = -1;
        tl[14][5] = -1;
        tl[15][5] = -1;
        tl[16][5] = -1;
        tl[17][5] = -1;
        tl[18][5] = -1;


        tl[0][6] = -1;
        tl[1][6] = -1;
        tl[2][6] = -1;
        tl[3][6] = -1;
        tl[4][6] = -1;
        tl[5][6] = -1;
        tl[6][6] = 6;
        tl[7][6] = -1;
        tl[8][6] = -1;
        tl[9][6] = -1;
        tl[10][6] = -1;
        tl[11][6] = -1;
        tl[12][6] = -1;
        tl[13][6] = -1;
        tl[14][6] = -1;
        tl[15][6] = -1;
        tl[16][6] = -1;
        tl[17][6] = -1;
        tl[18][6] = -1;


        tl[0][7] = -1;
        tl[1][7] = -1;
        tl[2][7] = -1;
        tl[3][7] = -1;
        tl[4][7] = -1;
        tl[5][7] = 7;
        tl[6][7] = 7;
        tl[7][7] = -1;
        tl[8][7] = -1;
        tl[9][7] = -1;
        tl[10][7] = -1;
        tl[11][7] = -1;
        tl[12][7] = -1;
        tl[13][7] = -1;
        tl[14][7] = -1;
        tl[15][7] = -1;
        tl[16][7] = -1;
        tl[17][7] = -1;
        tl[18][7] = 7;
        
        
        tl[0][8] = 8;
        tl[1][8] = -1;
        tl[2][8] = -1;
        tl[3][8] = -1;
        tl[4][8] = 5;
        tl[5][8] = -1;
        tl[6][8] = -1;
        tl[7][8] = -1;
        tl[8][8] = -1;
        tl[9][8] = -1;
        tl[10][8] = -1;
        tl[11][8] = -1;
        tl[12][8] = -1;
        tl[13][8] = -1;
        tl[14][8] = -1;
        tl[15][8] = -1;
        tl[16][8] = -1;
        tl[17][8] = 5;
        tl[18][8] = -1;
        
        
        tl[0][9] = -1;
        tl[1][9] = -1;
        tl[2][9] = -1;
        tl[3][9] = -1;
        tl[4][9] = 5;
        tl[5][9] = -1;
        tl[6][9] = -1;
        tl[7][9] = -1;
        tl[8][9] = 9;
        tl[9][9] = -1;
        tl[10][9] = -1;
        tl[11][9] = -1;
        tl[12][9] = -1;
        tl[13][9] = -1;
        tl[14][9] = -1;
        tl[15][9] = -1;
        tl[16][9] = -1;
        tl[17][9] = 5;
        tl[18][9] = -1;
       
        
        tl[0][10] = -1;
        tl[1][10] = -1;
        tl[2][10] = -1;
        tl[3][10] = -1;
        tl[4][10] = 5;
        tl[5][10] = -1;
        tl[6][10] = -1;
        tl[7][10] = -1;
        tl[8][10] = -1;
        tl[9][10] = 10;
        tl[10][10] = -1;
        tl[11][10] = -1;
        tl[12][10] = -1;
        tl[13][10] = -1;
        tl[14][10] = -1;
        tl[15][10] = -1;
        tl[16][10] = -1;
        tl[17][10] = 5;
        tl[18][10] = -1;
        
        tl[0][11] = -1;
        tl[1][11] = -1;
        tl[2][11] = -1;
        tl[3][11] = -1;
        tl[4][11] = 5;
        tl[5][11] = -1;
        tl[6][11] = -1;
        tl[7][11] = -1;
        tl[8][11] = -1;
        tl[9][11] = -1;
        tl[10][11] = 11;
        tl[11][11] = -1;
        tl[12][11] = -1;
        tl[13][11] = -1;
        tl[14][11] = 15;
        tl[15][11] = -1;
        tl[16][11] = -1;
        tl[17][11] = 5;
        tl[18][11] = -1;
        
     
       
         tl[0][12] = 13;
        tl[1][12] = -1;
        tl[2][12] = -1;
        tl[3][12] = -1;
        tl[4][12] = 5;
        tl[5][12] = -1;
        tl[6][12] = -1;
        tl[7][12] = -1;
        tl[8][12] = -1;
        tl[9][12] = -1;
        tl[10][12] = -1;
        tl[11][12] = -1;
        tl[12][12] = -1;
        tl[13][12] = -1;
        tl[14][12] = -1;
        tl[15][12] = -1;
        tl[16][12] = -1;
        tl[17][12] = 5;
        tl[18][12] = -1;
      
         tl[0][13] = -1;
        tl[1][13] = -1;
        tl[2][13] = -1;
        tl[3][13] = -1;
        tl[4][13] = 5;
        tl[5][13] = -1;
        tl[6][13] = -1;
        tl[7][13] = -1;
        tl[8][13] = -1;
        tl[9][13] = -1;
        tl[10][13] = -1;
        tl[11][13] = -1;
        tl[12][13] = -1;
        tl[13][13] = 14;
        tl[14][13] = -1;
        tl[15][13] = -1;
        tl[16][13] = -1;
        tl[17][13] = 5;
        tl[18][13] = -1;
      
         tl[0][14] = -1;
        tl[1][14] = -1;
        tl[2][14] = -1;
        tl[3][14] = -1;
        tl[4][14] = 5;
        tl[5][14] = -1;
        tl[6][14] = -1;
        tl[7][14] = -1;
        tl[8][14] = -1;
        tl[9][14] = -1;
        tl[10][14] = -1;
        tl[11][14] = -1;
        tl[12][14] = -1;
        tl[13][14] = -1;
        tl[14][14] = -1;
        tl[15][14] = 16;
        tl[16][14] = -1;
        tl[17][14] = 5;
        tl[18][14] = -1;
      
       
        
        
        
        
        return tl[fila][columna];
        
    }

    int obtenerColuna(char A) {
        int columna;

        switch (A) {
            
            case 'b':
                columna=15;
                break;
                case 'd':
                columna=15;
                break;
                case 'e':
                columna=15;
                break;
                case 'g':
                columna=15;
                break;
                case 'j':
                columna=15;
                break;
                case 'k':
                columna=15;
                break;
                case 'm':
                columna=15;
                break;
                
                case 'p':
                columna=15;
                break;
                case 'q':
                columna=15;
                break;
                case 's':
                columna=15;
                break;
                case 'u':
                columna=15;
                break;
                case 'v':
                columna=15;
                break;
                case 'w':
                columna=15;
                break;
                case 'x':
                columna=15;
                break;
                case 'y':
                columna=15;
                break;
                case 'z':
                columna=15;
                break;
            
            
            
            case 'i':
                columna = 0;
                break;
            case 'n':
                columna = 1;
                break;
            case 't':
                columna = 2;
                break;
            case 'f':
                columna = 8;
                break;
            case 'l':
                columna = 9;
                break;
            case 'o':
                columna = 10;
                break;
                case 'a':
                columna = 11;
                break;
            case 'c':
                columna = 12;
                break;
            case 'h':
                columna = 13;
                break;
            case 'r':
                columna = 14;
                break;
                    
                
                    
                
            case ' ':
                columna = 3;
                break;

            case '=':
                columna = 5;
                break;

            case 'A':
                columna = 4;
                break;
            case 'B':
                columna = 4;
                break;
            case 'C':
                columna = 4;
                break;
            case 'D':
                columna = 4;
                break;
            case 'E':
                columna = 4;
                break;
            case 'F':
                columna = 4;
                break;
            case 'G':
                columna = 4;
                break;
            case 'H':
                columna = 4;
                break;
            case 'I':
                columna = 4;
                break;
            case 'J':
                columna = 4;
                break;
            case 'K':
                columna = 4;
                break;
            case 'L':
                columna = 4;
                break;
            case 'M':
                columna = 4;
                break;
            case 'N':
                columna = 4;
                break;
            case 'O':
                columna = 4;
                break;
            case 'P':
                columna = 4;
                break;
            case 'Q':
                columna = 4;
                break;
            case 'R':
                columna = 4;
                break;
            case 'S':
                columna = 4;
                break;
            case 'T':
                columna = 4;
                break;
            case 'U':
                columna = 4;
                break;
            case 'V':
                columna = 4;
                break;
            case 'W':
                columna = 4;
                break;
            case 'X':
                columna = 4;
                break;
            case 'Y':
                columna = 4;
                break;
            case 'Z':
                columna = 4;
                break;

            case '0':
                columna = 6;
                break;
           
            case '1':
                columna = 6;
                break;
            case '2':
                columna = 6;
                break;
            case '3':
                columna = 6;
                break;
            case '4':
                columna = 6;
                break;
            case '5':
                columna = 6;
                break;
            case '6':
                columna = 6;
                break;
            case '7':
                columna = 6;
                break;
            case '8':
                columna = 6;
                break;
            case '9':
                columna = 6;
                break;
            case ';':
                columna = 7;
                break;

            default:
                columna = -1;
        }

        return columna;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File archivo = new File("t2.txt");
        Int obtener = new Int();
        FileReader Lectura = new FileReader(archivo);
        BufferedReader datos = new BufferedReader(Lectura);
        String cadena = datos.readLine();
        int i, columna, finall = 7;
        int tam = cadena.length();
        char[] A = new char[tam];
        try {
            for (i = 0; i < tam; i++) {
                System.out.println(cadena.charAt(i));
                A[i] = cadena.charAt(i);

                columna = obtener.obtenerColuna(A[i]);
                fila = obtener.tabla(columna);
                if (fila == finall) {
                    System.out.println("bien");
                }
                if (fila == -1) {
                    System.out.println("mal");
                }
            }
            if (fila != finall) {
                System.out.println("mal");
            }

        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
