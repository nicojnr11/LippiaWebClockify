@Regression @LogIn 
Feature: Log In clockify

Background: 
Given estoy en la url principal de clockify
And clickeo el boton "Log in"
And el sitio cambia a la seccion de log in url "https://app.clockify.me/en/login"

@TestLogInExitoso @LogInManually @Smoke 
Scenario:Puedo loguearme manualmente con un e-mail y una contraseña 
When clickeo "Log in manually"
And ingreso un e-mail "garciaariadna139@gmail.com" y password validos "123456"
And clickeo el boton "Log in"
Then soy redirigido la pagina principal de clockify



@TestLogInFallido @LogInWhitEmail @Smoke
Scenario:No puedo loguearme con un email incorrecto
When ingreso un e-mail incorrecto "garciaariadna139gmail.com"
And clickeo el boton "Log in"
Then se muestra el cartel "Email format is not valid"

@TestLogInFallido @LogInManually @Smoke    
Scenario Outline: No puedo loguearme con credenciales incorrectas
When clickeo "Log in manually"
And ingreso un e-mail <email> y un password <password>
And clickeo el boton "Log in"
Then se muestra el cartel <mensaje>

Examples:
|email                          |password       |mensaje                         |
|garciaariadna139gmail.com      |123456         |"Email format is not valid"     |
|garciaariadna139@gmail.com     |123455         |"Invalid email or password"     |

@TestLogInFallido @LogInManually
Scenario:No puedo loguearme con un email valido pero escribo y borro mi password
When clickeo "Log in manually"
And ingreso un e-mail valido
And ingreso "123456" en password
And borro lo que escribi en password
And clickeo el boton "Log in"
Then se muestra el cartel "Password is required"

@TestLogInFallido @LogInManually
Scenario:No puedo loguearme con un email valido pero no tengo un password seteado
When clickeo "Log in manually"
And ingreso un e-mail valido y password "123456"
And clickeo el boton "Log in"
Then se muestra el cartel "This account doesn't have a password."

