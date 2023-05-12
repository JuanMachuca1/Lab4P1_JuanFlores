/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4p1_juanflores;
import java.util.Scanner;
/**
 *
 * @author Juan David
 */
public class Lab4P1_JuanFlores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
        boolean menu=true;
        
        while(menu){
        System.out.println("Menu"); 
        System.out.println("1. Conjuntos");
        System.out.println("2. Contraseña Mejorada");
        System.out.println("3. Salir");
        System.out.println("Ingresar una opcion: ");
        int opcion=leer.nextInt();
        
        switch(opcion){
            
            case 1:
            {
                
                String conjunto,conjunto2;
                boolean cade1=true;
                boolean cade2=true;
                
                System.out.println("ingresar el primer conjunto: ");
                conjunto=leer.next();
                
                while(cade1){
                for (int x = 0; x <conjunto.length(); x++) {
                    char y=conjunto.charAt(x);
                    
                    if(x==0 && (y>=65 && y<=90 )){
                        cade1=false;
                    }else if(x==1 && y==61){
                        cade1=false;
                    }else if(x==2 && y==123){
                        cade1=false;
                    }
                }
                if(cade1==false){
                System.out.println("ingresar de nuevo el primer conjunto: ");
                conjunto=leer.next();
                }
            } 
                
                
                System.out.println("Ingresar el segundo conjunto: ");
                conjunto2=leer.next();
                
                
                while(cade2){
                for (int z = 0; z <conjunto.length(); z++) {
                    char i=conjunto.charAt(z);
                    
                    if(z==0 && (i>=65 && i<=90 )){
                        cade2=false;
                    }else if(z==1 && i==61){
                        cade2=false;
                    }else if(z==2 && i==123){
                        cade2=false;
                    }
                }
                if(cade2==false){
                System.out.println("ingresar de nuevo segundo conjunto: ");
                conjunto2=leer.next();
                }
            }
               
               
                
                
                
                System.out.println(":/");
                
                
                
                
                
            }
            break;
            
            case 2:
            {
                String contra;
                System.out.println("ingresar una contraseña: ");
                contra=leer.next();
                System.out.println("ingrese un numero: ");
                int n=leer2.nextInt();
                
                boolean carac=false;
                boolean letra=false;
                boolean numero=false;
                boolean contraSeg=false;
                int let=0,num=0;
               
                while(contraSeg==false){
                    
                    for (int i = 0; i <contra.length(); i++) {
                        char x=contra.charAt(i);
                        int c1=x;
                        if((c1>=65 && c1<=90)|| (c1>=97 && c1<=122)){
                            let++;
                        }else if(c1>=48 && c1<=57){
                            num++; 
                        }
                     
                    }
                    if(contra.length()>=8){
                        carac=true;
                    }
                     
                 
                    if(num>0){
                       numero=true;
                    }
                    
                    if(let>0){
                      letra=true;
                    }
                        
                   
                    if(numero==false){
                        System.out.println("la contraseña no es segura por que no contiene numeros ");
                    }
                    if(letra==false){
                        System.out.println("La contraseña no es segura porque no contiene letras");
                    }
                    if(carac==false){
                        System.out.println("la contraseña no es segura porque no tiene 8 caracteres");
                    }
                    
                    if(numero&&letra&&carac){
                        System.out.println("la contraseña es segura");
                        contraSeg=true;
                        
                    }
                    
                    if (contraSeg==false){
                    System.out.println("ingresar una contraseña: ");
                    contra=leer.next();
                    System.out.println("ingrese un numero: ");
                    n=leer2.nextInt();
                    }
                }
                    String new_contra="";
                    
                    
                    int cont_ult=1;
                       
                  
                    for (int j = 0; j < contra.length(); j++) {
                        char y=contra.charAt(j);
                        
                        new_contra=new_contra+y;
                        
                       if(j==cont_ult){
                           
                           new_contra=new_contra+n;
                           n=n+1;
                           cont_ult+=2;
                       }
                        
                       
                        
                }
                     System.out.println("la nueqa contraseña es: " + new_contra);
               
                    
                
                   
            }
            break;
            
            case 3:
            {
                menu=false;
                System.out.println("ha salido del menu");
            }
            default:
            {
                menu=false;
                 
            }
            break;
        }
        
     }
    }
}
    
    
