package structuralDP.facadeDP;

public class FacadeEncryptor {

    private AESEncryptor aesEncryptor= new AESEncryptor();

    private MD5Encryptor md5Encryptor= new MD5Encryptor();

    private SHAEncryptor shaEncryptor= new SHAEncryptor();

    public void encryptor(String text, EncryptType encryptType){
        switch (encryptType){
            case MD5: md5Encryptor.encryptMD5(text,"SecretMessage");
            break;
            case SHA: shaEncryptor.encryptSHA(text,"SecretKey", true);
            break;
            case AES: aesEncryptor.encryptAES(text);
            break;
            default: throw new IllegalArgumentException(encryptType.toString());
        }

    }
    public enum EncryptType{
        SHA,
        MD5,
        AES
    }
}
