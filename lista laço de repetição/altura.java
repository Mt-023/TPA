public class altura {

    public static void main(String[] args) {
        
        double aj = 134.0, ap = 145.0, cj = 2.5, cp = 2.0;   
        int i = 0;
        
        while (aj <= ap) {
           
            aj += cj;
            ap += cp;
            
            i++;
        }
        
        
        System.out.println("João demorará " + i + " anos para ser mais alto que Pedro.");
    }
}

