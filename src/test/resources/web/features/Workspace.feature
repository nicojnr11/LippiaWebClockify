@Regression @NewWorkspace
Feature: Creo un nuevo Workspace

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In
    And clickeo el dropdown de workspaces
    And clickeo el boton " Manage "


  @NuevoWorkspaceExitoso @Smoke
Scenario: Creo un nuevo workspace
When clickeo el boton " Create new "
And nombro mi nuevo workspace "Espacio de trabajo"
And clickeo el boton " Create "
Then se crea un nuevo workspace

@NuevoWorkspaceFallido @Smoke
Scenario: Creacion un nuevo workspace fallido
When clickeo el boton "CREATE NEW WORKSPACE"
And nombro mi nuevo workspace "@"
Then se muestra el cartel "Workspace name has to be between 2 and 250 characters long"
