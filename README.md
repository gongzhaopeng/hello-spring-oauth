_**reference:**_  
https://projects.spring.io/spring-security-oauth/docs/oauth2.html  

_**authorization_code flow:**_  
http://localhost:8989/oauth/authorize?client_id=__SUNDIAL_CORE_CLIENT__&redirect_uri=https://www.baidu.com&response_type=code&state=Di4zM1
http://localhost:8989/oauth/token?grant_type=authorization_code&code=${CODE}&client_id=__SUNDIAL_CORE_CLIENT__&client_secret=${CLIENT_SECRET}&redirect_uri=https://www.baidu.com

_**refresh_token flow:**_  
http://localhost:8989/oauth/token?grant_type=refresh_token&refresh_token=${REFRESH_TOKEN}&client_id=__SUNDIAL_CORE_CLIENT__&client_secret=${CLIENT_SECRET}

_**password flow:**_  
http://localhost:8989/oauth/token?username=13810454607&password=${PASSWORD}&grant_type=password&scope=client:inner&client_id=__SUNDIAL_CORE_CLIENT__&client_secret=${CLIENT_SECRET}

_**client_credentials:**_ 
http://localhost:8989/oauth/token?grant_type=client_credentials&client_id=__SUNDIAL_CORE_CLIENT__&client_secret=${CLIENT_SECRET}

_**check token:**_  
http://localhost:8989/oauth/check_token?token=${TOKEN}