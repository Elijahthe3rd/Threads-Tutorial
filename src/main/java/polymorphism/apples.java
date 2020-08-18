package polymorphism;

public class apples {

    public static void main(String[] args) {
    
        food kos[]=new food[2];
//        kos[0]=new tuna();
//        kos[1]=new potpie();
        for (int i = 0;i<kos.length;i++){
                    kos[i]=new tuna();
        }
        
        for (int j = 1;j<kos.length;j++){
                    kos[j]=new potpie();
        }
        for (food koso:
             kos) {
            koso.eat();
        }
            
    }
}
