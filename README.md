# SpringJWT
1. Sign Up on the system
```
POST http://localhost:8080/users/sign_up
{
	"username":"aurelio",
	"password":"12345678"
}
```
------------------------------------------------
2. Sign In and get the access token
```
POST http://localhost:8080/login
{
	"username":"aurelio",
	"password":"12345678"
}
```
-----------------------------------------------
3. Consume the services
```
GET http://localhost:8080/users/public with Authorization Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhdXJlbGlvIiwiZXhwIjoxNTM2MjExNDUwfQ.391STVcE8TwURiAcUK4Hbaw2EqO3gEsJXWJnE_CQj9jBNhqG7jGLKgWqZl_1txLGhRLGAynPFiNJLUEodPtygA
```



