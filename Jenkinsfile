pipeline {
   agent any
   stages {
    stage('Stage for Python'){
      when { changeset "app1/**"} //Will execute your steps if any file change inside of Python directory
            steps {
                echo 'Hello World from Bash'
                sh '''python3.8 example.sh'''
            }
    }

    stage('Stage for Java'){
        when { changeset "app2/**"} //Will execute your steps if any file change inside of Java directory
            steps {
                sh '''
                javac HelloWorld.java
                java HelloWorld'''
            }
    }

    stage('Stage for Bash'){
      when { changeset "app3/**"} //Will execute your steps if any file change inside of Bash directory
            steps {
                sh '''bash example.sh'''
            }
    }
  }
}