/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaslab;

/**
 *
 * @author Monica
 */
public class Ventaslab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int P1[] = new int[10];
        String P2[] = new String[10];
        int P3[] = new int[10];
        
        int C1[] = new int[10];
        String C2[] = new String[10];
        String C3[] = new String[10];
        int C4[]  = new int[10];
        
        int Vf1[] = new int[10];
        int Vf2[] = new int[10];
        int Vf3[] = new int[10];
        int Vf4[] = new int[10];
        int Vf5[] = new int[10];
        int Vc1[] = new int[10];
        int Vp1[][] = new int[10][10];
        int Vcan[][] = new int[10][10];
        int Vfp[] = new int[10];
        int Vdesc[] = new int[10];
        
        int Vtotal[] = new int[10];
        int CV[] = new int[10];
        
        
        //
        int i, np;
        java.util.Scanner lectura = 
                new java.util. Scanner(System.in);
        System.out.println("Ingrese cantidad de productos (menos de 10)");
        np= lectura.nextInt();
        for(i=0;i<np;i++){
            System.out.println("Ingrese el codigo " + (i+1));
            P1[i]= lectura.nextInt();
            java.util.Scanner sc = 
              new java.util. Scanner(System.in);
            System.out.println("Ingrese la descripcion " + (i+1));
            P2[i]= sc.nextLine();
            System.out.println("Ingrese el precio " + (i+1));
            P3[i]= lectura.nextInt();
        }
        //
        int nc;

        System.out.println("Ingrese cantidad de vendedores (menos de 10)");
        nc= lectura.nextInt();
        for(i=0;i<nc;i++){
            System.out.println("Ingrese el id del vendedor " + (i+1));
            C1[i]= lectura.nextInt();
            System.out.println("Ingrese nombre del vendedor " + (i+1));
            java.util.Scanner sc = 
              new java.util. Scanner(System.in);
            C2[i]= sc.nextLine();
            System.out.println("Ingrese apellido del vendedor " + (i+1));
            C3[i]= sc.nextLine();
        }
        // 
        int k,j,cdp,total=0;
        
        if(CV[i]!=1){
        System.out.println("Ingrese el dia");
        Vf1[i]= lectura.nextInt();
        System.out.println("Ingrese el mes");
        Vf2[i]= lectura.nextInt();
        System.out.println("Ingrese la hora(solo hora)");
        Vf3[i]= lectura.nextInt();
        System.out.println("Ingrese minutos");
        Vf4[i]= lectura.nextInt();    
        System.out.println("Ingrese el id del vendedor");
        Vc1[i]= lectura.nextInt();
        System.out.println("Ingrese la cantidad de productos");
        cdp= lectura.nextInt();
        for(j=0;j<cdp;j++){
            System.out.println("Ingrese el codigo del producto" + (j+1));
            Vp1[i][j]= lectura.nextInt();
            System.out.println("Ingrese la cantidad del producto" + (j+1));
            Vcan[i][j]= lectura.nextInt();
        }
        System.out.println("Ingrese la forma de pago(0 efectivo, 1 debito, 2 credito");
        Vfp[i]= lectura.nextInt();
        System.out.println("Ingrese el valor de descuento");
        Vdesc[i]= lectura.nextInt();
        for(k=0;k<np;k++){
            for(j=0;j<cdp;j++){
                if(P1[k]==Vp1[i][j]){
                total=total+(P3[k]+Vcan[i][j]);
                }
            }
            
        }
        Vtotal[i]=total-Vdesc[i];
        for(k=0;k<10;k++){
            if(C1[k]==Vc1[i]){
                C4[k]=C4[k]+1;
            }
        }
        
        CV[i]=1;
        // TODO code application logic here
        //mejorvendedor
             
        int posvm=0;
        int vmay = C4[0];
        for(i=1;i<nc;i++){
            if (C4[i]>vmay){
                vmay = C4[i];
                posvm = i;
            } 
            System.out.println(C4[i]);
        }
        
        System.out.println("El vendedor " + C2[posvm] + " " + C3[posvm] + " fué el que realizó mas ventas");
        for(i=0;i<10;i++){
            if(Vc1[i]==C1[posvm]){
                System.out.println("Datos venta");
                System.out.println("Fecha: " + Vf1[i] + "/" + Vf2[i]);
                System.out.println("Hora: " + Vf3[i] + ":" + Vf4[i]);
                for(j=0;j<10;j++){
                    if(Vp1[i][j]!=0 && Vcan[i][j] !=0){
                System.out.println("Producto: " + Vp1[i][j]);
                System.out.println("Cantidad: " + Vcan[i][j]);
                    }
                }
                System.out.println("Forma de pago" + Vfp[i]);
                System.out.println("Descuento" + Vdesc[i]);
                System.out.println("Valor total" + Vtotal[i]);
                
            }
        }
        }
        
        //
        //Listadebito( Vfp, Vc1, Vtotal);
        System.out.println("id vendedor Precio Final");
        
        for(i=0; i<10; i=i+1){
            if(Vfp[i]==1){
                System.out.println(Vc1[i] + " - " + Vtotal[i]); 
            }
        }  
        //  
        int cing, ping;
        
        System.out.println("Ingrese el id del vendedor");
        cing= lectura.nextInt();
        System.out.println("Ingrese el codigo del producto");
        ping= lectura.nextInt();
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(Vc1[i]==cing && Vp1[i][j]==ping){
                    System.out.println("Datos venta");
                    System.out.println("Fecha: " + Vf1[i] + "/" + Vf2[i]);
                    System.out.println("Hora: " + Vf3[i] + ":" + Vf4[i]);
                    System.out.println("Producto: " + Vp1[i][j]);
                    System.out.println("Cantidad: " + Vcan[i][j]);
                    System.out.println("Forma de pago: " + Vfp[i]);
                    System.out.println("Descuento: " + Vdesc[i]);
                    System.out.println("Valor total: " + Vtotal[i]);                                      
                }
            }
        }               
    }    
    
    public static void Listadebito(int Vfp[],int Vc1[], int Vtotal[]){
        System.out.println("id vendedor Precio Final");
        int i, n=10;
        for(i=0; i<n; i=i+1){
            if(Vfp[i]==1){
                System.out.println(Vc1[i] + Vtotal[i]); 
            }
        }          
    }
   
      
    
    
   
        
    
    
    int totalventas(){
       int a=0;
        return a;
    }
    
    void altacredito(){
        
    }
}
