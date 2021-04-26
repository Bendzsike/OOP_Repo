package labor10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileUtil.encode("Labor_10/fileForEncode.txt", "Labor_10/encodedFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileUtil.decode("Labor_10/encodedFile.txt", "Labor_10/decodedFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
