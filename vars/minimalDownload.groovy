def call() {
    // saving from url to a file (append)
    new File("note.xml") << new URL ("https://www.w3schools.com/xml/note.xml").getText()
}
