// import java.util.Scanner;
class StarPattern{
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*\t");
            }System.out.println();
        }
        System.out.println();
        
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*\t");
            }System.out.println();
        }
        System.out.println();
        
        for(int i=0; i<5; i++){
            for(int j=4-i; j>0; j--){
                System.out.print("\t");
            }
            for(int k=0; k<i+1; k++){
                System.out.print("*\t");
            }System.out.println();
        }
        
        

        
    }
}