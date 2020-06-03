def call(body) {
  Map pipelineParams = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()

  pipeline {
    stages {
     stages() {
       steps { echo config.foo }
     } 
    }
  }
 
}