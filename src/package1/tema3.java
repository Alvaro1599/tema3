package package1;

public class tema3 {
    public static void main(String[] args) {
        String[] nombres={"nombre1","nombre4","nombre3","nombre2"};
        String answer="";
        for (int num=0;num<nombres.length;num++){
            answer+=" "+nombres[num];
        }
        System.out.println(answer);
    }
}
