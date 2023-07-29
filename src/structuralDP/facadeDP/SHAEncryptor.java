package structuralDP.facadeDP;

public class SHAEncryptor {
    public void encryptSHA(String plaintext, String securityKey, boolean type){
        if(type){
            System.out.println("<SHA>"+plaintext+securityKey+"<SHA>");

        } else{
            System.out.println("<SHA>"+securityKey+plaintext+"<SHA>" );
        }

    }
}
