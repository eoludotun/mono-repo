pipeline {
   agent any
   
   
//        agent {
//         docker { image 'node:14-alpine' }
//     }
//     agent {
//         docker {
//             image 'node:14-alpine'
//             args '-p 3000:3000 -p 5000:5000'
//             args '-u 0:0'

//         }
//     }
   
   
   stages {
    stage('Stage for Python'){
      when { changeset "app1/**"} //Will execute your steps if any file change inside of Python directory
       
               agent { 
                docker { 
            
                    image "python3.10-nodejs16-alpine"
                }
            }

       
       
            steps {
                sh "ls"
                sh '''cd app1/
                      python3.8 example.sh'''
            }
    }

    stage('Stage for Java'){
        when { changeset "app2/**"} //Will execute your steps if any file change inside of Java directory
            steps {
                sh '''cd app2/
                      javac HelloWorld.java
                      java HelloWorld'''
            }
    }

    stage('Stage for Bash'){
      when { changeset "app3/**"} //Will execute your steps if any file change inside of Bash directory
            steps {
                sh '''cd app3/
                      bash example.sh'''
            }
    }
  }
}
