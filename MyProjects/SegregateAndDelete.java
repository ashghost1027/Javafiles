import java.io.File;

public class SegregateAndDelete{
    public void segregateExtention(){
        String downloadPath = "Home/Downloads";
         File directory = new File(downloadPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    String fileExtension = getFileExtension(fileName);

                    if (isImageExtension(fileExtension)) {
                        System.out.println(fileName + " is an image file.");
                        // Perform actions for image files
                    } else {
                        System.out.println(fileName + " is not an image file.");
                        // Perform actions for non-image files
                    }
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }

    public static String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return "";
    }

    public static boolean isImageExtension(String extension) {
        String[] imageExtensions = { "jpg", "jpeg", "png", "gif", "bmp","pdf","webp" }; // Add more image extensions as needed
        for (String ext : imageExtensions) {
            if (ext.equals(extension)) {
                return true;
            }
        }
        return false;
    }
    public static void deleteFile(String file){
               String filePath = "path/to/file"; // Replace this with the actual path of the file you want to delete

        File fileToDelete = new File(filePath);

        // Check if the file exists
        if (fileToDelete.exists()) {
            // Delete the file
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully: " + filePath);
            } else {
                System.out.println("Failed to delete the file: " + filePath);
            }
        } else {
            System.out.println("File not found: " + filePath);
        }
    }
    public static void main(String[] args) {
        // SegregateAndDelete segdel = new SegregateAndDelete();

    }
}
    
