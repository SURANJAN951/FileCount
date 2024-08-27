import java.io.File;

public class FileCount {
    public static void main(String[] args) {
        //ab ham check karenge ki kisi folder ke andar kitne file hai...
        int count=0;
        File f = new File("PwJava");
        String str1[]=f.list();
        for(String name:str1){
            count++;
            System.out.println(name);
        }

        //for example agar aapke C drive ke andar OneDrive ke andar Desktop pe jo javart naam
        //name ki file ke andar kon kon si files hai, vo dekhna chahte hai to app uska address
        //pass karke dekh sakte hai like-
        File f2=new File("C:\\Users\\91913\\OneDrive\\Desktop\\JAVART");
        int count2 = 0;
        String str2[]=f2.list();
        for(String name2:str2){
            count2++;
            System.out.println(name2);
        }

    }
}
