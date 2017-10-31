
package calculos_matematicos;


public class Calculos_Matematicos {
    
    
    public static int euclides(int x, int y, int z){
        if(x % y == 0){
            if(z % y == 0){
                return y;
            }
            else{
                int tmp = z % y;
                z = y;
                y = tmp;
                return euclides(x, y, z);
            }
        }
        else{
            int temp = x % y;
            x = y;
            y = temp;
            return euclides(x, y, z);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(euclides(64, 24, 12));
    }
    
}
