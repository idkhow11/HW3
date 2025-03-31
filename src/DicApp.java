import java.util.Objects;
import java.util.Scanner;

public class DicApp {
    Scanner scanner = new Scanner(System.in);
    String word;

    public void Running(){
        while(true){
            System.out.print("한글 단어? ");
            word = scanner.next();
            String result = Dictionary.kor2Eng(word);
            if(Objects.equals(word, "그만")){
                break;
            }

            if(result == (null)){
                System.out.println(word + "은 저의 사전에 없습니다.");
            }
            else{
                System.out.println(word + "은 " + result);
            }
        }
    }
    public static void main(String[] args) {
        DicApp dicApp = new DicApp();
        System.out.println("한영 단어 검색 프로그램입니다.");
        dicApp.Running();
    }
}
