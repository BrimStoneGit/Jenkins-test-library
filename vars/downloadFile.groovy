import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

@NonCPS
def call() {
   // URL of the file to download
    def fileUrl = 'https://ash-speed.hetzner.com/10GB.bin'

    // Define the file path within the workspace
    def downloadFilePath = "${env.WORKSPACE}/10GB.bin"

    // Use pipeline utility steps to download the file
    def fileDownloader = new URL(fileUrl).openStream()
    new File(downloadFilePath).withOutputStream { out ->
        out << fileDownloader
    }
    fileDownloader.close()

    echo "File downloaded successfully at ${downloadFilePath}"
}
