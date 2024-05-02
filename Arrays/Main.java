

public class Main {
    public static void main(String[] args) {
        int n [] = {1, 2, 5, 5, 5, 5, 7, 8, 9};
        int count = 0;
        for(int i = 0; i < n.length; i++){
     
            if(n[i] == n[i + 1]){
                count++;
            }
            else{
                
            }
            
            System.out.println(n[i]);
        }
        System.out.println(count);
    } 
}
