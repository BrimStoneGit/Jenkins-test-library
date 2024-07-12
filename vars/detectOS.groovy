def call() {
    if (System.properties['os.name'].toLowerCase().contains('windows')) {
        println "it's Windows"
    } else {
        println "it's not Windows"
    }
}
