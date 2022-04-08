package com.dual.filewriter;

public class ExportarFichero
{
  public static void main(String[] args)
  {

    String file = "logs/file.csv";
    String separador = ";";
    String[][] datos =
      {{"JUAN ANTONIO","FERNANDEZ","RODRIGUEZ","JUANFERNANDEZ@BERGER-LEVRAULT.COM","JFERNANDEZ","123456"},
        {"MANUEL","PEREZ","PEREZ","MPEREZ@GMAIL.COM","MPEREZ","1234"},
        {"PEDRO","MARTINEZ","FERNANDEZ","PMARTINEZ@GMAIL.COM","PMARTINEZ","12345"},
        {"ANTONIO","GONZALEZ","GONZALEZ","AGONZALEZ@GMAIL.COM","AGONZALEZ","12345"}};
    try
    {

      UtilidadesCsv utilCsv = new UtilidadesCsv();
      utilCsv.exportarCsv(datos,file,separador);

      System.out.println("Fin de la escritura");
    }
    catch(Exception ioe)
    {
      ioe.printStackTrace();
    }
  }
}
