@Regression @Clockify @LogOut
  Feature: LogOut en clockify

  Background:
    Given me encuentro el en home de usuarios logueado con una cuenta valida

    @LogOutExitoso @Smoke
    Scenario: Log Out exitoso
      When clickeo el boton superior derecho de "MiCuenta"
      And clickeo el boton "Log Out"
      Then se cierra mi sesion de clockify
