@Regression @LogIn 
Feature: Log In clockify

Background: 
Given estoy en la landing page de clockify
And clickeo el boton "Log in"
And el sitio cambia a la seccion de log in

@TestLogInExitoso @LogInManually @Smoke 
Scenario:Me logueo manualmente con un e-mail y una contraseña validos
When clickeo el boton " Log in manually "
And ingreso un "email" y un "password"
And clickeo el boton "LOG IN"
Then soy redirigido la pagina principal de clockify


@TestLogInFallido @LogInManually @Smoke    
Scenario Outline: No puedo loguearme con credenciales incorrectas
When clickeo el boton "Log in manually"
And ingreso un e-mail <email> y un password <password>
And clickeo el boton "Log in"
Then se muestra el cartel <mensaje>

Examples:
|email                          |password       |mensaje                         |
|garciaariadna139gmail.com      |123456         |"Email format is not valid"     |
|garciaariadna139@gmail.com     |123455         |"Invalid email or password"     |

@TestLogInFallido @LogInManually
Scenario:No puedo loguearme con un email valido pero escribo y borro mi password
When clickeo el boton "Log in manually"
And ingreso un e-mail "garciaariadna139@gmail.com" y password "123456" ojo aca parametrizar

And borro lo que escribi en password
And clickeo el boton "Log in"
Then se muestra el cartel "Password is required"

@TestLogInFallido @LogInManually
Scenario:No tengo un password seteado
When clickeo el boton "Log in manually"
And ingreso un e-mail "garciaariadna139@gmail.com" y password "123456" PARAMETRIZAR
And clickeo el boton "Log in"
Then se muestra el cartel "This account doesn't have a password."

