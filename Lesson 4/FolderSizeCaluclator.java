import java.io.File;


public class FolderSizeCaluclator{

    private static long sizeOfFolders = 0;
    public static void main(String[] args){
        String defaultPathName = "/Users/adobeuser/Downloads";
        String folder = "";
        if(args.length > 0)
            folder = args[0];
        else 
            folder = defaultPathName;


        calculateFilesSize(folder);
 }

    public static void calculateFilesSize(String folder){
        File directory = new File(folder);
        File[] allFiles = directory.listFiles();
        for(File currentFile : allFiles){
           if(currentFile.isDirectory())
                calculateFilesSize(folder + '/' + currentFile.getName());
            else if(currentFile.isFile()){
                sizeOfFolders += currentFile.length();
                System.out.println(sizeOfFolders);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    
            
            
        }
    }
}