package structuralDP.facadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        //text must be encrypted
        String text="Content";
        // bad scenario
        AESEncryptor aesEncryptor= new AESEncryptor();
        aesEncryptor.encryptAES(text);

        MD5Encryptor md5Encryptor= new MD5Encryptor();
        md5Encryptor.encryptMD5(text, "Security");

        SHAEncryptor shaEncryptor= new SHAEncryptor();
        shaEncryptor.encryptSHA(text,"securityKey", true);

        // good scenario

        FacadeEncryptor facadeEncryptor= new FacadeEncryptor();
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.MD5);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.SHA);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.AES);
    }
}
