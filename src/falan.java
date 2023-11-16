import java.time.Duration;

import static java.lang.Thread.sleep;

public class falan {
    public static void main(String[] args) throws InterruptedException {
        char[] hello = "hello world".toCharArray();
        char[] finish = "           ".toCharArray();
        for (int i = 0; i < hello.length; i++) {
            for (int j = 97; j <= 122; j++) {
                char letter = (char) j;
                finish[i] = letter;
                System.out.println(finish);
                sleep(Duration.ofMillis(100));
                if (hello[i] == ' ') {
                    finish[i] = ' ';
                    break;
                }
                if (letter == hello[i]) {
                    break;
                }


            }
        }
    }
}
