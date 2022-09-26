import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class FileHandling
{
  public static void main(String[] args) throws IOException 
  {
    int line=0,word=0,character=0;
    FileInputStream file=new FileInputStream("D:\\Zoho Task Programs\\FileHandling\\FileHandling.java");
    BufferedReader br=new BufferedReader(new FileReader("D:\\Zoho Task Programs\\FileHandling\\FileHandling.java"));
    String currentline=br.readLine();
    FileOutputStream nefile=new FileOutputStream("D:\\Zoho Task Programs\\FileHandling\\CopyofFile.java");
    int i;
    while((i=file.read())!=-1)
    {
      nefile.write((char)i);
    }
    nefile.close();
    while(currentline!=null)
    {
      line++;
      String words[]=currentline.split(" ");
      word+=words.length;
      for(String oneword: words)
      {
        character+=oneword.length();
      }
      currentline=br.readLine();
    }
    System.out.println(line+" "+word+" "+character);
   }
}
