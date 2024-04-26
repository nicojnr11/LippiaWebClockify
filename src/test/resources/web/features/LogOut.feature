@Regression @Clockify @LogOut
  Feature: LogOut en clockify

  Background:
    Given me encuentro el en home de usuarios logueado con una cuenta valida

    @LogOutExitoso @Smoke
    Scenario: Log Out exitoso
      When estoy en la seccion de pantalla principal
      And clickeo el boton "My Account"
      And clickeo el boton "Log Out"
      Then se cierra mi sesion de clockify
