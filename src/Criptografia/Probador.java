
package Criptografia;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 /**    
  * Cifrado/Decifrado con AES y llave simétrica en Java
  * Encriptar y desencriptar con AES y llave simétrica.
  * En este caso se emplea AES-256, por lo que deberemos tener una clave de largo 32 (32 * 8 = 256).
  */
public class Probador {
 
 public static void main(String[] args) {
  // llaveSimetrica es un String de largo múltiplo de 8
  // en este caso si es de largo 32 nos permite AES-256 (32 * 8)
  //String llaveSimetrica = "holamundocruel12holamundocruel12"; para usar esta de 32 bytes(256 bits) se necesita 
  /* librería de criptografía Java no soporta encriptación fuerte (AES > 128).
//to run encryption stronger than 128-bit you will need to download and install 'Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files 6' from http://www.oracle.com/technetwork/java/javase/downloads/index.html.
   */  
     String llaveSimetrica = "FBkrugerQ!p0W"+"\""+"09"; //16 bytes (128 bits)
   
  SecretKeySpec key = new SecretKeySpec(llaveSimetrica.getBytes(), "AES");
  Cipher cipher;
  try {
   cipher = Cipher.getInstance("AES");
    
   //Comienzo a encriptar
   cipher.init(Cipher.ENCRYPT_MODE, key);
   byte[] campoCifrado = cipher.doFinal("mensaje_secreto".getBytes());
   /*
    * TODO: Representar los bytes como string vía base64, así será
    * humanamente leíble. La otra opción es expresar como hexadecimal
    * 
    * En este caso lo imprimo en pantalla como bytes.
    */
   System.out.println(new String(campoCifrado));
   
   //Comienzo a desencriptar
   cipher.init(Cipher.DECRYPT_MODE, key);
   byte[] datosDecifrados = cipher.doFinal(campoCifrado);
   String mensaje_original = new String(datosDecifrados); 
   System.out.println(mensaje_original);
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}