FROM tomcat

COPY ./src/tomcat-users.xml $CATALINA_HOME/conf/
COPY ./build/libs/diffytest-1.0.war $CATALINA_HOME/webapps/
