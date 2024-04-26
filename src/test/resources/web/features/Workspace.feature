@Regression @NewWorkspace
Feature: Creo un nuevo Workspace

Background: 
Given me encuentro el en home de usuarios logueado con una cuenta valida
And estoy en la url "https://app.clockify.me/workspaces"

@NuevoWorkspaceExitoso @Smoke
Scenario: Creo un nuevo workspace
When clickeo el boton "CREATE NEW WORKSPACE"
And nombro mi nuevo workspace "Espacio de trabajo"
And clickeo el boton "CREATE"
Then se crea un nuevo "workspace"

@NuevoWorkspaceFallido @Smoke
Scenario: Creacion un nuevo workspace fallido
When clickeo el boton "CREATE NEW WORKSPACE"
And nombro mi nuevo workspace "@"
Then se muestra el cartel "Workspace name has to be between 2 and 250 characters long"
