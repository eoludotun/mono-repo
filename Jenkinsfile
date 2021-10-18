pipeline {
   agent any
   stages {
    stage('Stage for Python'){
      when { changeset "packages/app1/**"} //Will execute your steps if any file change inside of Python directory
            steps {
                sh "ls"
                sh '''cd packages/app1/
                      python3.8 example.sh'''
            }
    }

    stage('Stage for Java'){
        when { changeset "packages/app2/**"} //Will execute your steps if any file change inside of Java directory
            steps {
                sh '''cd packages/app2/
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
