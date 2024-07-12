import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

@NonCPS
def call(String fileUrl, String fileName) {
    // Define the file path within the workspace
    def downloadFilePath = "${env.WORKSPACE}/${fileName}"

    // Use pipeline utility steps to download the file
    def fileDownloader = new URL(fileUrl).openStream()
    new File(downloadFilePath).withOutputStream { out ->
        out << fileDownloader
    }
    fileDownloader.close()

    echo "File downloaded successfully at ${downloadFilePath}"
}
