

package archivos;

/**
 *The java.io.RandomAccessFile.readLine() method reads the next line of text from this file. 
 * This method successively reads bytes from the file, starting at the current file pointer, 
 * until it reaches a line terminator or the end of the file. Each byte is converted into a 
 * character by taking the byte's value for the lower eight bits of the character and setting 
 * 
 * the high eight bits of the character to zero.
 */
 import java.io. *;

 public class RandomAccessFileDemo {

  

    public static void main(String[] args) {
       try {
          // create a new RandomAccessFile with filename test
          RandomAccessFile raf = new RandomAccessFile("c:/test.txt", "rw");

          // write something in the file
          raf.writeUTF("Hello World");

          // set the file pointer at 0 position
          raf.seek(0);

          // print the line
          System.out.println("" + raf.readLine());

          // set the file pointer at 0 position
          raf.seek(0);

          // write something in the file
          raf.writeUTF("This is an example \n Hello World");

          raf.seek(0);
          // print the line
          System.out.println("" + raf.readLine());
       } catch (IOException ex) {
          ex.printStackTrace();
       }

    }
 }