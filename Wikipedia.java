
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
//import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

    public class Wikipedia{  
        public static void main( String[] args ) throws IOException{  
                    Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Philosophy").get();  
                   System.out.println("document" + doc);
                    String title = doc.title();  
                    System.out.println("title is: " + title); 
                    Elements elts = doc.select("a[href]");
                   Elements media = doc.select("[src]");
                   Elements imports = doc.select("link[href]");
                    System.out.println("the all links are" + elts);
                    System.out.println("the all links are" + media);
                    System.out.println("the all links are" + imports);
        }
        
    }
                    

	


# Assignment_Locus
