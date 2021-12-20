


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;

interface SchoolDepartment {
   public void accept(SchoolDepartmentVisitor computerPartVisitor);
}

class languageDepartment implements SchoolDepartment {

   @Override
   public void accept(SchoolDepartmentVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

class HistoryDepartment implements SchoolDepartment {

   @Override
   public void accept(SchoolDepartmentVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

class MathDepartment implements SchoolDepartment {

   @Override
   public void accept(SchoolDepartmentVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}








class School implements SchoolDepartment {

   SchoolDepartment[] parts;

   public School(){
      parts = new SchoolDepartment[] {new MathDepartment(), new languageDepartment(), new HistoryDepartment()};
   }


   @Override
   public void accept(SchoolDepartmentVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}





interface SchoolDepartmentVisitor {
	public void visit(School computer);
	public void visit(MathDepartment mouse);
	public void visit(languageDepartment keyboard);
	public void visit(HistoryDepartment monitor);
}





class SchoolDepartmentDisplayVisitor implements SchoolDepartmentVisitor {

   @Override
   public void visit(School computer) {
      System.out.println("Informe departamento Escuela.");
   }

   @Override
   public void visit(MathDepartment mouse) {
      System.out.println("Informe departamento Matematicas.");
   }

   @Override
   public void visit(languageDepartment keyboard) {
      System.out.println("Informe departamento Lenguaje.");
   }

   @Override
   public void visit(HistoryDepartment monitor) {
      System.out.println("Informe departamento Historia.");
   }
}

public class Main
{
	public static void main(String[] args)
	{


		System.out.println(" \n \n Main test -> \n");
		System.out.println(" -------------------------------------------- \n");

		SchoolDepartment computer = new School();
    computer.accept(new SchoolDepartmentDisplayVisitor());


	}
}
