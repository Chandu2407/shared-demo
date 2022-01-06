def call(ip,instanceid){
   sshagent([instanceid]) {
     sh "scp -o StrictHostKeyChecking=no target/*.war ubuntu@${ip}:/opt/tomcat/apache-tomcat-9.0.56/webapps/javademoproject.war"
                    sh "ssh ubuntu@${ip} /opt/tomcat/apache-tomcat-9.0.56/bin/shutdown.sh"
                    sh "ssh ubuntu@${ip} /opt/tomcat/apache-tomcat-9.0.56/bin/startup.sh"
                }
  echo "Deploy to tomcat on ip ${ip,instanceid}"
                
            }
