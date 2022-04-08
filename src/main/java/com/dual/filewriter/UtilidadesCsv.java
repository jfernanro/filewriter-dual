package com.dual.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UtilidadesCsv
{
  private static String SALTO_LINEA = "\n";

  public boolean exportarCsv(String[][] datos,String file,String separador)
  {
    boolean resultado = true;

    try
    {
      FileWriter writer = new FileWriter(file);
      PrintWriter printer = new PrintWriter(file);

      for(int i = 0;i < datos.length;i++)
      {
        String linea = "";
        for(int j = 0;j < datos[i].length;j++)
        {
          linea += datos[i][j] + separador;
        }
        linea += SALTO_LINEA;

        printer.write(linea);

        System.out.println(linea);
      }

      printer.close();
      writer.close();
    }

    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return resultado;
  }

}
