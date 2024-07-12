def call() {

    def workspace = env.WORKSPACE
    def fileName = "${workspace}/note.xml"
    
    // Ensure workspace is not null
    if (workspace == null) {
        throw new IllegalStateException("Workspace environment variable is not set.")
    }
    
    // saving from url to a file (append)
    new File(fileName) << new URL ("https://www.w3schools.com/xml/note.xml").getText()
}
