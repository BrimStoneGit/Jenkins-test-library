import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

def call() {
    // Define the URL of the file to download
    def fileUrl = "https://ash-speed.hetzner.com/100MB.bin"
    
    // Define the name of the file to save locally
    def fileName = "downloads/100MB.bin"
    
    // Open a stream from the URL and save it to the file
    new URL(fileUrl).withInputStream { inputStream ->
        Files.copy(inputStream, Paths.get(fileName))
        println "File downloaded and saved as $fileName"
    }
}
