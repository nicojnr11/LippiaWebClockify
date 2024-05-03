@Regression @Clockify @LogOut
  Feature: LogOut en clockify

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In

    @LogOutExitoso @Smoke
    Scenario: Log Out exitoso
      When clickeo el boton "AG"
      And clickeo el boton " Log out "
      Then se cierra mi sesion de clockify
