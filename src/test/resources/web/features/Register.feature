@Regression @Register
Feature: Registrar una cuenta en clockify

Background: 
Given estoy en la url principal de clockify
And clickeo el boton "Sign Up Free"
And el sitio cambia a la seccion de sign up url "https://app.clockify.me/en/signup"

@RegistroExitosoEmail @Smoke
Scenario: Registro exitoso con email
When ingreso un e-mail valido
And acepto los terminos y condiciones
And clickeo sobre el boton "CONTINUE WITH EMAIL"
Then aparece un cartel pidiendo ingresar un codigo valido enviado al email

@RegistroExitosoGoogle
Scenario: Registro exitoso con cuenta de google
When acepto los terminos y condiciones
And clickeo sobre el boton "Continue with Google"
And elijo mi cuenta de Google
Then soy redirigido la pagina principal de clockify

@RegistroFallido @Smoke
Scenario Outline:Registro fallido 
When ingreso un e-mail <email> valido
And acepto los terminos y condiciones <checkbox>
And clickeo sobre el boton "CONTINUE WITH EMAIL"
Then se muestra el cartel <mensaje> 

Examples:
|email                            | checkbox          |mensaje                                  |
|garciaariadna139gmail.com        | seleccionado      | "Email format is not valid"             |
|garciaariadna139@gmail.com       | sin seleccionar   | "You must accept the terms of service"  |

@RegistroFallido 
Scenario:Registro fallido por email vacio
When ingreso un e-mail valido
And clickeo la checkbox de terminos y condiciones 
And borro el e-mail
And clickeo sobre el boton "CONTINUE WITH EMAIL"
Then se muestra el cartel "Email is required"
