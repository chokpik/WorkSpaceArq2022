package patrones.estructurales.facadepractica1;

import patrones.estructurales.facadepractica1.apis.MD5EncryptorAPI;
import patrones.estructurales.facadepractica1.apis.SHA256EncryptorAPI;
import patrones.estructurales.facadepractica1.apis.SHAEncryptorAPI;

public class CheckFacade {
    public MD5EncryptorAPI md5encryptorApi;
    public SHA256EncryptorAPI sha256encryptorApi;
    public SHAEncryptorAPI shaencrytorApi;
    
    public CheckFacade(){
    md5encryptorApi = new MD5EncryptorAPI();
    sha256encryptorApi = new SHA256EncryptorAPI();
    shaencrytorApi = new SHAEncryptorAPI();
    }
    
    public void Enviar(String text){
        System.out.println(md5encryptorApi.encrypt(text));
        System.out.println(sha256encryptorApi.encrypt(text));
        System.out.println(shaencrytorApi.encrypt(text));
    }
}
