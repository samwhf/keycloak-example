# keycloak-example
## realm
## clients
settings > Valid Redirect URIs
http://localhost.charlesproxy.com:8180/auth/realms/test/protocol/openid-connect/auth?response_type=code&client_id=test-client&redirect_uri=http://localhost.charlesproxy.com:8081/sso/login&state=77c019b7-f7e4-4928-89e7-ee5e5714a1e5&login=true&scope=openid
keycloak会校验重定向地址和配置的是否一致，若不一致，请求失败，400 bad request, Invalid parameter: redirect_uri
## role
## user
## 认证过程

http://localhost.charlesproxy.com:8081/products 应答302
http://localhost.charlesproxy.com:8081/sso/login 应答302
http://localhost.charlesproxy.com:8180/auth/realms/test/protocol/openid-connect/auth?response_type=code&client_id=test-client&redirect_uri=http%3A%2F%2Flocalhost.charlesproxy.com%3A8081%2Fsso%2Flogin&state=5fb726ec-f20d-43ff-aaaf-9629f6d5b5fd&login=true&scope=openid
http://localhost.charlesproxy.com:8180/auth/realms/test/login-actions/authenticate?session_code=aCw2yn0e0lVO04fE7UJQRI0tvBoiS_RMQYrLu9LBTfM&execution=3572cee8-727e-41b8-8428-52369f9ca9a5&client_id=test-client&tab_id=Do_txuaXYBA
