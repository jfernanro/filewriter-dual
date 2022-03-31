package com.dual.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExportarFichero
{
  public static void main(String[] args)
  {
    String file = "logs/file.txt";
    try
    {
      FileWriter writer = new FileWriter(file);
      PrintWriter printer = new PrintWriter(file);
      printer.write("Contenido del fichero");
      printer.close();
      writer.close();
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
}
