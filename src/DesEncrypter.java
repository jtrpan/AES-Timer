import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

class DesEncrypter {
    Cipher ecipher;

    Cipher dcipher;

    DesEncrypter(SecretKey key) throws Exception {
        ecipher = Cipher.getInstance("DES");
        dcipher = Cipher.getInstance("DES");
        ecipher.init(Cipher.ENCRYPT_MODE, key);
        dcipher.init(Cipher.DECRYPT_MODE, key);
    }

    public String encrypt(String str) throws Exception {
        // Encode the string into bytes using utf-8
        byte[] utf8 = str.getBytes(StandardCharsets.UTF_8);

        // Encrypt
        byte[] enc = ecipher.doFinal(utf8);

        // Encode bytes to base64 to get a string
        //return new sun.misc.BASE64Encoder().encode(enc);
        return "placeholder";
    }

    public String decrypt(String str) throws Exception {
        // Decode base64 to get bytes
        //byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

        //byte[] utf8 = dcipher.doFinal(dec);

        float cTime = System.nanoTime();
        // Decode using utf-8
        return new String(utf8, StandardCharsets.UTF_8);
        //return "placeholder";

    }
}

