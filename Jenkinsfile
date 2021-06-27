pipeline {
   agent any
   stages {
    stage('Deploy Web app to Azure'){
      when { changeset "app1/**"} //Will execute your steps if any file change inside the component_a directory
            steps {
                echo 'Hello World from Bash'
                sh '''python3.8 example.sh"'''
            }
    }

    stage('Deploy API service to Azure portal'){
        when { changeset "app2/**"} //Will execute your steps if any file change inside the component_b directory
            steps {
                sh '''
                javac HelloWorld.java
                java HelloWorld"'''
            }
    }

    stage('Deploy Web app to Azure'){
      when { changeset "app3/**"} //Will execute your steps if any file change inside the component_a directory
            steps {
                echo 'Hello World from Bash'
                sh '''bash example.sh"'''
            }
    }
  }
}

