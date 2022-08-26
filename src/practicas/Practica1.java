package practicas;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/**ORDENAMIENTO DE LISTA DE EMPLEADOS:
 * Curso Java OCP
 * @authores:Alexander Narváez y Sebastian  Londoño
 */

public class Practica1 {
 
   static final String rutaArchivo = "D:/Empleados.data";
   
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Digite el tipo de ordenamineto, así: 1.Orden alfabético (apellido)" + " 2. Tipo de contrato:");

    try {
      String tipOrden = sc.nextLine();

      System.out.println();
      List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo), StandardCharsets.ISO_8859_1);

      List<Empleado> empList = cargarEmpleados(lineas);

      ordenarEmpleados(tipOrden, empList);

      validarDatos(empList);

      imprimir(empList);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void imprimir(List<Empleado> empList) {
    for (Empleado e : empList) {
      System.out.println(e);
       System.out.println("");
    }
  }

  private static void validarDatos(List<Empleado> empList) {
    for (Empleado e : empList) {
      // Se valida si falto algún campo
      if ("".equals(e.getNombre()) || "".equals(e.getApellido()) || "".equals(e.getCedula()) || "".equals(e.getTelefono()) || "".equals(e.getSalario())
          || "".equals(e.getTipoContrato()) || "".equals(e.getEstado())) {
        e.setValido(false);
        e.setQueMalo("Algo Vacio");
      } else
      // Se valida el tipo de contrato
      if (!"INDEFINIDO".equals(e.getTipoContrato().toUpperCase()) && !"FIJO".equals(e.getTipoContrato().toUpperCase())
          && !"SERVICIOS".equals(e.getTipoContrato().toUpperCase())) {
        e.setValido(false);
        e.setQueMalo("Tipo Contrato Erroneo");
      } else {
        // Valida que el telefono sea valido
        String regex = "(\\(\\d+\\))?[\\d ]+";
        if (!Pattern.matches(regex, e.getTelefono())) {
          e.setValido(false);
          e.setQueMalo("Teléfono malo");
        } else {
          // Valida que el salario sea valido
          String salario = e.getSalario().trim();
          if (salario.startsWith("$")) {
            salario = salario.substring(1);
          }
          try {
            Double.parseDouble(salario);

            // Se valida el estado
            if (!"ACTIVO".equals(e.getEstado().toUpperCase()) && !"PENSIONADO".equals(e.getEstado().toUpperCase())
                && !"DESPEDIDO".equals(e.getEstado().toUpperCase()) && !"SUSPENDIDO".equals(e.getEstado().toUpperCase())) {
              e.setValido(false);
              e.setQueMalo("Estado Erroneo");
            }
          } catch (NumberFormatException ex) {
            e.setValido(false);
            e.setQueMalo("Salario Malo");
          }
        }
      }
    }
  }

  private static void ordenarEmpleados(String tipOrden, List<Empleado> empList) {
    if ("1".equals(tipOrden)) {
      Collections.sort(empList, new Comparator<Empleado>() {
        @Override
        public int compare(Empleado e1, Empleado e2) {
          // toUpperCase() se convierte a mayusculas para que no importe el case
          return e1.getApellido().toUpperCase().compareTo(e2.getApellido().toUpperCase());
        }
      });
    } else {
      Collections.sort(empList, new Comparator<Empleado>() {
        @Override
        public int compare(Empleado e1, Empleado e2) {
          // toUpperCase() se convierte a mayusculas para que no importe el case
          return e1.getTipoContrato().toUpperCase().compareTo(e2.getTipoContrato().toUpperCase());
        }
      });
    }
  }

  private static List<Empleado> cargarEmpleados(List<String> lineas) {
    List<Empleado> empList = new ArrayList<>(lineas.size());

    for (String emp : lineas) {
      String[] datosEmp = emp.split("\\|");

      Empleado e = new Empleado();
      switch (datosEmp.length) {
        case 7:
          e.setEstado(datosEmp[6]);
        case 6:
          e.setTipoContrato(datosEmp[5]);
        case 5:
          e.setSalario(datosEmp[4]);
        case 4:
          e.setTelefono(datosEmp[3]);
        case 3:
          e.setCedula(datosEmp[2]);
        case 2:
          e.setApellido(datosEmp[1]);
        case 1:
          e.setNombre(datosEmp[0]);
      }

      empList.add(e);
    }
    return empList;
  }
}
