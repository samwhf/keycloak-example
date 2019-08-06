# keycloak-example
## realm
## clients
settings > Valid Redirect URIs
http://localhost.charlesproxy.com:8180/auth/realms/test/protocol/openid-connect/auth?response_type=code&client_id=test-client&redirect_uri=http://localhost.charlesproxy.com:8081/sso/login&state=77c019b7-f7e4-4928-89e7-ee5e5714a1e5&login=true&scope=openid
keycloak会校验重定向地址和配置的是否一致，若不一致，请求失败，400 bad request, Invalid parameter: redirect_uri
## role
## user
