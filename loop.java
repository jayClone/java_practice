public class loop {
//loop method
    public static void main (String[] args){
        int i=0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        i=0;// reset i
       for (  i=0; i<10; i++) {
           System.out.println(i);
       }
       i=0;//reset i
        do {
            System.out.println(i);
            i++;
       } while (i<10);
    }
}