package libroCap01;

public class CAdena7a {
    public static void main(String[] args) {
        String s = " Juan| Marcos | Caelos | Matias";
        String token [] = s.split("[|]");

        for (int i = 0; i < token.length ; i++) {
            System.out.println(token[i]);
        }
    }
}
