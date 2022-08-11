package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int opcion, opcion2, opcion3;
		Scanner res =new Scanner (System.in);
	
		do {
		System.out.println("------------------MENU-----------------");
		System.out.println("1. Empleados");
		System.out.println("2. Miembros");
		System.out.println("3. Salir");
		System.out.println("---------------------------------------");
		opcion= res.nextInt();

		switch (opcion) {

		case 1:{
			System.out.println("1. Agregar empleado");
			System.out.println("2. Mostrar lista de empleados");
			System.out.println("3. volver");
           opcion2= res.nextInt();
			if(opcion2==1) {
                 System.out.println("Datos Generales");
				
				System.out.println("Ingrese un nombre");
				String name = res.next();
				
				System.out.println("Digite  la fecha de nacimiento");
				int birthdate = res.nextInt();
				
				System.out.println("Digite  la edad");
				int age = res.nextInt();	
				
				System.out.println("Digite el genero");
				String genero = res.next(); 
				 
				break;

			} else 
				if(opcion2==2) {
					
					System.out.println("Lista de empleados");
					

					
				} else 
					if(opcion2==3) {
						System.out.println(".............MENU..............");
						System.out.println("1. Empleados");
						System.out.println("2. Miembros");
						System.out.println("3. Salir");
						System.out.println("..............................");
						opcion= res.nextInt();
					}
			
			}	
		case 2:{
			System.out.println("1. Agregar miembro");
			System.out.println("2. Mostrar lista de miembros");
			System.out.println("3. volver");
             opcion3= res.nextInt();
             
             if(opcion3==1) {
            	 System.out.println("Datos Generales");
 				
 				System.out.println("Ingrese un nombre");
 				String name = res.next();
 				
 				System.out.println("Ingrese la fecha de nacimiento");
 				int birthdate = res.nextInt();
 				
 				
 				System.out.println("Ingrese la edad");
 				int age = res.nextInt();	
 				
 				System.out.println("Ingrese el genero");
 				String genero = res.next(); 
 				break;
 				
             } else 
            	 if(opcion3==2) {
            		 System.out.println("Lista de los miembros");
            		 
            	 } else 
            		 if(opcion3==3){
            			 System.out.println("------------------MENU-----------------");
 						System.out.println("1. Empleados");
 						System.out.println("2. Miembros");
 						System.out.println("3. Salir");
 						System.out.println("---------------------------------------");
 						opcion= res.nextInt();
            		 }
		}
		}
		}while(opcion!=3);
		System.out.println(".........El programa ha TERMINADO.....");
		}
		
	}

	
	

