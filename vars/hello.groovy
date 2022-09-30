def call(Map config = [:]){
    bat "echo Hello ${config.name}, tody is ${config.day}"
}
