def call(Map config = [:]){
    sh "echo Hello ${config.name}, tody is ${config.day}"
}